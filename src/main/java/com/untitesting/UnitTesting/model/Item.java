package com.untitesting.UnitTesting.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private  int quantity;
    private  String name;
    private  int price;
    @Id
    private  int id;

    @Transient
    private int value;

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public Item(int id, String name, int price, int quantity) {
        this.id=id;
        this.name= name;
        this.price = price;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
