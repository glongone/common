package com.glone.common.enums;

/**
 * @author gaobenlong
 * @date 2023/4/7 02:05
 * @desc 限流类型枚举定义
 */
public enum LimitTypeEnum {

    // sentinel平台限流 单机限流
    SENTINEL,
    // redis 方式 集群限流
    REDIS_CLUSTER,
    ;
}
