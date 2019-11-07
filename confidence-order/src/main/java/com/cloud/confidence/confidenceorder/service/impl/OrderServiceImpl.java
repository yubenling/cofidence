package com.cloud.confidence.confidenceorder.service.impl;

/*
 *@create yubenling
 *@date  2019/11/7
 *@desc  */

import com.cloud.confidence.confidenceorder.dao.OrderMapper;
import com.cloud.confidence.confidenceorder.entity.Order;
import com.cloud.confidence.confidenceorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order selectOrderById(int id) {
        return orderMapper.selectOrderById(id);
    }
}
