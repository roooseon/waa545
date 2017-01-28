/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.controller;

import java.io.Serializable;

public class CreditCard implements Serializable {

    private String number;

    public CreditCard(String number) {
        this.number = number;
    }

    public String toString() {
        return number;
    }
}
