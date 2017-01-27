/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datatable.controller;

import java.io.Serializable;

public class Name implements Serializable {
    private String first;
    private String last;
    private boolean editable;
    
    public Name() {}
    
    public Name(String first, String last) {
        this.first =  first;
        this.last = last;
    }
    
    public String getFirst() {
        return first;
    }

    public boolean getEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
    
    
}
