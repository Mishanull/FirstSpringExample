package com.example.demo;

import org.springframework.data.annotation.Id;

import javax.annotation.Generated;

public class Order {
    @Id
    int id;
    float amount;
    String description;
    boolean delivered;

    public Order() {
    }

    public Order(float amount, String description, boolean delivered) {
        this.amount = amount;
        this.description = description;
        this.delivered = delivered;
    }

    public Order(int id, float amount, String description, boolean delivered) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.delivered = delivered;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
}
