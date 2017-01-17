/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab1.service;

/**
 *
 * @author ramesh
 */
public class Authenticate {

    public String checkAuthenticate(String username, String password) {
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("test123")) {
            return "success";
        } else {
            return "failure";
        }
    }
}
