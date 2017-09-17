package com.qh.book.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qh.book.dataobj.Book;
import com.qh.book.service.BookService;

@Controller
@RequestMapping("/backstage/book")
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/list")
	public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") Integer page,
							@RequestParam(value = "size", defaultValue = "10") Integer size,
							Map<String, Object> map) {
		
		//Sort sort = new Sort(new Order(Sort.Direction.DESC,"id"));
		Pageable pageable = new PageRequest(page - 1, size);
		Page<Book> bookPage = bookService.findAll(pageable);
		map.put("bookPage", bookPage);
		map.put("currentpage", page);
		return new ModelAndView("book/list", map);
	}
}
