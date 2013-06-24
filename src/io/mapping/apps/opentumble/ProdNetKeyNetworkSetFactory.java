package io.mapping.apps.opentumble;

import java.util.HashSet;
import java.util.Set;

public class ProdNetKeyNetworkSetFactory extends KeyNetworkSetFactory {
	@Override
	public Set<? extends KeyNetworkFactory> createSet(int size) {
		if (mKeyNetworkFactories == null) {
			mKeyNetworkFactories = new HashSet<ProdNetKeyNetworkFactory>(size);
		}

		return mKeyNetworkFactories;
	}
}
