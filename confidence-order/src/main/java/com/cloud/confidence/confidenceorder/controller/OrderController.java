package com.cloud.confidence.confidenceorder.controller;

/*
 *@create yubenling
 *@date  2019/11/6
 *@desc  */

import com.cloud.confidence.confidenceorder.entity.Order;
import com.cloud.confidence.confidenceorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;

   @RequestMapping("/selectOrderById")
    public Map<String,Object> selectOrderById(){
       int id=1;
        Order order= orderService.selectOrderById(id);
       System.out.println(order.toString());
        return null;
    }

}
