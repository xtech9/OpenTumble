package io.mapping.apps.opentumble;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String... args) {
		KeyNetworkFactory keyNetworkFactory = new ProdNetKeyNetworkFactory();
		keyNetworkFactory.setEcKeyCreator(RandomEcKeyCreator.getCreator());

		Set<Key> keys = new HashSet<Key>();
		for (int i = 0; i < 10; i++) {
			keys.add(keyNetworkFactory.createKey());
		}

		for (Iterator<Key> keyIterator = keys.iterator(); keyIterator.hasNext(); ) {
			Key nextKey = keyIterator.next();

			System.out.println(nextKey.getEcKey().toStringWithPrivate());
			System.out.println("Address:" + nextKey.getEcKey().toAddress(nextKey.getNetworkParameters()).toString());
		}
	}
}
