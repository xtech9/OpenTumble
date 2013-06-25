package io.mapping.apps.opentumble;

import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.NetworkParameters;

public class Key {
	protected ECKey mEcKey;
	protected NetworkParameters mNetworkParameters;

	public ECKey getEcKey() {
		return mEcKey;
	}

	public void setEcKey(ECKey ecKey) {
		mEcKey = ecKey;
	}

	public NetworkParameters getNetworkParameters() {
		return mNetworkParameters;
	}

	public void setNetworkParameters(NetworkParameters networkParameters) {
		mNetworkParameters = networkParameters;
	}
}
