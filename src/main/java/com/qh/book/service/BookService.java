package com.qh.book.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.qh.book.dataobj.Book;
import com.qh.book.dto.CartDTO;

/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午8:41:55 
 * @Description: TODO
 */
public interface BookService {

	public Book findOne(String bookId);

	public List<Book> findUpAll();

	public Page<Book> findAll(Pageable pageable);

	public Book save(Book book);
	
	public Book saveBatch(List<Book> book);
	
	/*加库存*/
	public void increaseStock(List<CartDTO> cartDTOList);
	
	/*减库存*/
	public void decreaseStock(List<CartDTO> cartDTOList);
	
    /*上架*/
    public Book onSale(String bookId);

    /*下架*/
    public Book offSale(String bookId);
	
}
