/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validation.Service;

import com.validation.Repository.PaymentRepository;
import com.validation.domain.Payment;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author ramesh
 */
public class PaymentServiceImpl implements PaymentService, Serializable{
    
    @Inject
    PaymentRepository paymentRepository;
    @Override
    public void addPayment(Payment payment) {
        paymentRepository.addPayment(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.getAllPayments();
    }
}
