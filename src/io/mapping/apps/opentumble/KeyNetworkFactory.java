package io.mapping.apps.opentumble;


import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.NetworkParameters;

/**
 * Defines a generic {@link KeyNetworkFactory}, i.e., a combination of network and key (and key-generation
 * capabilities). Implements the Factory Method pattern to defer instantiation details to implementations (subclasses).
 */
public abstract class KeyNetworkFactory {
	protected ECKey mEcKey;
	protected NetworkParameters mNetworkParameters;
	protected EcKeyCreator mEcKeyCreator;

	/**
	 * Provides a static simple factory for generating {@link KeyNetworkFactory}s.
	 *
	 * @return a new {@link KeyNetworkFactory}
	 */
	public abstract void createKey();

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

	public EcKeyCreator getEcKeyCreator() {
		return mEcKeyCreator;
	}

	public void setEcKeyCreator(EcKeyCreator ecKeyCreator) {
		mEcKeyCreator = ecKeyCreator;
	}
}
