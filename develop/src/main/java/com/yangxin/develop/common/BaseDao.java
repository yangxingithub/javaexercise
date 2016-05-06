package com.yangxin.develop.common;



import java.util.ArrayList;

import org.apache.commons.beanutils.PropertyUtils;


public class BaseDao extends MyBatisDao {

	private static final LogerUtil logerUtil = new LogerUtil(BaseDao.class);

	/**
	 * 查询单个对象
	 * 
	 * @param transCode
	 * @param dto
	 * @return
	 */
	public void get(String transCode, BaseDTO inDto, BaseDTO outDto) {
		/*
		 * //封装配置数据 dto.set_transCode(transCode); //交易码
		 * dto.set_sqlListName(Constant.SQL_LIST_NAME); //存放结果集字段名称
		 */
		BaseDTO retDto = null;// 返回对象
		if (outDto == null) {
			outDto = new BaseDTO();
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("输出对象为空！");
			return;
		}

		try {
			// 查询详情
			retDto = super.get(transCode, inDto);
			// 将返回对象属性信息拷贝到输出对象
			if (outDto != null)
				PropertyUtils.copyProperties(outDto, retDto);
			outDto.set_rspCode(Constant.RESPONSE_OK);
			outDto.set_rspMsg("查询成功！");
		} catch (Exception e) {
			logerUtil.error(e.getMessage());
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("查询失败！");
		}

	}

	/**
	 * 查询结果集
	 * 
	 * @param transCode
	 * @param dto
	 * @return
	 */
	public void getList(String transCode, BaseDTO inDto, BaseDTO outDto) {
		/*
		 * //封装配置数据 dto.set_transCode(transCode); //交易码
		 * dto.set_sqlListName(Constant.SQL_LIST_NAME); //存放结果集字段名称
		 */
		if (outDto == null) {
			outDto = new BaseDTO();
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("输出对象为空！");
			return;
		}

		ArrayList<?> recList = null;
		outDto.set_rspCode(Constant.RESPONSE_OK);
		outDto.set_rspMsg("查询成功！");

		// 设置分页
		if(inDto.get_pageLimit()==null){
			inDto.set_pageLimit(Constant.PAGE_MAXLIMIT);
		}
		if(inDto.get_pageStart()==null){
			inDto.set_pageStart(Constant.PAGE_START);
		}

		try {
			// 查询结果集
			recList = (ArrayList<?>) super.getList(transCode, inDto,
					ConverUtil.getObjInt(inDto.get_pageStart()),
					ConverUtil.getObjInt(inDto.get_pageLimit()));
			// recList=(ArrayList) super.getList(transCode, inDto);
			// 查询记录数

		} catch (Exception e) {
			logerUtil.error(e.getMessage());
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("查询失败！");
		}
		outDto.setRecList(recList);
		outDto.set_total(inDto.get_total());

	}
	
	public int getCount(String transCode, BaseDTO inDto, BaseDTO outDto) {
	
		if (outDto == null) {
			outDto = new BaseDTO();
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("输出对象为空！");
			return 0;
		}

		int count=0;
		outDto.set_rspCode(Constant.RESPONSE_OK);
		outDto.set_rspMsg("查询成功！");

		try {
			// 查询结果集
			count =  super.get(transCode, inDto);
			// recList=(ArrayList) super.getList(transCode, inDto);
			// 查询记录数

		} catch (Exception e) {
			logerUtil.error(e.getMessage());
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("查询失败！");
			return count;
		}
		return count;
		

	}


	/**
	 * 修改保存操作
	 * 
	 * @param transCode
	 * @param dto
	 */
	public void save(String transCode, BaseDTO inDto, BaseDTO outDto) {
		/*
		 * //封装配置数据 dto.set_transCode(transCode); //交易码
		 */

		if (outDto == null) {
			outDto = new BaseDTO();
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("输出对象为空！");
			return;
		}

		outDto.set_rspCode(Constant.RESPONSE_OK);
		outDto.set_rspMsg("保存成功！");
		int result = -1;
		try {
			if ("0".equalsIgnoreCase(inDto.getOptFlagInter())) {
				// 新增
				result = super.insert(transCode, inDto);
			} else {
				// 修改
				result = super.update(transCode, inDto);
			}
		} catch (Exception e) {
			logerUtil.error(e.getMessage());
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("保存失败！");
		}
		if (result <= 0) {
			outDto.set_rspMsg("保存失败！");
		}

	}

	/**
	 * 删除操作
	 * 
	 * @param transCode
	 * @param dto
	 */
	public void delete(String transCode, BaseDTO inDto, BaseDTO outDto) {
		/*
		 * //封装配置数据 dto.set_transCode(transCode); //交易码
		 */

		if (outDto == null) {
			outDto = new BaseDTO();
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("输出对象为空！");
			return;
		}

		outDto.set_rspCode(Constant.RESPONSE_OK);
		outDto.set_rspMsg("删除成功！");
		int result = -1;
		try {
			// 查询详情
			result = super.delete(transCode, inDto);
		} catch (Exception e) {
			logerUtil.error(e.getMessage());
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("删除失败！");
		}
		if (result <= 0) {
			outDto.set_rspCode(Constant.RESPONSE_FAIL);
			outDto.set_rspMsg("删除失败！");
		}

	}

}
