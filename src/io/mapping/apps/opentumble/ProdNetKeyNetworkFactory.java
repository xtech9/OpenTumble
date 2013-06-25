package io.mapping.apps.opentumble;

import com.google.bitcoin.core.NetworkParameters;

/**
 * Defines a {@link KeyNetworkFactory} producing keys on the production network.
 */
public class ProdNetKeyNetworkFactory extends KeyNetworkFactory {
	@Override
	public Key createKey() {
		Key key = new Key();

		key.setEcKey(mEcKeyCreator.createEcKey());
		key.setNetworkParameters(NetworkParameters.prodNet());

		return key;
	}
}
