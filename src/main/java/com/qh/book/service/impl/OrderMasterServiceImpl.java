package com.qh.book.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.qh.book.dto.OrderDTO;
import com.qh.book.service.OrderMasterService;
/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午9:06:06 
 * @Description: TODO
 */

@Service
public class OrderMasterServiceImpl implements OrderMasterService {

	@Override
	public String create(OrderDTO orderDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO findOne(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<OrderDTO> findList(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cancel(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String finish(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String paid(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
