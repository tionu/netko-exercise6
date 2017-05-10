package server;

import java.rmi.RemoteException;
import java.util.HashMap;

import interfaces.Icd;

public class IcdImp implements Icd {

	HashMap<String, String> icdCatalog;

	public IcdImp() {
		super();
		this.icdCatalog = loadICD();
	}

	public String getText(String code) throws RemoteException {

		return icdCatalog.get(code);

	}

	private HashMap<String, String> loadICD() {

		icdCatalog = new HashMap<>();

		icdCatalog.put("F81.9", "Wissenserwerbst�rung");
		icdCatalog.put("R19.1", "Abnorme Darmger�usche");
		icdCatalog.put("B85.3", "Filzl�usebefall");
		icdCatalog.put("F13.2", "Schlafmittelsucht");
		icdCatalog.put("H57.0", "Mydriasis");

		return icdCatalog;
	}

}
