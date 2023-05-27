package com.gestion.restaurant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {
    @RequestMapping("/tablesList")
    public String index() { return "TablesList";}
}
