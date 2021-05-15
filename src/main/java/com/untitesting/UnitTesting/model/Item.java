package com.untitesting.UnitTesting.model;

public class Item {

    private  int quantity;
    private  String name;
    private  int price;
    private  int id;

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
