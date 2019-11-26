package com.cloud.confidence.confidenceuser.apiImpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cloud.confidence.confidenceuser.api.UserService;
import com.cloud.confidence.confidenceuser.dao.UserMapper;
import com.cloud.confidence.confidenceuser.entity.User;
import org.springframework.stereotype.Service;

/*
 *@create yubenling
 *@date  2019/11/26
 *@desc
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
