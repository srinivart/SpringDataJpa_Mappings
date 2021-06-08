package com.srinivart.entity;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Item item;




    public Customer(String name) {
        this.name = name;
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
