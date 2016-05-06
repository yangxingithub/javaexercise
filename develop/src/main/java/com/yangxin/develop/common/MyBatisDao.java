package com.yangxin.develop.common;



import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * myBatis的Dao的基类
 * @author user
 *
 */
public class MyBatisDao extends SqlSessionDaoSupport {

	protected int insert(String key, Object object) {
		return getSqlSession().insert(key, object);
	}
	
	protected int update(String key, Object object) {
		return getSqlSession().update(key, object);
	}
	
	protected int delete(String key, Serializable id) {
		return getSqlSession().delete(key, id);
	}
	
	protected int delete(String key, Object object) {
		return getSqlSession().delete(key, object);
	}
	
	@SuppressWarnings("unchecked")
	protected <T> T get(String key, Object params) {
		return (T) getSqlSession().selectOne(key, params);
	}
	
	protected <T> List<T> getList(String key) {
		return getSqlSession().selectList(key);
	}

	public <T> List<T> getList(String key, Object params) {
		return getSqlSession().selectList(key, params);
	}

	protected <T> List<T> getList(String key, Object params,int offset,int limit) {
		return getSqlSession().selectList(key, params, new RowBounds(offset,limit));
	}
	
	
}
