package io.mapping.apps.opentumble;

import com.google.bitcoin.core.ECKey;

import java.math.BigInteger;

/**
 * Implements {@link EcKeyCreator} to generate random {@link ECKey}s.
 */
public class RandomEcKeyCreator implements EcKeyCreator {
	private static RandomEcKeyCreator CREATOR;

	private RandomEcKeyCreator() {}

	public static final synchronized RandomEcKeyCreator getCreator() {
		if (CREATOR == null) {
			CREATOR = new RandomEcKeyCreator();
		}

		return CREATOR;
	}

	@Override
	public ECKey createEcKey() {
		BigInteger randomPrivateKey = new BigInteger(KEY_BIT_LENGTH, sRandom);
		ECKey key = new ECKey(randomPrivateKey);
		return key;
	}
}
