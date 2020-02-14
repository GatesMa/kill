package com.gatesma.kill.server.service;

import com.gatesma.kill.model.entities.ItemKill;
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
public interface ItemService {

    List<ItemKill> getKillItems() throws Exception;

    ItemKill getKillDetail(Integer id) throws Exception;


}
