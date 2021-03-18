package com.example.demo.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ResponseBody
@Controller
class DemoController {



    @GetMapping("/demo")
    public  String demo(){

        ArrayList<Object> objects = new ArrayList<>();

        List list = new ArrayList<>();


        try {
            for (Object o : list) {

            }


            for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
                Object next =  iterator.next();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return  "success";




    }
}
