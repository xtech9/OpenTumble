package io.mapping.apps.opentumble;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static junit.framework.Assert.assertNotNull;

public class ProdNetKeyNetworkSetFactoryTest {
	private KeyNetworkSetFactory mKeyNetworkSetFactory;

	@Before
	public void setUp() throws Exception {
		mKeyNetworkSetFactory = new ProdNetKeyNetworkSetFactory();
		assertNotNull(mKeyNetworkSetFactory);
	}

	@Test
	public void testCreateSet() throws Exception {
		Set<ProdNetKeyNetworkFactory> set = (Set<ProdNetKeyNetworkFactory>) mKeyNetworkSetFactory.createSet(1);
		assertNotNull(set);
	}
}
