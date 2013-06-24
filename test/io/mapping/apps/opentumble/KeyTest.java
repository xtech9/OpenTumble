package io.mapping.apps.opentumble;

import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.NetworkParameters;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class KeyTest {

	private static Key mKey;

	/**
	 * Instantiates a default key for testing.
	 *
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		mKey = Key.createKey();
	}

	/**
	 * Tests that {@link Key}s are created normally. Keys are instantiated with a backing {@link ECKey},
	 * so this method ensures their backing key isn't null. This method also instantiates a new key backed by the
	 * TestNet, and checks that the result of the instantiation is still not null.
	 *
	 * @throws Exception
	 */
	@Test
	public void testCreateKey() throws Exception {
		assertNotNull(mKey);

		mKey = Key.createKey(NetworkParameters.testNet());
		assertNotNull(mKey);
	}

	/**
	 * Ensures that we can get a backing {@link ECKey} out of a {@link Key}.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetKey() throws Exception {
		ECKey ecKey = mKey.getKey();
		assertNotNull(ecKey);
	}

	/**
	 * Ensures that the {@link NetworkParameters} of the instantiated keys are not null, either in the default object
	 * instantiation, or when instantiating with non-default network parameters (e.g., on the test net).
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetNetworkParameters() throws Exception {
		assertNotNull(mKey.getNetworkParameters());
		assertEquals(NetworkParameters.prodNet(), mKey.getNetworkParameters());

		mKey = Key.createKey(NetworkParameters.testNet());
		assertNotNull(mKey.getNetworkParameters());
		assertEquals(mKey.getNetworkParameters(), NetworkParameters.testNet());
	}


}
