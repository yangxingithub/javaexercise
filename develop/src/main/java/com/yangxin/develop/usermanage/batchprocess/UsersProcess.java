package com.yangxin.develop.usermanage.batchprocess;

import org.springframework.batch.item.ItemProcessor;

import com.yangxin.develop.usermanage.dto.UserInfoDTO;
import com.yangxin.develop.usermanage.dto.UsersDTO;

public class UsersProcess implements ItemProcessor<UsersDTO, UserInfoDTO>{

	public UserInfoDTO process(UsersDTO arg0) throws Exception {
		UserInfoDTO userInfoDTO =new UserInfoDTO();
		userInfoDTO.setUserId(arg0.getUserId());
		userInfoDTO.setUserName(arg0.getTrueName());
		return userInfoDTO;
	}

}
