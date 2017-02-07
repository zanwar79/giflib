package com.sweng.giflib.data;

import com.sweng.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZAnwar on 2/6/2017.
 */

@Component
public class GifRepository   {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015,2,13), "Zahid A.", false),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "Anwar, Zahid", true)
    );

    public Gif findByName(String name) {
        for(Gif gif : ALL_GIFS){
            if(gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;

    }
}
