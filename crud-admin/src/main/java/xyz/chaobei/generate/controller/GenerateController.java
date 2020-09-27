package xyz.chaobei.generate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright (C), 2015-2020
 * FileName: GenerateController
 * Author:   MRC
 * Date:     2020/9/27 10:27
 * Description:
 * History:
 */
@RequestMapping("/")
@Controller
public class GenerateController {

    @GetMapping("/index")
    public String toList() {
        return "index";
    }


}
