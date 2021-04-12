package com.alsyun.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class ImsYzPluginStoreOrder implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer storeId;

    private Integer updatedAt;

    private Integer createdAt;

    private Integer deletedAt;

    private Boolean hasWithdraw;

    private Boolean hasSettlement;

    private BigDecimal settlementDays;

    private BigDecimal amount;

    private BigDecimal fee;

    private BigDecimal feePercentage;

    private Integer verificationClerkId;

    @ApiModelProperty(value = "支付方式id")
    private Integer payTypeId;

    private Integer withdrawMode;

    @ApiModelProperty(value = "结算时间")
    private Integer settleTime;

    @ApiModelProperty(value = "分账时间")
    private Integer splitTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
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

    public Boolean getHasWithdraw() {
        return hasWithdraw;
    }

    public void setHasWithdraw(Boolean hasWithdraw) {
        this.hasWithdraw = hasWithdraw;
    }

    public Boolean getHasSettlement() {
        return hasSettlement;
    }

    public void setHasSettlement(Boolean hasSettlement) {
        this.hasSettlement = hasSettlement;
    }

    public BigDecimal getSettlementDays() {
        return settlementDays;
    }

    public void setSettlementDays(BigDecimal settlementDays) {
        this.settlementDays = settlementDays;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getFeePercentage() {
        return feePercentage;
    }

    public void setFeePercentage(BigDecimal feePercentage) {
        this.feePercentage = feePercentage;
    }

    public Integer getVerificationClerkId() {
        return verificationClerkId;
    }

    public void setVerificationClerkId(Integer verificationClerkId) {
        this.verificationClerkId = verificationClerkId;
    }

    public Integer getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Integer payTypeId) {
        this.payTypeId = payTypeId;
    }

    public Integer getWithdrawMode() {
        return withdrawMode;
    }

    public void setWithdrawMode(Integer withdrawMode) {
        this.withdrawMode = withdrawMode;
    }

    public Integer getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Integer settleTime) {
        this.settleTime = settleTime;
    }

    public Integer getSplitTime() {
        return splitTime;
    }

    public void setSplitTime(Integer splitTime) {
        this.splitTime = splitTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", storeId=").append(storeId);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", hasWithdraw=").append(hasWithdraw);
        sb.append(", hasSettlement=").append(hasSettlement);
        sb.append(", settlementDays=").append(settlementDays);
        sb.append(", amount=").append(amount);
        sb.append(", fee=").append(fee);
        sb.append(", feePercentage=").append(feePercentage);
        sb.append(", verificationClerkId=").append(verificationClerkId);
        sb.append(", payTypeId=").append(payTypeId);
        sb.append(", withdrawMode=").append(withdrawMode);
        sb.append(", settleTime=").append(settleTime);
        sb.append(", splitTime=").append(splitTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}