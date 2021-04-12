package com.alsyun.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class ImsYzGoods implements Serializable {
    private Integer id;

    private Byte isDeleted;

    private Integer uniacid;

    private Integer brandId;

    private Boolean type;

    private Boolean status;

    private Integer displayOrder;

    private String title;

    private String thumb;

    private String sku;

    private String description;

    private String goodsSn;

    private String productSn;

    private BigDecimal marketPrice;

    private BigDecimal price;

    private BigDecimal costPrice;

    private Integer stock;

    private Integer reduceStockMethod;

    private Integer showSales;

    private Integer realSales;

    private BigDecimal weight;

    private Integer hasOption;

    private Boolean isNew;

    private Boolean isHot;

    private Boolean isDiscount;

    private Boolean isRecommand;

    private Boolean isComment;

    private Integer createdAt;

    private Integer deletedAt;

    private Integer updatedAt;

    private Integer commentNum;

    private Integer isPlugin;

    private Integer pluginId;

    private Integer virtualSales;

    private Byte noRefund;

    @ApiModelProperty(value = "是否需要填写收货地址 0:是1:否")
    private Byte needAddress;

    @ApiModelProperty(value = "商品类型2")
    private Boolean type2;

    private Integer oldId;

    @ApiModelProperty(value = "最小购买量")
    private Float minLimit;

    @ApiModelProperty(value = "最大购买量")
    private Float maxLimit;

    @ApiModelProperty(value = "倍数购买")
    private Float multipleLimit;

    @ApiModelProperty(value = "是否导入到psi")
    private Integer isImport;

    @ApiModelProperty(value = "体积")
    private BigDecimal volume;

    @ApiModelProperty(value = "核销方式 1为计时;2为计次;3为租赁")
    private Integer checkType;

    @ApiModelProperty(value = "限制时间/次数")
    private Integer limitTime;

    @ApiModelProperty(value = "保险开关")
    private Integer insurance;

    @ApiModelProperty(value = "保险名")
    private String insuranceName;

    @ApiModelProperty(value = "保险价格")
    private BigDecimal insurancePrice;

    @ApiModelProperty(value = "预约开关")
    private Integer appoint;

    private String thumbUrl;

    private String content;

    @ApiModelProperty(value = "保险详情")
    private String insuranceInfo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getUniacid() {
        return uniacid;
    }

    public void setUniacid(Integer uniacid) {
        this.uniacid = uniacid;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getReduceStockMethod() {
        return reduceStockMethod;
    }

    public void setReduceStockMethod(Integer reduceStockMethod) {
        this.reduceStockMethod = reduceStockMethod;
    }

    public Integer getShowSales() {
        return showSales;
    }

    public void setShowSales(Integer showSales) {
        this.showSales = showSales;
    }

    public Integer getRealSales() {
        return realSales;
    }

    public void setRealSales(Integer realSales) {
        this.realSales = realSales;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getHasOption() {
        return hasOption;
    }

    public void setHasOption(Integer hasOption) {
        this.hasOption = hasOption;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public Boolean getIsRecommand() {
        return isRecommand;
    }

    public void setIsRecommand(Boolean isRecommand) {
        this.isRecommand = isRecommand;
    }

    public Boolean getIsComment() {
        return isComment;
    }

    public void setIsComment(Boolean isComment) {
        this.isComment = isComment;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Integer deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getIsPlugin() {
        return isPlugin;
    }

    public void setIsPlugin(Integer isPlugin) {
        this.isPlugin = isPlugin;
    }

    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    public Integer getVirtualSales() {
        return virtualSales;
    }

    public void setVirtualSales(Integer virtualSales) {
        this.virtualSales = virtualSales;
    }

    public Byte getNoRefund() {
        return noRefund;
    }

    public void setNoRefund(Byte noRefund) {
        this.noRefund = noRefund;
    }

    public Byte getNeedAddress() {
        return needAddress;
    }

    public void setNeedAddress(Byte needAddress) {
        this.needAddress = needAddress;
    }

    public Boolean getType2() {
        return type2;
    }

    public void setType2(Boolean type2) {
        this.type2 = type2;
    }

    public Integer getOldId() {
        return oldId;
    }

    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    public Float getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(Float minLimit) {
        this.minLimit = minLimit;
    }

    public Float getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(Float maxLimit) {
        this.maxLimit = maxLimit;
    }

    public Float getMultipleLimit() {
        return multipleLimit;
    }

    public void setMultipleLimit(Float multipleLimit) {
        this.multipleLimit = multipleLimit;
    }

    public Integer getIsImport() {
        return isImport;
    }

    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public Integer getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    public Integer getInsurance() {
        return insurance;
    }

    public void setInsurance(Integer insurance) {
        this.insurance = insurance;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public BigDecimal getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(BigDecimal insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Integer getAppoint() {
        return appoint;
    }

    public void setAppoint(Integer appoint) {
        this.appoint = appoint;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getInsuranceInfo() {
        return insuranceInfo;
    }

    public void setInsuranceInfo(String insuranceInfo) {
        this.insuranceInfo = insuranceInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", uniacid=").append(uniacid);
        sb.append(", brandId=").append(brandId);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", displayOrder=").append(displayOrder);
        sb.append(", title=").append(title);
        sb.append(", thumb=").append(thumb);
        sb.append(", sku=").append(sku);
        sb.append(", description=").append(description);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", productSn=").append(productSn);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", price=").append(price);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", stock=").append(stock);
        sb.append(", reduceStockMethod=").append(reduceStockMethod);
        sb.append(", showSales=").append(showSales);
        sb.append(", realSales=").append(realSales);
        sb.append(", weight=").append(weight);
        sb.append(", hasOption=").append(hasOption);
        sb.append(", isNew=").append(isNew);
        sb.append(", isHot=").append(isHot);
        sb.append(", isDiscount=").append(isDiscount);
        sb.append(", isRecommand=").append(isRecommand);
        sb.append(", isComment=").append(isComment);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", commentNum=").append(commentNum);
        sb.append(", isPlugin=").append(isPlugin);
        sb.append(", pluginId=").append(pluginId);
        sb.append(", virtualSales=").append(virtualSales);
        sb.append(", noRefund=").append(noRefund);
        sb.append(", needAddress=").append(needAddress);
        sb.append(", type2=").append(type2);
        sb.append(", oldId=").append(oldId);
        sb.append(", minLimit=").append(minLimit);
        sb.append(", maxLimit=").append(maxLimit);
        sb.append(", multipleLimit=").append(multipleLimit);
        sb.append(", isImport=").append(isImport);
        sb.append(", volume=").append(volume);
        sb.append(", checkType=").append(checkType);
        sb.append(", limitTime=").append(limitTime);
        sb.append(", insurance=").append(insurance);
        sb.append(", insuranceName=").append(insuranceName);
        sb.append(", insurancePrice=").append(insurancePrice);
        sb.append(", appoint=").append(appoint);
        sb.append(", thumbUrl=").append(thumbUrl);
        sb.append(", content=").append(content);
        sb.append(", insuranceInfo=").append(insuranceInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}