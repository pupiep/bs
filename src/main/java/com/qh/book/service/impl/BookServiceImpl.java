package com.qh.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.qh.book.dataobj.Book;
import com.qh.book.dto.CartDTO;
import com.qh.book.repository.BookRepository;
import com.qh.book.service.BookService;

/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午9:03:26 
 * @Description: TODO
 */
@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book findOne(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findUpAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Book> findAll(Pageable pageable) {
		return bookRepository.findAll(pageable);
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book saveBatch(List<Book> book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void increaseStock(List<CartDTO> cartDTOList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseStock(List<CartDTO> cartDTOList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book onSale(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book offSale(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
