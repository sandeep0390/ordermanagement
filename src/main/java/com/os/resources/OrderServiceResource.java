package com.os.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.os.model.Order;
import com.os.model.OrderItem;
import com.os.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderServiceResource {
	
	@Autowired
	OrderService orderService;
	
	
	@PostMapping("/order")
	public void saveOrder(@RequestBody Order dto) {
		orderService.saveOrder(dto);
	}
	
	@GetMapping("/list")
	public List<Order> getOrder(){
		return orderService.getOrders();
	}
	
	@GetMapping("/itemslist")
	public List<OrderItem> getOrderITems(){
		return orderService.getOrderItems();
	}
	
	@PostMapping("/orderitem")
	public void saveOrderItem(@RequestBody OrderItem orderItem) {
		orderService.saveOrdeItem(orderItem);
	}
}
