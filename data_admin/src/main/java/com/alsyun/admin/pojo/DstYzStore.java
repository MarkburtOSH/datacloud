package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:Markburt
 * @Description:DstYzStore构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "DstYzStore",value = "DstYzStore")
@Table(name="dst_yz_store")
public class DstYzStore implements Serializable{

	@ApiModelProperty(value = "",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "uniacid")
	private Integer uniacid;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "uid")
	private Integer uid;//

	@ApiModelProperty(value = "店铺名称",required = false)
    @Column(name = "store_name")
	private String storeName;//店铺名称

	@ApiModelProperty(value = "店铺权重",required = false)
    @Column(name = "weight")
	private Integer weight;//店铺权重

	@ApiModelProperty(value = "",required = false)
    @Column(name = "thumb")
	private String thumb;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "category_id")
	private Integer categoryId;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "province_id")
	private Integer provinceId;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "city_id")
	private Integer cityId;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "district_id")
	private Integer districtId;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "street_id")
	private Integer streetId;//

	@ApiModelProperty(value = "地址",required = false)
    @Column(name = "address")
	private String address;//地址

	@ApiModelProperty(value = "",required = false)
    @Column(name = "longitude")
	private String longitude;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "latitude")
	private String latitude;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "mobile")
	private String mobile;//

	@ApiModelProperty(value = "门店介绍",required = false)
    @Column(name = "store_introduce")
	private String storeIntroduce;//门店介绍

	@ApiModelProperty(value = "",required = false)
    @Column(name = "username")
	private String username;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "password")
	private String password;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "template_id")
	private String templateId;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "salers")
	private String salers;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "cashier_id")
	private Integer cashierId;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "created_at")
	private Integer createdAt;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "updated_at")
	private Integer updatedAt;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "deleted_at")
	private Integer deletedAt;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "business_hours_start")
	private String businessHoursStart;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "business_hours_end")
	private String businessHoursEnd;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "aptitude_imgs")
	private String aptitudeImgs;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "dispatch_type")
	private String dispatchType;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "affiche")
	private String affiche;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "user_uid")
	private Integer userUid;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "information")
	private String information;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "is_black")
	private String isBlack;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "banner_thumb")
	private String bannerThumb;//

	@ApiModelProperty(value = "0:显示/1:隐藏",required = false)
    @Column(name = "is_hide")
	private Integer isHide;//0:显示/1:隐藏

	@ApiModelProperty(value = "0:首页/1:商品页...",required = false)
    @Column(name = "specify_show")
	private Integer specifyShow;//0:首页/1:商品页...

	@ApiModelProperty(value = "0：经营/1:休息",required = false)
    @Column(name = "operating_state")
	private Integer operatingState;//0：经营/1:休息

	@ApiModelProperty(value = "老板uid",required = false)
    @Column(name = "boss_uid")
	private Integer bossUid;//老板uid

	@ApiModelProperty(value = "0:关闭|1：开启",required = false)
    @Column(name = "audio_open")
	private Integer audioOpen;//0:关闭|1：开启

	@ApiModelProperty(value = "",required = false)
    @Column(name = "initials")
	private String initials;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "validity")
	private Integer validity;//

	@ApiModelProperty(value = "1失效",required = false)
    @Column(name = "validity_status")
	private String validityStatus;//1失效

	@ApiModelProperty(value = "",required = false)
    @Column(name = "id_card_imgs")
	private String idCardImgs;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "other_imgs")
	private String otherImgs;//

	@ApiModelProperty(value = "云喇叭iemi值",required = false)
    @Column(name = "yun_horn")
	private String yunHorn;//云喇叭iemi值

	@ApiModelProperty(value = "zkc支付iemi值",required = false)
    @Column(name = "zkc_pay")
	private String zkcPay;//zkc支付iemi值

	@ApiModelProperty(value = "",required = false)
    @Column(name = "salt")
	private String salt;//

	@ApiModelProperty(value = "首页小程序二维码地址",required = false)
    @Column(name = "home_store_url")
	private String homeStoreUrl;//首页小程序二维码地址

	@ApiModelProperty(value = "商品页小程序二维码地址",required = false)
    @Column(name = "goods_store_url")
	private String goodsStoreUrl;//商品页小程序二维码地址

	@ApiModelProperty(value = "收银台小程序二维码地址",required = false)
    @Column(name = "collect_money_url")
	private String collectMoneyUrl;//收银台小程序二维码地址



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public Integer getUniacid() {
		return uniacid;
	}

	//set方法
	public void setUniacid(Integer uniacid) {
		this.uniacid = uniacid;
	}
	//get方法
	public Integer getUid() {
		return uid;
	}

	//set方法
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	//get方法
	public String getStoreName() {
		return storeName;
	}

	//set方法
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	//get方法
	public Integer getWeight() {
		return weight;
	}

	//set方法
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	//get方法
	public String getThumb() {
		return thumb;
	}

	//set方法
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	//get方法
	public Integer getCategoryId() {
		return categoryId;
	}

	//set方法
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	//get方法
	public Integer getProvinceId() {
		return provinceId;
	}

	//set方法
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	//get方法
	public Integer getCityId() {
		return cityId;
	}

	//set方法
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	//get方法
	public Integer getDistrictId() {
		return districtId;
	}

	//set方法
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	//get方法
	public Integer getStreetId() {
		return streetId;
	}

	//set方法
	public void setStreetId(Integer streetId) {
		this.streetId = streetId;
	}
	//get方法
	public String getAddress() {
		return address;
	}

	//set方法
	public void setAddress(String address) {
		this.address = address;
	}
	//get方法
	public String getLongitude() {
		return longitude;
	}

	//set方法
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	//get方法
	public String getLatitude() {
		return latitude;
	}

	//set方法
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	//get方法
	public String getMobile() {
		return mobile;
	}

	//set方法
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	//get方法
	public String getStoreIntroduce() {
		return storeIntroduce;
	}

	//set方法
	public void setStoreIntroduce(String storeIntroduce) {
		this.storeIntroduce = storeIntroduce;
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
	public String getPassword() {
		return password;
	}

	//set方法
	public void setPassword(String password) {
		this.password = password;
	}
	//get方法
	public String getTemplateId() {
		return templateId;
	}

	//set方法
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	//get方法
	public String getSalers() {
		return salers;
	}

	//set方法
	public void setSalers(String salers) {
		this.salers = salers;
	}
	//get方法
	public Integer getCashierId() {
		return cashierId;
	}

	//set方法
	public void setCashierId(Integer cashierId) {
		this.cashierId = cashierId;
	}
	//get方法
	public Integer getCreatedAt() {
		return createdAt;
	}

	//set方法
	public void setCreatedAt(Integer createdAt) {
		this.createdAt = createdAt;
	}
	//get方法
	public Integer getUpdatedAt() {
		return updatedAt;
	}

	//set方法
	public void setUpdatedAt(Integer updatedAt) {
		this.updatedAt = updatedAt;
	}
	//get方法
	public Integer getDeletedAt() {
		return deletedAt;
	}

	//set方法
	public void setDeletedAt(Integer deletedAt) {
		this.deletedAt = deletedAt;
	}
	//get方法
	public String getBusinessHoursStart() {
		return businessHoursStart;
	}

	//set方法
	public void setBusinessHoursStart(String businessHoursStart) {
		this.businessHoursStart = businessHoursStart;
	}
	//get方法
	public String getBusinessHoursEnd() {
		return businessHoursEnd;
	}

	//set方法
	public void setBusinessHoursEnd(String businessHoursEnd) {
		this.businessHoursEnd = businessHoursEnd;
	}
	//get方法
	public String getAptitudeImgs() {
		return aptitudeImgs;
	}

	//set方法
	public void setAptitudeImgs(String aptitudeImgs) {
		this.aptitudeImgs = aptitudeImgs;
	}
	//get方法
	public String getDispatchType() {
		return dispatchType;
	}

	//set方法
	public void setDispatchType(String dispatchType) {
		this.dispatchType = dispatchType;
	}
	//get方法
	public String getAffiche() {
		return affiche;
	}

	//set方法
	public void setAffiche(String affiche) {
		this.affiche = affiche;
	}
	//get方法
	public Integer getUserUid() {
		return userUid;
	}

	//set方法
	public void setUserUid(Integer userUid) {
		this.userUid = userUid;
	}
	//get方法
	public String getInformation() {
		return information;
	}

	//set方法
	public void setInformation(String information) {
		this.information = information;
	}
	//get方法
	public String getIsBlack() {
		return isBlack;
	}

	//set方法
	public void setIsBlack(String isBlack) {
		this.isBlack = isBlack;
	}
	//get方法
	public String getBannerThumb() {
		return bannerThumb;
	}

	//set方法
	public void setBannerThumb(String bannerThumb) {
		this.bannerThumb = bannerThumb;
	}
	//get方法
	public Integer getIsHide() {
		return isHide;
	}

	//set方法
	public void setIsHide(Integer isHide) {
		this.isHide = isHide;
	}
	//get方法
	public Integer getSpecifyShow() {
		return specifyShow;
	}

	//set方法
	public void setSpecifyShow(Integer specifyShow) {
		this.specifyShow = specifyShow;
	}
	//get方法
	public Integer getOperatingState() {
		return operatingState;
	}

	//set方法
	public void setOperatingState(Integer operatingState) {
		this.operatingState = operatingState;
	}
	//get方法
	public Integer getBossUid() {
		return bossUid;
	}

	//set方法
	public void setBossUid(Integer bossUid) {
		this.bossUid = bossUid;
	}
	//get方法
	public Integer getAudioOpen() {
		return audioOpen;
	}

	//set方法
	public void setAudioOpen(Integer audioOpen) {
		this.audioOpen = audioOpen;
	}
	//get方法
	public String getInitials() {
		return initials;
	}

	//set方法
	public void setInitials(String initials) {
		this.initials = initials;
	}
	//get方法
	public Integer getValidity() {
		return validity;
	}

	//set方法
	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	//get方法
	public String getValidityStatus() {
		return validityStatus;
	}

	//set方法
	public void setValidityStatus(String validityStatus) {
		this.validityStatus = validityStatus;
	}
	//get方法
	public String getIdCardImgs() {
		return idCardImgs;
	}

	//set方法
	public void setIdCardImgs(String idCardImgs) {
		this.idCardImgs = idCardImgs;
	}
	//get方法
	public String getOtherImgs() {
		return otherImgs;
	}

	//set方法
	public void setOtherImgs(String otherImgs) {
		this.otherImgs = otherImgs;
	}
	//get方法
	public String getYunHorn() {
		return yunHorn;
	}

	//set方法
	public void setYunHorn(String yunHorn) {
		this.yunHorn = yunHorn;
	}
	//get方法
	public String getZkcPay() {
		return zkcPay;
	}

	//set方法
	public void setZkcPay(String zkcPay) {
		this.zkcPay = zkcPay;
	}
	//get方法
	public String getSalt() {
		return salt;
	}

	//set方法
	public void setSalt(String salt) {
		this.salt = salt;
	}
	//get方法
	public String getHomeStoreUrl() {
		return homeStoreUrl;
	}

	//set方法
	public void setHomeStoreUrl(String homeStoreUrl) {
		this.homeStoreUrl = homeStoreUrl;
	}
	//get方法
	public String getGoodsStoreUrl() {
		return goodsStoreUrl;
	}

	//set方法
	public void setGoodsStoreUrl(String goodsStoreUrl) {
		this.goodsStoreUrl = goodsStoreUrl;
	}
	//get方法
	public String getCollectMoneyUrl() {
		return collectMoneyUrl;
	}

	//set方法
	public void setCollectMoneyUrl(String collectMoneyUrl) {
		this.collectMoneyUrl = collectMoneyUrl;
	}


}
