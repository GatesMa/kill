package com.gatesma.kill.server.service.impl;

import com.gatesma.kill.model.entities.ItemKill;
import com.gatesma.kill.model.mapper.ItemKillMapper;
import com.gatesma.kill.server.controller.ItemController;
import com.gatesma.kill.server.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (C), 2020
 * FileName: ItemService
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/2/14 10:29
 * Description:
 */
@Service
public class ItemServiceImpl implements  ItemService {

    private static final Logger logger = LoggerFactory.getLogger(ItemService.class);

    @Autowired
    private ItemKillMapper itemKillMapper;

    /**
     * 获取待秒杀商品列表
     * @return
     * @throws Exception
     */
    @Override
    public List<ItemKill> getKillItems() throws Exception {

        return itemKillMapper.selectAll();
    }


    /**
     * 获取秒杀详情
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public ItemKill getKillDetail(Integer id) throws Exception {
        ItemKill entity=itemKillMapper.selectById(id);
        if (entity==null){
            throw new Exception("获取秒杀详情-待秒杀商品记录不存在");
        }
        return entity;
    }
}
