package com.alsyun.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class ImsYzOrderGoods implements Serializable {
    private Integer id;

    private Integer uniacid;

    private Integer orderId;

    private Integer goodsId;

    private String paySn;

    private Integer total;

    private Integer createAt;

    private BigDecimal price;

    private String goodsSn;

    private Integer uid;

    @ApiModelProperty(value = "商品图")
    private String thumb;

    private String title;

    private BigDecimal goodsPrice;

    private Integer goodsOptionId;

    private String goodsOptionTitle;

    private String productSn;

    private Integer createdAt;

    private Integer updatedAt;

    private BigDecimal discountPrice;

    private Byte commentStatus;

    private BigDecimal changePrice;

    private Integer commentId;

    private BigDecimal goodsMarketPrice;

    private BigDecimal goodsCostPrice;

    private BigDecimal vipPrice;

    private BigDecimal couponPrice;

    private BigDecimal paymentAmount;

    private BigDecimal deductionAmount;

    @ApiModelProperty(value = "是否需要填写收货地址 0:是1:否")
    private Byte needAddress;

    @ApiModelProperty(value = "是否导入到psi")
    private Integer isImport;

    @ApiModelProperty(value = "使用次数")
    private Integer playTime;

    @ApiModelProperty(value = "开始使用的时间")
    private Integer startTime;

    @ApiModelProperty(value = "借出项目")
    private String lendItems;

    @ApiModelProperty(value = "游玩时间")
    private Integer spendTime;

    @ApiModelProperty(value = "项目状态 0:未游玩 1:已游玩")
    private Integer status;

    @ApiModelProperty(value = "order_express表id  商品属于哪个包裹")
    private Integer orderExpressId;

    @ApiModelProperty(value = "预约时间")
    private String appointment;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getPaySn() {
        return paySn;
    }

    public void setPaySn(String paySn) {
        this.paySn = paySn;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsOptionId() {
        return goodsOptionId;
    }

    public void setGoodsOptionId(Integer goodsOptionId) {
        this.goodsOptionId = goodsOptionId;
    }

    public String getGoodsOptionTitle() {
        return goodsOptionTitle;
    }

    public void setGoodsOptionTitle(String goodsOptionTitle) {
        this.goodsOptionTitle = goodsOptionTitle;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
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

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Byte getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Byte commentStatus) {
        this.commentStatus = commentStatus;
    }

    public BigDecimal getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(BigDecimal changePrice) {
        this.changePrice = changePrice;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public BigDecimal getGoodsMarketPrice() {
        return goodsMarketPrice;
    }

    public void setGoodsMarketPrice(BigDecimal goodsMarketPrice) {
        this.goodsMarketPrice = goodsMarketPrice;
    }

    public BigDecimal getGoodsCostPrice() {
        return goodsCostPrice;
    }

    public void setGoodsCostPrice(BigDecimal goodsCostPrice) {
        this.goodsCostPrice = goodsCostPrice;
    }

    public BigDecimal getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(BigDecimal vipPrice) {
        this.vipPrice = vipPrice;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(BigDecimal deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public Byte getNeedAddress() {
        return needAddress;
    }

    public void setNeedAddress(Byte needAddress) {
        this.needAddress = needAddress;
    }

    public Integer getIsImport() {
        return isImport;
    }

    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }

    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public String getLendItems() {
        return lendItems;
    }

    public void setLendItems(String lendItems) {
        this.lendItems = lendItems;
    }

    public Integer getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderExpressId() {
        return orderExpressId;
    }

    public void setOrderExpressId(Integer orderExpressId) {
        this.orderExpressId = orderExpressId;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uniacid=").append(uniacid);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", paySn=").append(paySn);
        sb.append(", total=").append(total);
        sb.append(", createAt=").append(createAt);
        sb.append(", price=").append(price);
        sb.append(", goodsSn=").append(goodsSn);
        sb.append(", uid=").append(uid);
        sb.append(", thumb=").append(thumb);
        sb.append(", title=").append(title);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsOptionId=").append(goodsOptionId);
        sb.append(", goodsOptionTitle=").append(goodsOptionTitle);
        sb.append(", productSn=").append(productSn);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", changePrice=").append(changePrice);
        sb.append(", commentId=").append(commentId);
        sb.append(", goodsMarketPrice=").append(goodsMarketPrice);
        sb.append(", goodsCostPrice=").append(goodsCostPrice);
        sb.append(", vipPrice=").append(vipPrice);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", paymentAmount=").append(paymentAmount);
        sb.append(", deductionAmount=").append(deductionAmount);
        sb.append(", needAddress=").append(needAddress);
        sb.append(", isImport=").append(isImport);
        sb.append(", playTime=").append(playTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", lendItems=").append(lendItems);
        sb.append(", spendTime=").append(spendTime);
        sb.append(", status=").append(status);
        sb.append(", orderExpressId=").append(orderExpressId);
        sb.append(", appointment=").append(appointment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}