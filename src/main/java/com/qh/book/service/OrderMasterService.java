package com.qh.book.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.qh.book.dto.OrderDTO;


/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午8:45:11 
 * @Description: TODO
 */
public interface OrderMasterService {

	public String create(OrderDTO orderDTO);
	
	public OrderDTO findOne(String orderId);

	public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);
	
	public Page<OrderDTO> findList(Pageable pageable);

	/*取消一个订单*/
	public String cancel(String orderId);
	
	/*完结一个订单*/
	public String finish(String orderId);
	
	/*支付一个订单*/
	public String paid(String orderId);
}
