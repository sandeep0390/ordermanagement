package com.os.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.os.dao.OrderRepository;
import com.os.exception.OrderCreationException;
import com.os.exception.OrderItemNotFoundException;
import com.os.exception.OrderNotFoundException;
import com.os.fgclient.OrderItemServiceProxy;
import com.os.model.Order;
import com.os.model.OrderItem;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	OrderItemServiceProxy proxy;

	public void saveOrder(Order dto) {
		try {
			orderRepository.save(dto);
		} catch (Exception e) {
			//log error
			throw new OrderCreationException();
		}
		
	}

	public List<Order> getOrders() {
		List<Order> orders=null;
		try {
			orders= orderRepository.findAll();
		} catch (Exception e) {
			//log error
			throw new OrderNotFoundException();
		}
		return orders;
		
	}
	
	public void saveOrdeItem(OrderItem orderItem) {
		try {
			proxy.saveOrderItem(orderItem);
		} catch (Exception e) {
			//log error
			throw new OrderItemNotFoundException();
		}
		
		
	}
	
	public List<OrderItem> getOrderItems(){
		
		List<OrderItem> orderItems = null;
 		try {
			orderItems = proxy.getorderitems();
		} catch (Exception e) {
			// log error
			throw new OrderItemNotFoundException();
		}
		return orderItems;
	}

}
 