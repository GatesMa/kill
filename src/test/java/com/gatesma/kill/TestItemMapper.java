package com.gatesma.kill;

import com.gatesma.kill.model.entities.Item;
import com.gatesma.kill.model.mapper.ItemMapper;
import com.gatesma.kill.server.controller.ItemController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyright (C), 2020
 * FileName: TestItemMapper
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/2/14 10:44
 * Description:
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class)
public class TestItemMapper {

    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private ItemController itemController;
    
    @Test
    public void test() {
        System.out.println(itemMapper);
//        System.out.println(itemController);
        Item item = itemMapper.selectByPrimaryKey(6);
        logger.info(item.toString());

    }
    
}
