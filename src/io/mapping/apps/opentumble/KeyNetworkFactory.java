package io.mapping.apps.opentumble;

/**
 * Defines a generic mechanism for constructing {@link Key}s.
 */
public abstract class KeyNetworkFactory {
	protected EcKeyCreator mEcKeyCreator;

	public EcKeyCreator getEcKeyCreator() {
		return mEcKeyCreator;
	}

	public void setEcKeyCreator(EcKeyCreator ecKeyCreator) {
		mEcKeyCreator = ecKeyCreator;
	}

	public abstract Key createKey();
}
