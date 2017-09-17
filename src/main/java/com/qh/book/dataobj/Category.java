package com.qh.book.dataobj;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午7:58:22 
 * @Description: 类别实体
 */
@Entity
@Table(name = "book_category")
public class Category {

	@Id
	private Integer categoryId;
	
	private String categoryName;
	
	private Date createTime;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
