package com.suraj.mm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.mm.model.Payment;
import com.suraj.mm.service.PaymentService;

import lombok.extern.slf4j.Slf4j;
/**
 * @author Dilip Kirar
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PaymentService paymentService;

	@GetMapping(value = "/findAllPayment")
	public ResponseEntity<?> findAllPayment() {
		List<Payment> paymentList = paymentService.findAllPayment();
		return new ResponseEntity(paymentList, HttpStatus.OK);
	}

	@GetMapping(value = "/findPaymentById/{id}")
	public ResponseEntity<?> findPaymentById(@PathVariable Long id) {
		Payment payment = paymentService.findPaymentById(id);
		return new ResponseEntity(payment, HttpStatus.OK);
	}

	@PostMapping(value = "/saveOrUpdatePayment/")
	public ResponseEntity<?> saveOrUpdatePayment(@RequestBody Payment payment) {
		Payment p = paymentService.saveOrUpdatePayment(payment);
		return new ResponseEntity(p, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deletePayment/{id}")
	public ResponseEntity<?> deletePayment(@PathVariable Long id) {
		paymentService.deletePayment(id);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);

	}

}
