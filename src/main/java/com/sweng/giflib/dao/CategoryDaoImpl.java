package com.sweng.giflib.dao;

import com.sweng.giflib.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ZAnwar on 2/27/2017.
 */

@Repository
public class CategoryDaoImpl implements CategoryDao{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    @SuppressWarnings("unchecked")

    public List<Category> findAll() {
        Session session = sessionFactory.openSession();
        List<Category> categories = session.createCriteria(Category.class).list();
        session.close();
        return categories;
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
