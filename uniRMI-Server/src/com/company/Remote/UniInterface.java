package com.company.Remote;

import java.rmi.Remote;

public interface UniInterface extends Remote {

    void payment(String cost) throws Exception;
    void unit(String lesson) throws Exception;
}
