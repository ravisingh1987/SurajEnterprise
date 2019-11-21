package com.suraj.mm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.mm.model.Payment;
import com.suraj.mm.repository.PaymentRepository;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the User Entity
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Iterable<Payment> listAllPayment() {
		logger.info("listAllPayment called");
		return paymentRepository.findAll();
	}

	@Override
	public Payment getPaymentById(Long id) {
		logger.info("getPaymentById called");
		return paymentRepository.findById(id).orElse(null);
	}

	@Override
	public Payment savePayment(Payment payment) {
		logger.info("savePayment called");
		return paymentRepository.save(payment);
	}

	@Override
	public void deletePayment(Long id) {
		logger.info("deletePayment called");
		paymentRepository.deleteById(id);

	}
}
