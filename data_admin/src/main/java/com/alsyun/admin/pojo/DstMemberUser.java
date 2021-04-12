package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:Markburt
 * @Description:DstMemberUser构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "DstMemberUser",value = "DstMemberUser")
@Table(name="dst_member_user")
public class DstMemberUser implements Serializable{

	@ApiModelProperty(value = "id",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//id

	@ApiModelProperty(value = "账户id",required = false)
    @Column(name = "user_id")
	private String userId;//账户id

	@ApiModelProperty(value = "账户名",required = false)
    @Column(name = "user_name")
	private String userName;//账户名

	@ApiModelProperty(value = "密码",required = false)
    @Column(name = "password")
	private String password;//密码

	@ApiModelProperty(value = "手机号",required = false)
    @Column(name = "phonenumber")
	private String phonenumber;//手机号

	@ApiModelProperty(value = "法人身份证号",required = false)
    @Column(name = "authenticate")
	private String authenticate;//法人身份证号

	@ApiModelProperty(value = "法人身份证照片正面",required = false)
    @Column(name = "corpor_img_one")
	private String corporImgOne;//法人身份证照片正面

	@ApiModelProperty(value = "法人身份证照片反面",required = false)
    @Column(name = "corpor_img_two")
	private String corporImgTwo;//法人身份证照片反面

	@ApiModelProperty(value = "营业执照照片",required = false)
    @Column(name = "credit_img")
	private String creditImg;//营业执照照片

	@ApiModelProperty(value = "佣金%",required = false)
    @Column(name = "commission")
	private String commission;//佣金%

	@ApiModelProperty(value = "余额",required = false)
    @Column(name = "remainder")
	private String remainder;//余额

	@ApiModelProperty(value = "会员类型（0个人会员，1企业会员）",required = false)
    @Column(name = "user_type")
	private String userType;//会员类型（0个人会员，1企业会员）

	@ApiModelProperty(value = "删除标志（0正常，1停用，2删除）",required = false)
    @Column(name = "del_flag")
	private String delFlag;//删除标志（0正常，1停用，2删除）

	@ApiModelProperty(value = "审核状态（0成功，1正在审核，2审核失败）",required = false)
    @Column(name = "examine")
	private String examine;//审核状态（0成功，1正在审核，2审核失败）

	@ApiModelProperty(value = "名单管理（0正常，1白名单，2黑名单）",required = false)
    @Column(name = "roster_type")
	private String rosterType;//名单管理（0正常，1白名单，2黑名单）

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
	public String getUserId() {
		return userId;
	}

	//set方法
	public void setUserId(String userId) {
		this.userId = userId;
	}
	//get方法
	public String getUserName() {
		return userName;
	}

	//set方法
	public void setUserName(String userName) {
		this.userName = userName;
	}
	//get方法
	public String getPassword() {
		return password;
	}

	//set方法
	public void setPassword(String password) {
		this.password = password;
	}
	//get方法
	public String getPhonenumber() {
		return phonenumber;
	}

	//set方法
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	//get方法
	public String getAuthenticate() {
		return authenticate;
	}

	//set方法
	public void setAuthenticate(String authenticate) {
		this.authenticate = authenticate;
	}
	//get方法
	public String getCorporImgOne() {
		return corporImgOne;
	}

	//set方法
	public void setCorporImgOne(String corporImgOne) {
		this.corporImgOne = corporImgOne;
	}
	//get方法
	public String getCorporImgTwo() {
		return corporImgTwo;
	}

	//set方法
	public void setCorporImgTwo(String corporImgTwo) {
		this.corporImgTwo = corporImgTwo;
	}
	//get方法
	public String getCreditImg() {
		return creditImg;
	}

	//set方法
	public void setCreditImg(String creditImg) {
		this.creditImg = creditImg;
	}
	//get方法
	public String getCommission() {
		return commission;
	}

	//set方法
	public void setCommission(String commission) {
		this.commission = commission;
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
	public String getUserType() {
		return userType;
	}

	//set方法
	public void setUserType(String userType) {
		this.userType = userType;
	}
	//get方法
	public String getDelFlag() {
		return delFlag;
	}

	//set方法
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	//get方法
	public String getExamine() {
		return examine;
	}

	//set方法
	public void setExamine(String examine) {
		this.examine = examine;
	}
	//get方法
	public String getRosterType() {
		return rosterType;
	}

	//set方法
	public void setRosterType(String rosterType) {
		this.rosterType = rosterType;
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
