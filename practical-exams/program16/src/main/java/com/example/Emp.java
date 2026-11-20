package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Emp {
    @Autowired @Qualifier("temp2")
    private Address address;
    public Address getAddress(){return address;}
}
