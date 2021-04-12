package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:Markburt
 * @Description:DstReconciliation构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "DstReconciliation",value = "DstReconciliation")
@Table(name="dst_reconciliation")
public class DstReconciliation implements Serializable{

	@ApiModelProperty(value = "id",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//id

	@ApiModelProperty(value = "商铺id",required = false)
    @Column(name = "account_id")
	private Integer accountId;//商铺id

	@ApiModelProperty(value = "商铺名称",required = false)
    @Column(name = "account_name")
	private String accountName;//商铺名称

	@ApiModelProperty(value = "收入",required = false)
    @Column(name = "income")
	private String income;//收入

	@ApiModelProperty(value = "创建人",required = false)
    @Column(name = "create_by")
	private String createBy;//创建人

	@ApiModelProperty(value = "创建时间",required = false)
    @Column(name = "create_time")
	private Date createTime;//创建时间

	@ApiModelProperty(value = "备注",required = false)
    @Column(name = "remark")
	private String remark;//备注

	@ApiModelProperty(value = "更新人",required = false)
    @Column(name = "update_by")
	private String updateBy;//更新人

	@ApiModelProperty(value = "更新时间",required = false)
    @Column(name = "update_time")
	private Date updateTime;//更新时间



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public Integer getAccountId() {
		return accountId;
	}

	//set方法
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	//get方法
	public String getAccountName() {
		return accountName;
	}

	//set方法
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	//get方法
	public String getIncome() {
		return income;
	}

	//set方法
	public void setIncome(String income) {
		this.income = income;
	}
	//get方法
	public String getCreateBy() {
		return createBy;
	}

	//set方法
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	//get方法
	public Date getCreateTime() {
		return createTime;
	}

	//set方法
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	//get方法
	public String getRemark() {
		return remark;
	}

	//set方法
	public void setRemark(String remark) {
		this.remark = remark;
	}
	//get方法
	public String getUpdateBy() {
		return updateBy;
	}

	//set方法
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	//get方法
	public Date getUpdateTime() {
		return updateTime;
	}

	//set方法
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


}
