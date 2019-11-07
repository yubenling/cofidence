package com.cloud.confidence.confidenceorder.service;

import com.cloud.confidence.confidenceorder.entity.Order;

/*
 *@create yubenling
 *@date  2019/11/6
 *@desc  */
public interface OrderService {
    Order selectOrderById(int id);
}
