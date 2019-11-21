package com.suraj.mm.service;

import com.suraj.mm.model.Payment;

/**
 * @author Dilip Kirar
 *
 */
public interface PaymentService {

	Iterable<Payment> listAllPayment();

	Payment getPaymentById(Long id);

	Payment savePayment(Payment payment);

	void deletePayment(Long id);
}
