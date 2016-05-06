package com.yangxin.develop.usermanage.dao;

import org.springframework.stereotype.Repository;

import com.yangxin.develop.common.BaseDao;
import com.yangxin.develop.common.TransCode;
import com.yangxin.develop.usermanage.dto.UserInfoDTO;

@Repository("userInfoDao")
public class UserInfoDao extends BaseDao{
	public void saveUserInfo(UserInfoDTO inDto,UserInfoDTO outDto){
		super.save(TransCode.INSERT_USER_INFO, inDto, outDto);
	}

}
