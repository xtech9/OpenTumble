package io.mapping.apps.opentumble;

import java.util.Set;

public abstract class KeyNetworkSetFactory {
	protected Set<? extends KeyNetworkFactory> mKeyNetworkFactories;

	public abstract Set<? extends KeyNetworkFactory> createSet(int size);
}
