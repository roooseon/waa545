/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;

@Named("bb")
@SessionScoped
public class BackingBean implements Serializable {

    private String day;
    private String month;
    private String year;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void validateDate(ComponentSystemEvent event) {
        UIComponent source = event.getComponent();
        UIInput dayInput = (UIInput) source.findComponent("day");
        UIInput monthInput = (UIInput) source.findComponent("month");
        UIInput yearInput = (UIInput) source.findComponent("year");

        int d = Integer.parseInt(dayInput.getLocalValue().toString());
        int m = Integer.parseInt(monthInput.getLocalValue().toString());
        int y = Integer.parseInt(yearInput.getLocalValue().toString());

        if (!isValidDate(d, m, y)) {
            FacesMessage message = com.corejsf.util.Messages.getMessage(
                    "com.corejsf.messages", "invalidDate", null);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(source.getClientId(), message);
            context.renderResponse();
        }

    }

    public static boolean isValidDate(int d, int m, int y) {
        if (d < 1 || m < 1 || m > 12) {
            return false;
        }

        switch (m) {
            case 2:
                if (isLeapYear(y)) {
                    return d <= 29;
                } else {
                    return d <= 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return d <= 30;
            default:
                return d <= 31;
        }

    }

    private static boolean isLeapYear(int y) {
        return y % 4 == 0 && (y % 400 == 0 || y % 100 == 0);
    }

    public String submitAction() {
        return "result" + "?faces-redirect=true";
    }

    public String indexAction() {
        return "index" + "?faces-redirect=true";
    }
    public String enterDateAction() {
        return "enterDate" + "?faces-redirect=true";
    }
}
