package com.company;

import com.company.Remote.UniInterface;

import java.rmi.server.UnicastRemoteObject;

public class UniImplementor extends UnicastRemoteObject implements UniInterface {

    public UniImplementor() throws Exception{}

    @Override
    public void payment(String cost) throws Exception {
        System.out.println("\tCost Payed successfully!");
    }

    @Override
    public void unit(String lesson) throws Exception {
        System.out.println("\tLessons Accepted!");
    }
}
