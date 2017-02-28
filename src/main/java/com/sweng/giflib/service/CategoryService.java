package com.sweng.giflib.service;

import com.sweng.giflib.model.Category;

import java.util.List;

/**
 * Created by ZAnwar on 2/28/2017.
 */
public interface CategoryService {
    List<Category> findAll();
    Category finddById(Long id);
    void save(Category category);
    void delete (Category category);
}
