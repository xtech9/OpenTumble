package io.mapping.apps.opentumble;

import java.util.HashSet;
import java.util.Set;

public class TestNetKeyNetworkSetFactory extends KeyNetworkSetFactory {
	@Override
	public Set<? extends KeyNetworkFactory> createSet(int size) {
		if (mKeyNetworkFactories == null) {
			mKeyNetworkFactories = new HashSet<TestNetKeyNetworkFactory>(size);
		}

		return mKeyNetworkFactories;
	}
}
