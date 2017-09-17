package com.qh.book.utils;

import com.qh.book.enums.CodeEnum;

/**
 * 
 * @author qihong
 * @date 2017年9月17日 上午12:20:15 
 * @Description: 
 */
public class EnumUtil {

	/**
	 * 通过code 与 枚举类型返回具体枚举
	 * @param code
	 * @param enumClass
	 * @return
	 */
	public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
		for (T t : enumClass.getEnumConstants()) {
			if(t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}
}
