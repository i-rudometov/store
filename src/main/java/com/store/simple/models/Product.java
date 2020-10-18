package com.store.simple.models;

import javax.persistence.*;

@Entity
@Table(name = "TBL_PRODUCTS")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;

    protected Product() {}

    public Product(String name) {
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

    @Override
    public String toString() {
        return String.format("Product[id=%d, name=%s,]", id, name);
    }
}
