package com.xuqian.admin.common.annotation;

import java.lang.annotation.*;

/**
 * 初始化继承BaseService的service
 * Created by xuqian on 2017/4/20.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseService {
}
