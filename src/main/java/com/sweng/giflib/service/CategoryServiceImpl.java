package com.sweng.giflib.service;

import com.sweng.giflib.dao.CategoryDao;
import com.sweng.giflib.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZAnwar on 2/28/2017.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;


    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category finddById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void delete(Category category) {

    }
}
