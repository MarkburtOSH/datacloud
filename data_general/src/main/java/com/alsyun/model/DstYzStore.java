package com.alsyun.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DstYzStore implements Serializable {
    private Integer id;

    private Integer uniacid;

    private Integer uid;

    @ApiModelProperty(value = "店铺名称")
    private String storeName;

    @ApiModelProperty(value = "店铺权重")
    private Integer weight;

    private String thumb;

    private Integer categoryId;

    private Integer provinceId;

    private Integer cityId;

    private Integer districtId;

    private Integer streetId;

    private String longitude;

    private String latitude;

    private String mobile;

    private String username;

    private String password;

    private String templateId;

    private Integer cashierId;

    private Integer createdAt;

    private Integer updatedAt;

    private Integer deletedAt;

    private String businessHoursStart;

    private String businessHoursEnd;

    private String aptitudeImgs;

    private String dispatchType;

    private String affiche;

    private Integer userUid;

    private Boolean isBlack;

    private String bannerThumb;

    @ApiModelProperty(value = "0:显示/1:隐藏")
    private Byte isHide;

    @ApiModelProperty(value = "0:首页/1:商品页...")
    private Byte specifyShow;

    @ApiModelProperty(value = "0：经营/1:休息")
    private Byte operatingState;

    @ApiModelProperty(value = "老板uid")
    private Integer bossUid;

    @ApiModelProperty(value = "0:关闭|1：开启")
    private Byte audioOpen;

    private String initials;

    private Integer validity;

    @ApiModelProperty(value = "1失效")
    private Boolean validityStatus;

    @ApiModelProperty(value = "云喇叭iemi值")
    private String yunHorn;

    @ApiModelProperty(value = "zkc支付iemi值")
    private String zkcPay;

    private String salt;

    @ApiModelProperty(value = "首页小程序二维码地址")
    private String homeStoreUrl;

    @ApiModelProperty(value = "商品页小程序二维码地址")
    private String goodsStoreUrl;

    @ApiModelProperty(value = "收银台小程序二维码地址")
    private String collectMoneyUrl;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "门店介绍")
    private String storeIntroduce;

    private String salers;

    private String information;

    private String idCardImgs;

    private String otherImgs;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUniacid() {
        return uniacid;
    }

    public void setUniacid(Integer uniacid) {
        this.uniacid = uniacid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Integer getCashierId() {
        return cashierId;
    }

    public void setCashierId(Integer cashierId) {
        this.cashierId = cashierId;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Integer deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getBusinessHoursStart() {
        return businessHoursStart;
    }

    public void setBusinessHoursStart(String businessHoursStart) {
        this.businessHoursStart = businessHoursStart;
    }

    public String getBusinessHoursEnd() {
        return businessHoursEnd;
    }

    public void setBusinessHoursEnd(String businessHoursEnd) {
        this.businessHoursEnd = businessHoursEnd;
    }

    public String getAptitudeImgs() {
        return aptitudeImgs;
    }

    public void setAptitudeImgs(String aptitudeImgs) {
        this.aptitudeImgs = aptitudeImgs;
    }

    public String getDispatchType() {
        return dispatchType;
    }

    public void setDispatchType(String dispatchType) {
        this.dispatchType = dispatchType;
    }

    public String getAffiche() {
        return affiche;
    }

    public void setAffiche(String affiche) {
        this.affiche = affiche;
    }

    public Integer getUserUid() {
        return userUid;
    }

    public void setUserUid(Integer userUid) {
        this.userUid = userUid;
    }

    public Boolean getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(Boolean isBlack) {
        this.isBlack = isBlack;
    }

    public String getBannerThumb() {
        return bannerThumb;
    }

    public void setBannerThumb(String bannerThumb) {
        this.bannerThumb = bannerThumb;
    }

    public Byte getIsHide() {
        return isHide;
    }

    public void setIsHide(Byte isHide) {
        this.isHide = isHide;
    }

    public Byte getSpecifyShow() {
        return specifyShow;
    }

    public void setSpecifyShow(Byte specifyShow) {
        this.specifyShow = specifyShow;
    }

    public Byte getOperatingState() {
        return operatingState;
    }

    public void setOperatingState(Byte operatingState) {
        this.operatingState = operatingState;
    }

    public Integer getBossUid() {
        return bossUid;
    }

    public void setBossUid(Integer bossUid) {
        this.bossUid = bossUid;
    }

    public Byte getAudioOpen() {
        return audioOpen;
    }

    public void setAudioOpen(Byte audioOpen) {
        this.audioOpen = audioOpen;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    public Boolean getValidityStatus() {
        return validityStatus;
    }

    public void setValidityStatus(Boolean validityStatus) {
        this.validityStatus = validityStatus;
    }

    public String getYunHorn() {
        return yunHorn;
    }

    public void setYunHorn(String yunHorn) {
        this.yunHorn = yunHorn;
    }

    public String getZkcPay() {
        return zkcPay;
    }

    public void setZkcPay(String zkcPay) {
        this.zkcPay = zkcPay;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getHomeStoreUrl() {
        return homeStoreUrl;
    }

    public void setHomeStoreUrl(String homeStoreUrl) {
        this.homeStoreUrl = homeStoreUrl;
    }

    public String getGoodsStoreUrl() {
        return goodsStoreUrl;
    }

    public void setGoodsStoreUrl(String goodsStoreUrl) {
        this.goodsStoreUrl = goodsStoreUrl;
    }

    public String getCollectMoneyUrl() {
        return collectMoneyUrl;
    }

    public void setCollectMoneyUrl(String collectMoneyUrl) {
        this.collectMoneyUrl = collectMoneyUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreIntroduce() {
        return storeIntroduce;
    }

    public void setStoreIntroduce(String storeIntroduce) {
        this.storeIntroduce = storeIntroduce;
    }

    public String getSalers() {
        return salers;
    }

    public void setSalers(String salers) {
        this.salers = salers;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getIdCardImgs() {
        return idCardImgs;
    }

    public void setIdCardImgs(String idCardImgs) {
        this.idCardImgs = idCardImgs;
    }

    public String getOtherImgs() {
        return otherImgs;
    }

    public void setOtherImgs(String otherImgs) {
        this.otherImgs = otherImgs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uniacid=").append(uniacid);
        sb.append(", uid=").append(uid);
        sb.append(", storeName=").append(storeName);
        sb.append(", weight=").append(weight);
        sb.append(", thumb=").append(thumb);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", districtId=").append(districtId);
        sb.append(", streetId=").append(streetId);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", mobile=").append(mobile);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", templateId=").append(templateId);
        sb.append(", cashierId=").append(cashierId);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", businessHoursStart=").append(businessHoursStart);
        sb.append(", businessHoursEnd=").append(businessHoursEnd);
        sb.append(", aptitudeImgs=").append(aptitudeImgs);
        sb.append(", dispatchType=").append(dispatchType);
        sb.append(", affiche=").append(affiche);
        sb.append(", userUid=").append(userUid);
        sb.append(", isBlack=").append(isBlack);
        sb.append(", bannerThumb=").append(bannerThumb);
        sb.append(", isHide=").append(isHide);
        sb.append(", specifyShow=").append(specifyShow);
        sb.append(", operatingState=").append(operatingState);
        sb.append(", bossUid=").append(bossUid);
        sb.append(", audioOpen=").append(audioOpen);
        sb.append(", initials=").append(initials);
        sb.append(", validity=").append(validity);
        sb.append(", validityStatus=").append(validityStatus);
        sb.append(", yunHorn=").append(yunHorn);
        sb.append(", zkcPay=").append(zkcPay);
        sb.append(", salt=").append(salt);
        sb.append(", homeStoreUrl=").append(homeStoreUrl);
        sb.append(", goodsStoreUrl=").append(goodsStoreUrl);
        sb.append(", collectMoneyUrl=").append(collectMoneyUrl);
        sb.append(", address=").append(address);
        sb.append(", storeIntroduce=").append(storeIntroduce);
        sb.append(", salers=").append(salers);
        sb.append(", information=").append(information);
        sb.append(", idCardImgs=").append(idCardImgs);
        sb.append(", otherImgs=").append(otherImgs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}