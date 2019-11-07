package com.cloud.confidence.confidenceorder.dao;

import com.cloud.confidence.confidenceorder.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/*
 *@create yubenling
 *@date  2019/11/7
 *@desc  */
@Repository
public interface OrderMapper {
    Order selectOrderById(@Param("id") int id);
}
