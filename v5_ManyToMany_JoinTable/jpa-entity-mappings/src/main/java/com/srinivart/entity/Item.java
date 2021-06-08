package com.srinivart.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Item {

    @Id
    private String name;
    private int price;


    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "itemsSet")
    private Set<Customer> customersSet = new HashSet<>();


    public Item(){
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Set<Customer> getCustomersSet() {
        return customersSet;
    }

    public void setCustomersSet(Set<Customer> customersSet) {
        this.customersSet = customersSet;
    }

    public void addAllCustomers(Set<Customer> customersSet){
        customersSet.addAll(customersSet);
    }
}


