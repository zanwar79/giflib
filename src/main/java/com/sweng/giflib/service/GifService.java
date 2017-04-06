package com.sweng.giflib.service;

import com.sweng.giflib.model.Gif;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by ZAnwar on 4/6/2017.
 */
public interface GifService {
    List<Gif> findAll();
    Gif findById(Long id);
    void save(Gif gif, MultipartFile file);
    void delete(Gif gif);
}

