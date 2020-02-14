package com.gatesma.kill.server.service;

/**
 * Copyright (C), 2020
 * FileName: KillService
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/2/14 14:43
 * Description:
 */
public interface KillService {

    Boolean killItem(Integer killId,Integer userId) throws Exception;

    Boolean killItemV2(Integer killId, Integer userId) throws Exception;

    Boolean killItemV3(Integer killId, Integer userId) throws Exception;

    Boolean killItemV4(Integer killId, Integer userId) throws Exception;

    Boolean killItemV5(Integer killId, Integer userId) throws Exception;

}
