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
    private String amount;
    private String card = "";
    private Date date = new Date();

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public String resultAction() {
        return "result" + "?faces-redirect=true";
    }
    
    public String backAction() {
        return "index" + "?faces-redirect=true";
    }
}
