package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import interfaces.Icd;

public class IcdClient {

	public static void main(String[] args) {
		String icdCode;
		System.setProperty("java.security.policy", "./securityConfig.txt");
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		try {
			Registry registry = LocateRegistry.getRegistry(5711);
			Icd icdCatalog = (Icd) registry.lookup("IcdObj");

			icdCode = "F81.9";

			System.out.println(icdCatalog.getText(icdCode));

			icdCode = "B85.3";
			System.out.println(icdCatalog.getText(icdCode));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
