package com.yuzhou.service.repthjl;

import java.util.List;
import com.yuzhou.entity.Orders;

public interface OrdersService {
	
	public List<Orders> selectClientInfoAndOrdersAll();
	
	/*//下面两个方法专用于分页
	public int selectOrdersCount(Orders orders);
	public List<Orders> selectOrdersPaging(Orders orders);*/

}
