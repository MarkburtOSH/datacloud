package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:Markburt
 * @Description:DstAccount构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "DstAccount",value = "DstAccount")
@Table(name="dst_account")
public class DstAccount implements Serializable{

	@ApiModelProperty(value = "id",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//id

	@ApiModelProperty(value = "账户id",required = false)
    @Column(name = "account_id")
	private Integer accountId;//账户id

	@ApiModelProperty(value = "开户名称",required = false)
    @Column(name = "account_name")
	private String accountName;//开户名称

	@ApiModelProperty(value = "法人",required = false)
    @Column(name = "legal_person")
	private String legalPerson;//法人

	@ApiModelProperty(value = "电话",required = false)
    @Column(name = "phone")
	private String phone;//电话

	@ApiModelProperty(value = "余额",required = false)
    @Column(name = "remainder")
	private String remainder;//余额

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
	public String getLegalPerson() {
		return legalPerson;
	}

	//set方法
	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}
	//get方法
	public String getPhone() {
		return phone;
	}

	//set方法
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//get方法
	public String getRemainder() {
		return remainder;
	}

	//set方法
	public void setRemainder(String remainder) {
		this.remainder = remainder;
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
