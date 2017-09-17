package com.qh.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qh.book.dataobj.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
