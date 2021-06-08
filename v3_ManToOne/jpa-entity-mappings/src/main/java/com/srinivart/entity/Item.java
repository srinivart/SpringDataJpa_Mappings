package com.srinivart.entity;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    private String name;
    private int price;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Item(){
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setName(String name) {
        this.name = name;
    }

}


