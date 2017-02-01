/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramesh
 */
public class Registrar {

    private static List<UserBean> registeredUser = new ArrayList<>();

    static {
        registeredUser.add(new UserBean("ramesh", "test123"));
    }

    public static void register(String name, String password) {
        registeredUser.add(new UserBean(name, password));
    }

    public static boolean isRegistered(String name, String password) {

        return registeredUser.stream().anyMatch((user) -> (user.getName().equals(name) && user.getPassword().equals(password)));
    }
}
