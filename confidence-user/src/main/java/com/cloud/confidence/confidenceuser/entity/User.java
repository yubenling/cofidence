package com.cloud.confidence.confidenceuser.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

/*
 *@create yubenling
 *@date  2019/11/26
 *@desc
 */
@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "user")
public class User {

    private  Integer id;
    private  String name;

}
