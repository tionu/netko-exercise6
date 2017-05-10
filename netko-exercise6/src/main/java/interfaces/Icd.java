package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Icd extends Remote {

	public String getText(String code) throws RemoteException;

}
