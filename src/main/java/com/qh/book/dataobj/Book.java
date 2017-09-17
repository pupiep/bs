package com.qh.book.dataobj;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qh.book.enums.BookStatusEnum;
import com.qh.book.utils.EnumUtil;

/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午6:28:19 
 * @Description: 书籍实体
 */
@Entity
@Table(name = "book")
public class Book {

	
	@Id
	private String bookId;
	
	private String bookName;
	
	/*价格*/
	private BigDecimal bookPrice;
	
	/*ISBN号*/
	private String bookIsbn;
	
	/*出版社*/
	private String bookPress;
	
	/*库存*/
	private Integer bookStock;
	
	/*描述*/
	private String bookDescription;
	
	/*图片*/
	private String bookIcon;
	
	/*状态：商品状态,0正常1下架*/
	private Integer bookStatus = BookStatusEnum.UP.getCode();
	
	/*类目*/
	@ManyToOne(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinColumn(name="categoryId",referencedColumnName="categoryId")
	private Category category;
	
	/*上架时间*/
	private Date createTime;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public BigDecimal getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(BigDecimal bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookPress() {
		return bookPress;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}

	public Integer getBookStock() {
		return bookStock;
	}

	public void setBookStock(Integer bookStock) {
		this.bookStock = bookStock;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public String getBookIcon() {
		return bookIcon;
	}

	public void setBookIcon(String bookIcon) {
		this.bookIcon = bookIcon;
	}

	public Integer getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(Integer bookStatus) {
		this.bookStatus = bookStatus;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	@JsonIgnore
	public BookStatusEnum getBookStatusEnum() {
		
		return EnumUtil.getByCode(bookStatus, BookStatusEnum.class);
	}
	
	
}
