package com.yangxin.develop.common;



import java.util.ArrayList;

public class BaseDTO {

	private String optFlagInter; //平台接口操作标志 s0：新增，1：修改,2：新增+修改，3：删除
	private String orgType; //机构类型
	private String orgNo; //机构码
	private boolean noRecNotice = false;//查询不到记录，是否通知前台，默认通知
	private boolean isUseCurOrgNo = true;//是否使用当前登录用户机构号,默认使用
	private boolean isSafeCheckOrg = false;//是否对当前机构做安全检查
	private Integer count = 0;//记录数
	private String accsysBackDBUser="as_jsmf"; //会计后台数据库域名
	private String pubsysDBUser="pub_plat"; //公共平台数据库域名
	private long start; //起始页数
    private String _rspMsg = null;
    private String _rspCode = null;
    private Integer _pageStart = null;
    private Integer _pageLimit = null;
    
    private Long  _total = null;

	private ArrayList<?> recList; //数据集

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOptFlagInter() {
		return optFlagInter;
	}

	public void setOptFlagInter(String optFlagInter) {
		this.optFlagInter = optFlagInter;
	}

	public boolean isNoRecNotice() {
		return noRecNotice;
	}

	public void setNoRecNotice(boolean noRecNotice) {
		this.noRecNotice = noRecNotice;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public String getAccsysBackDBUser() {
		return accsysBackDBUser;
	}

	public void setAccsysBackDBUser(String accsysBackDBUser) {
		this.accsysBackDBUser = accsysBackDBUser;
	}

	public String getPubsysDBUser() {
		return pubsysDBUser;
	}

	public void setPubsysDBUser(String pubsysDBUser) {
		this.pubsysDBUser = pubsysDBUser;
	}

	public boolean isUseCurOrgNo() {
		return isUseCurOrgNo;
	}

	public void setUseCurOrgNo(boolean isUseCurOrgNo) {
		this.isUseCurOrgNo = isUseCurOrgNo;
	}

	public boolean isSafeCheckOrg() {
		return isSafeCheckOrg;
	}

	public void setSafeCheckOrg(boolean isSafeCheckOrg) {
		this.isSafeCheckOrg = isSafeCheckOrg;
	}

	public ArrayList<?> getRecList() {
		return recList;
	}

	public void setRecList(ArrayList<?> recList) {
		this.recList = recList;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String get_rspMsg() {
		return _rspMsg;
	}

	public void set_rspMsg(String _rspMsg) {
		this._rspMsg = _rspMsg;
	}

	public String get_rspCode() {
		return _rspCode;
	}

	public void set_rspCode(String _rspCode) {
		this._rspCode = _rspCode;
	}

	public Integer get_pageStart() {
		return _pageStart;
	}

	public void set_pageStart(Integer _pageStart) {
		this._pageStart = _pageStart;
	}

	public Integer get_pageLimit() {
		return _pageLimit;
	}

	public void set_pageLimit(Integer _pageLimit) {
		this._pageLimit = _pageLimit;
	}

	public Long get_total() {
		return _total;
	}

	public void set_total(Long _total) {
		this._total = _total;
	}

}
