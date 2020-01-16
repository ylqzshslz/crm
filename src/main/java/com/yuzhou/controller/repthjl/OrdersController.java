package com.yuzhou.controller.repthjl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yuzhou.entity.Orders;
import com.yuzhou.service.repthjl.OrdersService;

@RestController
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
    
	@RequestMapping("/selectClientInfoAndOrdersAll")
	public List<Orders> selectClientInfoAndOrdersAll() throws Exception{
		return ordersService.selectClientInfoAndOrdersAll();
	}
	
	/*@RequestMapping("selectOrdersCount")
	public int selectOrdersCount(Orders orders) throws Exception{
		return ordersService.selectOrdersCount(orders);
	}
	
	@RequestMapping("")
	public List<Orders> selectOrdersPaging(Orders orders) throws Exception{
		return ordersService.selectOrdersPaging(orders);
	}*/
}
