package io.mapping.apps.opentumble;

import com.google.bitcoin.core.NetworkParameters;

/**
 * Defines a key on the test network.
 */
public class TestNetKeyNetworkFactory extends KeyNetworkFactory {
	@Override
	public void createKey() {
		setEcKey(mEcKeyCreator.createEcKey());
		setNetworkParameters(NetworkParameters.testNet());
	}
}
