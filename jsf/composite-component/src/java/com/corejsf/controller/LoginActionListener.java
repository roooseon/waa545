/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.controller;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 *
 * @author ramesh
 */
public class LoginActionListener implements ActionListener{

    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        UIComponent container = event.getComponent().getNamingContainer();
        String name = (String) ((UIInput)
                            container.findComponent("form:name")).getValue();
        
        String pwd = (String) ((UIInput)
                            container.findComponent("form:password")).getValue();
        
        if (Registrar.isRegistered(name, pwd)) {
            return ;
        }
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(container.getClientId(), 
                new FacesMessage("Name and Password are invalid.Please try again."));
        throw new AbortProcessingException("Invalid credentials");
    }
    
}
