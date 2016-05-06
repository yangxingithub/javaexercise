package com.yangxin.develop.usermanage.dao;

import org.springframework.stereotype.Repository;

import com.yangxin.develop.common.BaseDao;
import com.yangxin.develop.common.TransCode;
import com.yangxin.develop.usermanage.dto.UsersDTO;

@Repository("userDao")
public class UserDao extends BaseDao{
	public void getUsersByAll(UsersDTO inDto,UsersDTO outDto){
		super.getList(TransCode.SELECT_USERS_BYALL, inDto, outDto);
	}

}
