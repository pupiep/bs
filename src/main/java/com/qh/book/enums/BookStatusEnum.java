package com.qh.book.enums;


/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午9:08:22 
 * @Description: 书籍状态
 */
public enum BookStatusEnum implements CodeEnum{

	
	UP(0,"上架"),DOWN(1,"下架");
	
	private Integer code;
	
	private String msg;
	
	

	private BookStatusEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	
	
	
}
