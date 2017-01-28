/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.controller;

import java.io.Serializable;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("com.corejsf.Card")
public class CreditCardConverter implements Converter, Serializable {

    private String separator;

    public void setSeparator(String newValue) {
        separator = newValue;
    }

    public Object getAsObject(FacesContext context, UIComponent component, String newValue)
            throws ConverterException {
        StringBuilder builder = new StringBuilder(newValue);
        int i = 0;
        while (i < builder.length()) {
            if (Character.isDigit(builder.charAt(i))) {
                i++;
            } else {
                builder.deleteCharAt(i);
            }
        }
        return new CreditCard(builder.toString());
    }

    public String getAsString(FacesContext context, UIComponent component, Object value)
            throws ConverterException {
        if (!(value instanceof CreditCard)) {
            throw new ConverterException();
        }
        String v = ((CreditCard) value).toString();
        String sep = separator;
        if (sep == null) {
            sep = " ";
        }
        int[] boundaries = null;
        int length = v.length();
        switch (length) {
            case 13:
                boundaries = new int[]{4, 7, 10};
                break;
            case 14:
                boundaries = new int[]{5, 9};
                break;
            case 15:
                boundaries = new int[]{4, 10};
                break;
            case 16:
                boundaries = new int[]{4, 8, 12};
                break;
            case 22:
                boundaries = new int[]{6, 14};
                break;
            default:
                return v;
        }
        StringBuilder result = new StringBuilder();
        int start = 0;
        for (int i = 0; i < boundaries.length; i++) {
            int end = boundaries[i];
            result.append(v.substring(start, end));
            result.append(sep);
            start = end;
        }
        result.append(v.substring(start));
        return result.toString();
    }
}
