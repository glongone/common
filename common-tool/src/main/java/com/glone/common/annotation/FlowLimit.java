package com.glone.common.annotation;

import com.glone.common.enums.LimitLevelEnum;
import com.glone.common.enums.LimitTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FlowLimit {

    /**
     * 限流key
     */
    String key();

    /**
     * 限流类型 ( 集群 / 单机 )
     */
    LimitTypeEnum type() default LimitTypeEnum.SENTINEL;

    /**
     * 限流级别 ( 账户 / 组织 / 组织+账户 )
     */
    LimitLevelEnum level() default LimitLevelEnum.ACCOUNT;
}
