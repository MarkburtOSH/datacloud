package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:Markburt
 * @Description:ApiShop构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "ApiShop",value = "ApiShop")
@Table(name="api_shop")
public class ApiShop implements Serializable{

	@ApiModelProperty(value = "",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;//

	@ApiModelProperty(value = "第三方平台id",required = false)
    @Column(name = "yz_id")
	private String yzId;//第三方平台id

	@ApiModelProperty(value = "门店名称",required = false)
    @Column(name = "shop_name")
	private String shopName;//门店名称

	@ApiModelProperty(value = "门店id",required = false)
    @Column(name = "shop_id")
	private String shopId;//门店id

	@ApiModelProperty(value = "类型0 门店 1 酒店",required = false)
    @Column(name = "type")
	private Integer type;//类型0 门店 1 酒店

	@ApiModelProperty(value = "所属平台  0  富蕴电商平台  1  0距离",required = false)
    @Column(name = "pingtai")
	private Integer pingtai;//所属平台  0  富蕴电商平台  1  0距离

	@ApiModelProperty(value = "门店用户名",required = false)
    @Column(name = "username")
	private String username;//门店用户名

	@ApiModelProperty(value = "备注",required = false)
    @Column(name = "note")
	private String note;//备注

	@ApiModelProperty(value = "状态   -1 暂停 0 有效  ",required = false)
    @Column(name = "status")
	private Integer status;//状态   -1 暂停 0 有效  



	//get方法
	public Long getId() {
		return id;
	}

	//set方法
	public void setId(Long id) {
		this.id = id;
	}
	//get方法
	public String getYzId() {
		return yzId;
	}

	//set方法
	public void setYzId(String yzId) {
		this.yzId = yzId;
	}
	//get方法
	public String getShopName() {
		return shopName;
	}

	//set方法
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	//get方法
	public String getShopId() {
		return shopId;
	}

	//set方法
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	//get方法
	public Integer getType() {
		return type;
	}

	//set方法
	public void setType(Integer type) {
		this.type = type;
	}
	//get方法
	public Integer getPingtai() {
		return pingtai;
	}

	//set方法
	public void setPingtai(Integer pingtai) {
		this.pingtai = pingtai;
	}
	//get方法
	public String getUsername() {
		return username;
	}

	//set方法
	public void setUsername(String username) {
		this.username = username;
	}
	//get方法
	public String getNote() {
		return note;
	}

	//set方法
	public void setNote(String note) {
		this.note = note;
	}
	//get方法
	public Integer getStatus() {
		return status;
	}

	//set方法
	public void setStatus(Integer status) {
		this.status = status;
	}


}
