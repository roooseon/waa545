/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.controller;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("paymentBean")
@SessionScoped
public class PaymentBean implements Serializable {

    private double amount;
    private CreditCard card = new CreditCard("");
    private Date date = new Date();

    public void setAmount(double newValue) {
        amount = newValue;
    }

    public double getAmount() {
        return amount;
    }

    public void setCard(CreditCard newValue) {
        card = newValue;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setDate(Date newValue) {
        date = newValue;
    }

    public Date getDate() {
        return date;
    }

    public String resultAction() {
        return "result" + "?faces-redirect=true";
    }

    public String backAction() {
        return "index" + "?faces-redirect=true";
    }
}
