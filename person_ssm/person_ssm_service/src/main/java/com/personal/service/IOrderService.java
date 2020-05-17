package com.personal.service;

import com.personal.domain.Order;
import com.personal.domain.Role;

import java.util.List;

public interface IOrderService {

    /**
     *分页查询订单信息
     */
    List<Order> findAll(int page,int size) throws Exception;

    Order findById(String orderId) throws Exception;

    /**
     * 下单
     */
    List<Order> save(Order order)throws Exception;
    /**
     * 删除订单
     */
    void  delete(String orderId) throws Exception;
}
