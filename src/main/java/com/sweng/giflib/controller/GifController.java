package com.sweng.giflib.controller;

/**
 * Created by ZAnwar on 1/29/2017.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String listSpecificGif() {
        return "This is my GIF!";
    }
}


