/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validation.Repository;

import com.validation.domain.Payment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PaymentRepositoryImpl implements PaymentRepository, Serializable {
    private List<Payment> payments = new ArrayList<>();
    
    @Override
    public void addPayment(Payment payment) {
        payments.add(payment);
        
    }   

    @Override
    public List<Payment> getAllPayments() {
        return this.payments;
    }
}
