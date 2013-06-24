package io.mapping.apps.opentumble;

import com.google.bitcoin.core.ECKey;

import java.util.Random;

/**
 * Defines an interface for defining algorithms to create {@link ECKey}s. Implements the Strategy Pattern to separate
 * the creation of keys from the objects that need keys created.
 */
public interface EcKeyCreator {
	static final int KEY_BIT_LENGTH = 256;
	static Random sRandom = new Random();

	public ECKey createEcKey();
}
