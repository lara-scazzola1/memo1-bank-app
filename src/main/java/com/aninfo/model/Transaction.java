package com.aninfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long cbu;

    private String type;

    private Double amount;

    public Transaction() {
    }

    public Transaction(double amount) {
        this.amount = amount;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) { this.cbu = cbu; }

    public Long get_id() { return id; }

    public void set_id(Long id) {
        this.id = id;
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public Double getAmount() { return amount; }

    public void setAmount(Double amount) { this.amount = amount; }
}
