package com.qh.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qh.book.dataobj.OrderDetail;

/***
 * 
 * @author qihong
 * @date 2017年9月16日 下午8:13:14 
 * @Description: TODO
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>{

}
