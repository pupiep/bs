package com.qh.book.enums;
/**
 * 
 * @author Wine
 *
 */
public enum ResultEnum {

	SUCCESS(0,"成功"),
	
	;
	private Integer code;
	
	private String msg;

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}


	private ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	
}
