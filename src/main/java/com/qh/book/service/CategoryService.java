package com.qh.book.service;

import java.util.List;

import com.qh.book.dataobj.Category;

/**
 * 
 * @author qihong
 * @date 2017年9月16日 下午8:42:03 
 * @Description: TODO
 */
public interface CategoryService {

    public Category findOne(Integer categoryId);

    public List<Category> findAll();

    public List<Category> findByCategoryIdIn(List<Integer> categoryIdList);

    public Category save(Category category);
}
