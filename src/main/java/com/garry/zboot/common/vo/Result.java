package com.garry.zboot.common.vo;


import lombok.Data;

import java.io.Serializable;

/**
* class_name: Result
* package: com.garry.zboot.common.vo
* describe: 前后端交互数据标准
* creat_user: ZhangGaoJun@zhanggj@seeyoo.cn
* creat_date: 2019/7/9
* creat_time: 9:02
**/
@Data
public class Result<T> implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 成功标志
     */
    private boolean success;

    /**
     * 失败消息
     */
    private String message;

    /**
     * 返回代码
     */
    private Integer code;

    /**
     * 时间戳
     */
    private long timestamp = System.currentTimeMillis();

    /**
     * 结果对象
     */
    private T result;
}
