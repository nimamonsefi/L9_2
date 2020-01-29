package com.company;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            UniImplementor uniImplementor = new UniImplementor();
            Naming.rebind("university",uniImplementor);
            System.out.println("Server is up & pending .....");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
