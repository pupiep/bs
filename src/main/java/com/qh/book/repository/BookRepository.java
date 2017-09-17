package com.qh.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qh.book.dataobj.Book;
/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午8:09:41 
 * @Description: TODO
 */
public interface BookRepository extends JpaRepository<Book, String>{

}
