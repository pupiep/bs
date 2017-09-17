package com.qh.book.enums;

/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午9:07:42 
 * @Description: 订单状态
 */
public enum OrderStatusEnum implements CodeEnum{

	NEW(0,"未支付"),
	FINISHED(1,"已支付"),
	CANCEL(2,"已取消");
	
	private Integer code;
	
	private String msg;
	
	

	private OrderStatusEnum(Integer code, String msg) {
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
