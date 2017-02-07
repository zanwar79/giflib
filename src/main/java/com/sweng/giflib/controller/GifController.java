package com.sweng.giflib.controller;

/**
 * Created by ZAnwar on 1/29/2017.
 */

import com.sweng.giflib.data.GifRepository;
import com.sweng.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;


    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifdetails(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }

}


