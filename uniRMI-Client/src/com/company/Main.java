package com.company;

import com.company.Remote.UniInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        String cost, accept, lesson;
        try {
            UniInterface uniInterface = (UniInterface) Naming.lookup("//localhost/university");
            System.out.println("1.Pay Cost of term");
            System.out.println("2.Select Unit");
            choose = input.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("Your cost is 19,523,300 Rial");
//                    System.out.println("*Please write cost to pay");
//                    cost = input.next();
//                    System.out.println("DO YOU ACCEPT?(y/n)");
//                    accept = input.next();
                    while (true) {
                        System.out.println("*Please write cost to pay");
                        cost = input.next();
                        System.out.println("DO YOU ACCEPT?(y/n)");
                        accept = input.next();
                        if (accept.equals("y")) {
                            break;
                        } else {
                            System.out.println("\t*Check your cost*");
                        }
                    }
                    System.out.println("\tCost payed successfully.");
                    uniInterface.payment(cost);
                    break;
                }
                case 2: {
//                    System.out.println("Write your lessons");
//                    lesson = input.next();
                    while (true) {
                        System.out.println("Write your lessons");
                        lesson = input.next();
                        System.out.println("DO YOU ACCEPT?(y/n)");
                        accept = input.next();
                        if (accept.equals("y")) {
                            break;
                        }
                    }
                    System.out.println("\tLessons picked successfully.");
                    uniInterface.unit(lesson);
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
