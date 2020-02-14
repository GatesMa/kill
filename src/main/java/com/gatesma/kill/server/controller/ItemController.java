package com.gatesma.kill.server.controller;


import com.gatesma.kill.model.entities.ItemKill;
import com.gatesma.kill.server.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Copyright (C), 2020
 * FileName: ItemController
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/2/14 10:20
 * Description:
 */
@Controller
public class ItemController {

    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    private static final String prefix = "item";

    @Autowired
    private ItemService itemService;

    /**
     * 获取商品列表
     */
    @ResponseBody
    @RequestMapping(value = {"/", "/index", prefix + "/list",prefix + "/index.html"}, method = RequestMethod.GET)
    public String list(ModelMap modelMap) {

        //获取待秒杀商品列表
        try {
            List<ItemKill> list = itemService.getKillItems();
            modelMap.put("list", list);

            logger.info("获取待秒杀商品列表-数据： {}", list);
        } catch (Exception e) {
            logger.error("获取待秒杀商品列表 - 发生异常： ", e.fillInStackTrace());
            return "redirect:/base/error";
        }

        return "list";
    }

//    @ResponseBody
//    @RequestMapping(value = {"/hello"})
//    public String hello() {
//        return "index";
//    }

}
