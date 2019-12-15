package com.suraj.mm.service;

import java.util.List;

import com.suraj.mm.model.Payment;

/**
 * @author Dilip Kirar
 *
 */
public interface PaymentService {

	List<Payment> findAllPayment();

	Payment findPaymentById(Long id);

	Payment saveOrUpdatePayment(Payment payment);

	Integer deletePayment(Long id);
}
