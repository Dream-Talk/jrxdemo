package com.personal.service;

import com.personal.domain.Product;
import com.personal.domain.Shooping;

import java.util.List;

public interface IShoopingService {
    /**
     * 查询所有
     */
    List<Shooping> findAll () throws Exception;
    /**
     * 添加产品
     */
    void save(Shooping shooping) throws Exception;
    /**
     * 删除购物车
     */
    void  delete(String orderId) throws Exception;
}
