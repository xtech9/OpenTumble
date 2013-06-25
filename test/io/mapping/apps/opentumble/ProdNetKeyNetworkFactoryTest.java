package io.mapping.apps.opentumble;

import com.google.bitcoin.core.ECKey;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class ProdNetKeyNetworkFactoryTest {
	private KeyNetworkFactory mKeyNetworkFactory;

	@Before
	public void setUp() throws Exception {
		mKeyNetworkFactory = new ProdNetKeyNetworkFactory();
		assertNotNull(mKeyNetworkFactory);
	}

	@Test(expected = NullPointerException.class)
	public void testCreateKeyNullCreator() {
		mKeyNetworkFactory.createKey();
	}

	@Test
	public void testCreateKey() throws Exception {
		mKeyNetworkFactory.setEcKeyCreator(new EcKeyCreator() {
			@Override
			public ECKey createEcKey() {
				return new ECKey();
			}
		});
		assertNotNull(mKeyNetworkFactory.getEcKeyCreator());

		Key key = mKeyNetworkFactory.createKey();
		assertNotNull(key);
		assertNotNull(key.getEcKey());
		assertNotNull(key.getNetworkParameters());
	}
}
