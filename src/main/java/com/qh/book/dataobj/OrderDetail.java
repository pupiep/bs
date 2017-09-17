package com.qh.book.dataobj;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午7:57:39 
 * @Description: 订单详情实体
 */
@Entity
@Table(name = "order_detail")
public class OrderDetail {

	@Id
	private String detailId;
	
	private Integer orderId;
	
	private String bookId;
	
	/*数量*/
	private Integer bookQuantity;

	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Integer getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(Integer bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	
	
	
}
