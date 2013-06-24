package io.mapping.apps.opentumble;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static junit.framework.Assert.assertNotNull;

public class TestNetKeyNetworkSetFactoryTest {
	private KeyNetworkSetFactory mKeyNetworkSetFactory;

	@Before
	public void setUp() throws Exception {
		mKeyNetworkSetFactory = new TestNetKeyNetworkSetFactory();
		assertNotNull(mKeyNetworkSetFactory);
	}

	@Test
	public void testCreateSet() throws Exception {
		Set<TestNetKeyNetworkFactory> set = (Set<TestNetKeyNetworkFactory>) mKeyNetworkSetFactory.createSet(1);
		assertNotNull(set);
	}
}
