package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import interfaces.Icd;

public class IcdServer {

	public static void main(String[] args) throws RemoteException {
		System.setProperty("java.security.policy", "./securityConfig.txt");
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}

		try {
			System.setProperty("java.rmi.server.hostname", "localhost");
			Icd icdStub = (Icd) UnicastRemoteObject.exportObject(new IcdImp(), 5711);
			Registry registry = LocateRegistry.createRegistry(5711);
			registry.rebind("IcdObj", icdStub);

		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
