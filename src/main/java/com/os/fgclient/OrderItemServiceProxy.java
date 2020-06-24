package com.os.fgclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.os.model.OrderItem;

@FeignClient(name = "item-api",url=  "${feign.url}")
public interface OrderItemServiceProxy {
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	 List<OrderItem> getorderitems();
	
	@RequestMapping(value="product",method  =RequestMethod.POST)
	void saveOrderItem(OrderItem orderItem);
}
