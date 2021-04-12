package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:Markburt
 * @Description:DstMemberUserCard构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "DstMemberUserCard",value = "DstMemberUserCard")
@Table(name="dst_member_user_card")
public class DstMemberUserCard implements Serializable{

	@ApiModelProperty(value = "id",required = false)
	@Id
    @Column(name = "id")
	private Integer id;//id

	@ApiModelProperty(value = "账户id",required = false)
    @Column(name = "user_id")
	private Integer userId;//账户id

	@ApiModelProperty(value = "持卡人",required = false)
    @Column(name = "cardholder")
	private String cardholder;//持卡人

	@ApiModelProperty(value = "银行卡号",required = false)
    @Column(name = "card_number")
	private Integer cardNumber;//银行卡号

	@ApiModelProperty(value = "银行卡预留手机号",required = false)
    @Column(name = "card_phone_number")
	private String cardPhoneNumber;//银行卡预留手机号

	@ApiModelProperty(value = "创建人",required = false)
    @Column(name = "create_by")
	private String createBy;//创建人

	@ApiModelProperty(value = "创建时间",required = false)
    @Column(name = "create_time")
	private Date createTime;//创建时间

	@ApiModelProperty(value = "备注",required = false)
    @Column(name = "remark")
	private String remark;//备注

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
	public Integer getUserId() {
		return userId;
	}

	//set方法
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	//get方法
	public String getCardholder() {
		return cardholder;
	}

	//set方法
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	//get方法
	public Integer getCardNumber() {
		return cardNumber;
	}

	//set方法
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}
	//get方法
	public String getCardPhoneNumber() {
		return cardPhoneNumber;
	}

	//set方法
	public void setCardPhoneNumber(String cardPhoneNumber) {
		this.cardPhoneNumber = cardPhoneNumber;
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
	public Date getUpdateTime() {
		return updateTime;
	}

	//set方法
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


}
