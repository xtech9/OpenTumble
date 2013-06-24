package io.mapping.apps.opentumble;


import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.NetworkParameters;

import java.math.BigInteger;
import java.util.Random;

public class Key {
	private static final int KEY_BIT_LENGTH = 256;
	private static Random sRandom = new Random();

	private ECKey mKey;
	private NetworkParameters mNetworkParameters;

	/**
	 * Prevents direct instantiation.
	 */
	private Key() {
	}

	/**
	 * Instantiates a new {@link Key} in the ProdNet, based on {@link ECKey}.
	 *
	 * @param key the {@link ECKey} which should be used
	 */
	private Key(ECKey key) {
		this(NetworkParameters.prodNet(), key);
	}

	/**
	 * Instantiates a new {@link Key} with {@link NetworkParameters}, based on {@link ECKey}
	 *
	 * @param networkParameters the {@link NetworkParameters} for the new key
	 * @param ecKey             the {@link ECKey} on which this key should be used
	 */
	private Key(NetworkParameters networkParameters, ECKey ecKey) {
		mNetworkParameters = networkParameters;
		mKey = ecKey;
	}

	/**
	 * Creates a new {@link ECKey} based on a random {@link BigInteger}.
	 *
	 * @return a new {@link ECKey}
	 */
	private static ECKey getRandomECKey() {
		BigInteger randomPrivateKey = new BigInteger(KEY_BIT_LENGTH, sRandom);
		ECKey key = new ECKey(randomPrivateKey);
		return key;
	}

	/**
	 * Provides a static factory for generating {@link Key}s.
	 *
	 * @return a new instance of an {@link Key}
	 */
	public static Key createKey() {
		return createKey(NetworkParameters.prodNet());
	}

	public static Key createKey(NetworkParameters networkParameters) {
		ECKey randomECKey = getRandomECKey();
		return new Key(networkParameters, randomECKey);
	}

	/**
	 * Returns the internal {@link ECKey} of the {@link Key}
	 *
	 * @return an instance of {@link ECKey}
	 */
	public ECKey getKey() {
		return mKey;
	}

	/**
	 * Returns the internal {@link NetworkParameters} of the {@link Key}
	 *
	 * @return an instance of {@link NetworkParameters}
	 */
	public NetworkParameters getNetworkParameters() {
		return mNetworkParameters;
	}

	@Override
	public String toString() {
		//String address = mKey.toAddress(mNetworkParameters);

		return super.toString();    //To change body of overridden methods use File | Settings | File Templates.
	}
}
