package com.gatesma.kill.api.response;

import com.gatesma.kill.api.enums.StatusCode;

/**
 * Copyright (C), 2020
 * FileName: BaseResponse
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/2/14 15:08
 * Description:
 */

public class BaseResponse<T> {

    private Integer code;
    private String msg;
    private T data;

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

