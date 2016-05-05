package com.springmvc.test;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springmvc.model.Cibkinfo;
import com.springmvc.model.CibkinfoKey;
import com.springmvc.service.CibkinfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:conf/spring-mybaties.xml"})
public class Test {
	
	@Resource
	
	private CibkinfoService cibkinfoService=null;
	     
	    @org.junit.Test
	    public void test(){
	    	
	    	//System.out.println(c.sayHello("你好--Before"));
	        CibkinfoKey key=new CibkinfoKey();
	        key.setInBankCd(320506001L);
	        key.setInsttuCde("01");
	        Cibkinfo cibkinfo=cibkinfoService.getCibkinfo(key);
			System.out.println(cibkinfo.getSname());
	    }
}
