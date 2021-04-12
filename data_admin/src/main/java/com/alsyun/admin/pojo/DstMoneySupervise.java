package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:Markburt
 * @Description:DstMoneySupervise构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "DstMoneySupervise",value = "DstMoneySupervise")
@Table(name="dst_money_supervise")
public class DstMoneySupervise implements Serializable{

	@ApiModelProperty(value = "id",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//id

	@ApiModelProperty(value = "商品id",required = false)
    @Column(name = "order_id")
	private String orderId;//商品id

	@ApiModelProperty(value = "商品名称",required = false)
    @Column(name = "order_name")
	private String orderName;//商品名称

	@ApiModelProperty(value = "支付方式（）",required = false)
    @Column(name = "pay_method")
	private String payMethod;//支付方式（）

	@ApiModelProperty(value = "交易类型",required = false)
    @Column(name = "pay_type")
	private String payType;//交易类型

	@ApiModelProperty(value = "交易金额",required = false)
    @Column(name = "pay_money")
	private String payMoney;//交易金额

	@ApiModelProperty(value = "创建人",required = false)
    @Column(name = "create_by")
	private String createBy;//创建人

	@ApiModelProperty(value = "创建时间",required = false)
    @Column(name = "create_time")
	private Date createTime;//创建时间

	@ApiModelProperty(value = "更新人",required = false)
    @Column(name = "update_by")
	private String updateBy;//更新人

	@ApiModelProperty(value = "更新时间",required = false)
    @Column(name = "update_time")
	private Date updateTime;//更新时间

	@ApiModelProperty(value = "备注",required = false)
    @Column(name = "remark")
	private String remark;//备注



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public String getOrderId() {
		return orderId;
	}

	//set方法
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	//get方法
	public String getOrderName() {
		return orderName;
	}

	//set方法
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	//get方法
	public String getPayMethod() {
		return payMethod;
	}

	//set方法
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	//get方法
	public String getPayType() {
		return payType;
	}

	//set方法
	public void setPayType(String payType) {
		this.payType = payType;
	}
	//get方法
	public String getPayMoney() {
		return payMoney;
	}

	//set方法
	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
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
	//get方法
	public String getRemark() {
		return remark;
	}

	//set方法
	public void setRemark(String remark) {
		this.remark = remark;
	}


}
