package com.yangxin.develop.usermanage.batchprocess;

import org.mybatis.spring.batch.MyBatisPagingItemReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yangxin.develop.usermanage.dao.UserInfoDao;
import com.yangxin.develop.usermanage.dto.UsersDTO;

@Component("userReader")
public class UsersReader extends MyBatisPagingItemReader<UsersDTO>{
	
	@Autowired
	private UserInfoDao userInfoDao;


}
