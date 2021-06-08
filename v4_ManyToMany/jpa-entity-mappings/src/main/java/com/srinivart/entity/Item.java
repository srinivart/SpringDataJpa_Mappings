package com.srinivart.entity;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    private String name;
    private int price;


    public Item(){
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }



}


