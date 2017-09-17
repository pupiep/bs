package com.qh.book.dto;

/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午8:19:18 
 * @Description: 购物车
 */
public class CartDTO {

	private String bookId;
	
	private Integer bookQuantity;

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
