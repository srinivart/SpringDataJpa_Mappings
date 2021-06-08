package com.srinivart.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name="BRANCH_ID")
    private int bid;

    @Column(name="BRANCH_NAME")
    private String bname;

    @Column(name="BRANCH_SHORT_NAME")
    private String sname;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Subject> subjects = new HashSet<>();


    public Branch() {

    }

    public Branch(String bname, String sname) {
        this.bname = bname;
        this.sname = sname;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}
