package com.qh.book.dataobj;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午8:01:19 
 * @Description: 后台管理员
 */
@Entity
@Table(name = "admin")
public class Admin {

	@Id
	private String adminId;
	
	private String username;
	
	private String password;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
