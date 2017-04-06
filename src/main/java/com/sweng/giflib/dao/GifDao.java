package com.sweng.giflib.dao;

import com.sweng.giflib.model.Gif;

import java.util.List;

/**
 * Created by ZAnwar on 4/6/2017.
 */
public interface GifDao {
    List<Gif> findAll();
    Gif findById(Long id);
    void save(Gif gif);
    void delete(Gif gif);
}
