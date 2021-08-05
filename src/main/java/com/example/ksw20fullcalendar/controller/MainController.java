package com.example.ksw20fullcalendar.controller;

import com.example.ksw20fullcalendar.model.EventDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }

    @GetMapping("/hi")
    @ResponseBody
    public List<EventDTO> hi(){
        List<EventDTO> result = new ArrayList<>();
        result.add(
            EventDTO.builder()
            .title("hello")
            .start("2021-08-05")
            .end("2021-08-09")
            .build());
        result.add(
            EventDTO.builder()
            .title("hihihihi")
            .start("2021-08-06")
            .build());


        return result;
    }

}
