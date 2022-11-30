package com.shopeasy.services;

import com.shopeasy.exceptions.CustomerException;
import com.shopeasy.exceptions.InsufficientQuantity;
import com.shopeasy.exceptions.OrderException;

import com.shopeasy.exceptions.ProductNotFoundException;
import com.shopeasy.models.CartDto;
import com.shopeasy.models.Orders;

public interface OrderService {

	public Orders buyProductByProductId(String sessionId, Integer productId, String productName, Integer quantity)
			throws CustomerException, ProductNotFoundException, InsufficientQuantity;

	public CartDto visitYourCart(String customerKey) throws CustomerException, OrderException;

	public String payAmount(String customerKey, Double amount) throws CustomerException, OrderException;

	public Orders deleteProductByOrderId(String customerKey, Integer orderId) throws CustomerException, OrderException;

}
