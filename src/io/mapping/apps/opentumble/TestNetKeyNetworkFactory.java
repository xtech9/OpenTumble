package io.mapping.apps.opentumble;

import com.google.bitcoin.core.NetworkParameters;

/**
 * Defines a {@link KeyNetworkFactory} producing keys on the test network.
 */
public class TestNetKeyNetworkFactory extends KeyNetworkFactory {
	@Override
	public Key createKey() {
		Key key = new Key();

		key.setEcKey(mEcKeyCreator.createEcKey());
		key.setNetworkParameters(NetworkParameters.testNet());

		return key;
	}
}
