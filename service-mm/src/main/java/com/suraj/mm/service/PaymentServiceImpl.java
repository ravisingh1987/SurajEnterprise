package com.suraj.mm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.mm.model.Capacity;
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

	@Transactional(readOnly = true)
	@Override
	public List<Payment> findAllPayment() {
		logger.info("listAllPayment called");
		List<Payment> payments = paymentRepository.findAll();
		return payments.isEmpty() ? null : payments;
	}

	@Transactional(readOnly = true)
	@Override
	public Payment findPaymentById(Long id) {
		logger.info("getPaymentById called");
		return paymentRepository.findById(id).orElse(null);
	}

	@Transactional(readOnly = false)
	@Override
	public Payment saveOrUpdatePayment(Payment payment) {
		logger.info("savePayment called");
		Payment p = paymentRepository.save(payment);
		return p == null ? null : p;

	}

	@Transactional(readOnly = false)
	@Override
	public Integer deletePayment(Long id) {
		logger.info("deletePayment called");
		paymentRepository.deleteById(id);
		Payment payment = findPaymentById(id);
		payment.setPaymentFlag("0");
		saveOrUpdatePayment(payment);
		return 0;

	}
}
