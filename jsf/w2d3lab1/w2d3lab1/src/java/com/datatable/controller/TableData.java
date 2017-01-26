/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datatable.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("tableData")
@SessionScoped
public class TableData implements Serializable{
    private List<Name> names = new ArrayList<>();
    
    public TableData() {
        names.add(new Name("William", "Dupont"));
        names.add(new Name("Anna", "Keeney"));
        names.add(new Name("Mariko", "Randor"));
        names.add(new Name("John", "Wilson"));
    }
    
    public List<Name> getNames() {
        return this.names;
    }
}
