/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validation.controller;

import com.validation.Service.PaymentService;
import com.validation.domain.Payment;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named("paymentBean")
@SessionScoped
public class PaymentBean implements Serializable{
   
   @Inject
   PaymentService paymentService;
   Payment payment = new Payment();
   
   public Payment getPayment() {
       return payment;
   }
   
   public String paymentAddAction() {
       paymentService.addPayment(payment);
       payment = new Payment();
       FacesContext.getCurrentInstance().getExternalContext().getFlash()
               .put("listPaymentDetails", paymentService.getAllPayments());
       
       return "paymentDetails" + "?faces-redirect=true";
   }
   
   public String paymentCancelAction() {
       return "canceled" + "?faces-redirect=true";
   }
   
   public String indexAction() {
       return "index" + "?faces-redirect=true";
   }
}
