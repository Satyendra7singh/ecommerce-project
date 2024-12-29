package com.satyendra.ecommerceproject.service;

import com.satyendra.ecommerceproject.dto.PaymentInfo;
import com.satyendra.ecommerceproject.dto.Purchase;
import com.satyendra.ecommerceproject.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
	
	PurchaseResponse placeOrder(Purchase purchase);
	PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
	
	

}
