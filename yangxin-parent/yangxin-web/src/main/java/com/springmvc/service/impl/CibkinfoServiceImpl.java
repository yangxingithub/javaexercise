package com.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springmvc.dao.CibkinfoDao;
import com.springmvc.model.Cibkinfo;
import com.springmvc.model.CibkinfoKey;
import com.springmvc.service.CibkinfoService;

@Service("cibkinfoService")
public class CibkinfoServiceImpl implements CibkinfoService{

	@Resource
	private CibkinfoDao cibkinfoDao;
	
	public Cibkinfo getCibkinfo(CibkinfoKey key) {
		return cibkinfoDao.getCibkinfo(key);
	}


}
