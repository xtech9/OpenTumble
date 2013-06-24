package io.mapping.apps.opentumble;

import com.google.bitcoin.core.Address;
import com.google.bitcoin.core.ECKey;

public class Main {
	public static void main(String... args) {
		Key key = Key.createKey();
		ECKey ecKey = key.getKey();

		String publicKey = new String(ecKey.getPubKey());
		String privateKey = new String(ecKey.getPrivKeyBytes());

		Address address = ecKey.toAddress(key.getNetworkParameters());

		System.out.println("Key:\t" + ecKey.toStringWithPrivate());
		System.out.println("Key hash:\t" + new String(ecKey.getPubKeyHash()));
		System.out.println("Address:\t" + address.toString());
		System.out.println("Public:\t" + publicKey);
		System.out.println("Private:\t" + privateKey);
	}
}
