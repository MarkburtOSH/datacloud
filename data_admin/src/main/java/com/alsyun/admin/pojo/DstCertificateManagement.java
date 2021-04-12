package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:Markburt
 * @Description:DstCertificateManagement构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "DstCertificateManagement",value = "DstCertificateManagement")
@Table(name="dst_certificate_management")
public class DstCertificateManagement implements Serializable{

	@ApiModelProperty(value = "id",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//id

	@ApiModelProperty(value = "账号id",required = false)
    @Column(name = "account_id")
	private String accountId;//账号id

	@ApiModelProperty(value = "证书号",required = false)
    @Column(name = "certificate")
	private String certificate;//证书号

	@ApiModelProperty(value = "证书照片",required = false)
    @Column(name = "certificate_img")
	private String certificateImg;//证书照片

	@ApiModelProperty(value = "审核状态（0成功，1正在审核，2审核失败）",required = false)
    @Column(name = "examine")
	private String examine;//审核状态（0成功，1正在审核，2审核失败）

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
	public String getAccountId() {
		return accountId;
	}

	//set方法
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	//get方法
	public String getCertificate() {
		return certificate;
	}

	//set方法
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	//get方法
	public String getCertificateImg() {
		return certificateImg;
	}

	//set方法
	public void setCertificateImg(String certificateImg) {
		this.certificateImg = certificateImg;
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
