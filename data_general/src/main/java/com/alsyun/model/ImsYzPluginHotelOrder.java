package com.alsyun.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ImsYzPluginHotelOrder implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer hotelId;

    private Byte hasWithdraw;

    private Byte hasSettlement;

    private BigDecimal settlementDays;

    private BigDecimal amount;

    private BigDecimal fee;

    private BigDecimal feePercentage;

    private Integer verificationClerkId;

    private Integer payTypeId;

    private Byte status;

    private Integer enterAt;

    private Integer leaveAt;

    private Integer updatedAt;

    private Integer createdAt;

    private Integer deletedAt;

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

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Byte getHasWithdraw() {
        return hasWithdraw;
    }

    public void setHasWithdraw(Byte hasWithdraw) {
        this.hasWithdraw = hasWithdraw;
    }

    public Byte getHasSettlement() {
        return hasSettlement;
    }

    public void setHasSettlement(Byte hasSettlement) {
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getEnterAt() {
        return enterAt;
    }

    public void setEnterAt(Integer enterAt) {
        this.enterAt = enterAt;
    }

    public Integer getLeaveAt() {
        return leaveAt;
    }

    public void setLeaveAt(Integer leaveAt) {
        this.leaveAt = leaveAt;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", hotelId=").append(hotelId);
        sb.append(", hasWithdraw=").append(hasWithdraw);
        sb.append(", hasSettlement=").append(hasSettlement);
        sb.append(", settlementDays=").append(settlementDays);
        sb.append(", amount=").append(amount);
        sb.append(", fee=").append(fee);
        sb.append(", feePercentage=").append(feePercentage);
        sb.append(", verificationClerkId=").append(verificationClerkId);
        sb.append(", payTypeId=").append(payTypeId);
        sb.append(", status=").append(status);
        sb.append(", enterAt=").append(enterAt);
        sb.append(", leaveAt=").append(leaveAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}