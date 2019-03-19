package com.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class server {
    public static void main(String[] args){
        //rmi
        try {
            remoteBriefNews rbn = new remoteBriefNewsImpl();
            LocateRegistry.createRegistry(6600);
            Naming.rebind("rmi://127.0.0.1:6600/remotebreifnews", rbn);

            System.out.println("服务器启动成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
