package com.srinivart.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name= "customer_item",
            joinColumns = { @JoinColumn(name = "customer_id")},
            inverseJoinColumns = { @JoinColumn(name="item_name")}
    )
    private Set<Item> itemsSet= new HashSet<>();


    public Customer(){
    }

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


    public Set<Item> getItemsSet() {
        return itemsSet;
    }

    public void setItemsSet(Set<Item> itemsSet) {
        this.itemsSet = itemsSet;
    }
}
