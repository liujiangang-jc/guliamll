package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * ??ҳר???�jd??ҳ?????ܶ?ר?⣬ÿ??ר???????µ?ҳ?棬չʾר????Ʒ??Ϣ??
 *
 * @author ljg
 * @email 2049464827@qq.com
 * @date 2022-03-23 13:08:34
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

