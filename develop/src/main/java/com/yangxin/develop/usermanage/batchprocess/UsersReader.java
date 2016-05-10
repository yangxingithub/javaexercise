package com.yangxin.develop.usermanage.batchprocess;


import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.yangxin.develop.usermanage.dto.UsersDTO;


public class UsersReader implements ItemReader<UsersDTO>{
	
	
	private List<UsersDTO> userlist = new ArrayList<UsersDTO>();
	
	

	public List<UsersDTO> getUserlist() {
		return userlist;
	}



	public void setUserlist(List<UsersDTO> userlist) {
		this.userlist = userlist;
	}



	public UsersDTO read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		if(!userlist.isEmpty()){
			return userlist.remove(0);	
		}
		return null;
	}


}
