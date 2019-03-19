package com.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface remoteBriefNews extends Remote {
    List<String> getBriefNews() throws RemoteException;
    String helloworld() throws RemoteException;
}
