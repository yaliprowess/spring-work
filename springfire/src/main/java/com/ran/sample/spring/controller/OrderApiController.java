package com.ran.sample.spring.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ran.sample.spring.model.Orders;
import com.ran.sample.spring.service.impl.OrderServiceImpl;

@RestController
@RequestMapping("/order")
public class OrderApiController {
		
		private OrderServiceImpl orderService;		
		
		// Simple / means fetch all		
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public Orders getAllOrder() {
			orderService=new OrderServiceImpl();
			return orderService.getAllOrders();
		}
		
		public OrderServiceImpl getOrderService() {
			return orderService;
		}
		public void setOrderService(OrderServiceImpl orderService) {
			this.orderService = orderService;
		}
	}