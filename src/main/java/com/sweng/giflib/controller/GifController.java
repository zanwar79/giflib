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
    @ResponseBody
    public String listGifs() {
        return "List of all the GIFs!";
    }
}


