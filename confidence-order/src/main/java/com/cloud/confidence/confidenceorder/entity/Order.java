package com.cloud.confidence.confidenceorder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/*
 *@create yubenling
 *@date  2019/11/6
 *@desc  */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order  implements Serializable {
    private Integer id;
    private String name;
}
