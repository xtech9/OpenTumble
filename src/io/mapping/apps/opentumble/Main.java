package io.mapping.apps.opentumble;

public class Main {
	public static void main(String... args) {
		KeyNetworkFactory keyNetworkFactory = new ProdNetKeyNetworkFactory();
		keyNetworkFactory.setEcKeyCreator(RandomEcKeyCreator.getCreator());
		keyNetworkFactory.createKey();

		System.out.println(keyNetworkFactory.getEcKey().toStringWithPrivate());

//		KeyNetworkFactory keyNetworkFactory = KeyNetworkFactory.createKey();
//		ECKey ecKey = keyNetworkFactory.getEcKey();
//
//		String publicKey = new String(ecKey.getPubKey());
//		String privateKey = new String(ecKey.getPrivKeyBytes());
//
//		Address address = ecKey.toAddress(keyNetworkFactory.getNetworkParameters());
//
//		System.out.println("KeyNetworkFactory:\t" + ecKey.toStringWithPrivate());
//		System.out.println("KeyNetworkFactory hash:\t" + new String(ecKey.getPubKeyHash()));
//		System.out.println("Address:\t" + address.toString());
//		System.out.println("Public:\t" + publicKey);
//		System.out.println("Private:\t" + privateKey);
	}
}
