package com.devflaviosantos.paymentservice.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.devflaviosantos.paymentservice.model.Payment;

public interface PaymentResource {
	
	@PostMapping
	ResponseEntity<PaymentResource> payment(@RequestBody Payment payment);

}
