/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validation.Repository;

import com.validation.domain.Payment;
import java.util.List;

public interface PaymentRepository {
    public void addPayment(Payment payment);
    public List<Payment> getAllPayments();
}
