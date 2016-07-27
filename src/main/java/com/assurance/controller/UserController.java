package com.assurance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: yulongliu
 * Email:liuyulong04@meituan.com
 * Date:16/7/26
 * Time:下午5:08
 */

@Controller
@RequestMapping("/aaa")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "bbb", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}

