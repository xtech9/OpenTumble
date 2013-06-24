package io.mapping.apps.opentumble;

import com.google.bitcoin.core.NetworkParameters;

/**
 * Defines a key on the production network.
 */
public class ProdNetKeyNetworkFactory extends KeyNetworkFactory {
	@Override
	public void createKey() {
		setEcKey(mEcKeyCreator.createEcKey());
		setNetworkParameters(NetworkParameters.prodNet());
	}
}
