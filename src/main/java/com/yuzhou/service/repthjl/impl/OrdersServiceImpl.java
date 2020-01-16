package com.yuzhou.service.repthjl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuzhou.entity.Orders;
import com.yuzhou.mapper.repthjl.OrdersMapper;
import com.yuzhou.service.repthjl.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersMapper ordersMapper;

	@Override
	public List<Orders> selectClientInfoAndOrdersAll() {
		return ordersMapper.selectClientInfoAndOrdersAll();
	}

	/*@Override
	public int selectOrdersCount(Orders orders) {
		return ordersMapper.selectOrdersCount(orders);
	}

	@Override
	public List<Orders> selectOrdersPaging(Orders orders) {
		return ordersMapper.selectOrdersPaging(orders);
	}*/

	
}
