package com.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.springmvc.common.MyBatisDao;
import com.springmvc.model.Cibkinfo;
import com.springmvc.model.CibkinfoKey;

@Repository
public class CibkinfoDao extends MyBatisDao{
	public Cibkinfo getCibkinfo(CibkinfoKey key){
		Cibkinfo cibkinfo=super.get("selectByPrimaryKey", key);
		return cibkinfo;
	}
    
}