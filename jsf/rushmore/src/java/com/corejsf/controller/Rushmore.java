/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.controller;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.Serializable;
import java.util.Map;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named
@SessionScoped
public class Rushmore implements Serializable {
    private String outcome = null;
    
    private final Rectangle washingtonRect = new Rectangle(70, 30, 40, 40);
    private final Rectangle jeffersonRect = new Rectangle(115, 45, 40, 40);
    private final Rectangle rooseveltRect = new Rectangle(135, 65, 40, 40);
    private final Rectangle lincolnRect = new Rectangle(175, 62, 40, 40);
    
    public void handleMouseClick(ActionEvent e) {
        FacesContext context = FacesContext.getCurrentInstance();
        String clientId = e.getComponent().getClientId(context);
        Map<String, String> requestParams = context.getExternalContext().getRequestParameterMap();
        
        int x = Integer.parseInt((String) requestParams.get(clientId + ".x"));
        int y =  Integer.parseInt((String) requestParams.get(clientId + ".y"));
        
        outcome =  null;
        if (washingtonRect.contains(new Point(x, y))) {
            outcome = "washington";
        }
        
        if (jeffersonRect.contains(new Point(x, y))) {
            outcome = "jefferson";
        }
        
        if (rooseveltRect.contains(new Point(x, y))) {
            outcome = "roosevelt";
        }
        
        if(lincolnRect.contains(new Point(x, y))) {
            outcome = "lincoln";
        }
    }
    public String navigate() {
        return outcome + "?faces-redirect=true";
    }
    
    public String homeAction() {
        return "index" + "?faces-redirect=true";
    }
}
