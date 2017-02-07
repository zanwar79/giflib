package com.sweng.giflib.controller;

/**
 * Created by ZAnwar on 1/29/2017.
 */

import com.sweng.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    //@ResponseBody
    public String gifdetails(ModelMap modelMap) {
        Gif gif = new Gif("compiler-bot", LocalDate.of(2015, 2, 13), "Zahid Anwar", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }

}


