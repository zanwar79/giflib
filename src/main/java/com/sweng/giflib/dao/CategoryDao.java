package com.sweng.giflib.dao;

import com.sweng.giflib.model.Category;

import java.util.List;

/**
 * Created by ZAnwar on 2/27/2017.
 */
public interface CategoryDao {
    List<Category> findAll();
    Category finddById(Long id);
    void save(Category category);
    void delete (Category category);
}
