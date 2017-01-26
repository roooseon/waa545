/**
 * 
 */
package com.javaquiz.controller;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("localChanger")
@SessionScoped
public class LocalChanger implements Serializable {

	private static final long serialVersionUID = 1L;
	public String germanAction() {
		  FacesContext context = FacesContext.getCurrentInstance();
	      context.getViewRoot().setLocale(Locale.GERMAN);
	      return null;
	}
	
	public String englishAction() {
		FacesContext context = FacesContext.getCurrentInstance();
	      context.getViewRoot().setLocale(Locale.ENGLISH);
	      return null;
	}

}
