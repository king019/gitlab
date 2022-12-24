package com.k.boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/createTable")
    @ResponseBody
    public Map<String, String> createTable(String tableName) throws IOException {
        return new HashMap<>();
    }



}
