package com.alsyun.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class ImsYzOrder implements Serializable {
    private Integer id;

    private Integer uniacid;

    private Integer uid;

    private String orderSn;

    private BigDecimal price;

    private BigDecimal goodsPrice;

    private Integer goodsTotal;

    @ApiModelProperty(value = "0:待付款;1:待发货;2:待收货;3:交易完成;-1:已关闭;")
    private Byte status;

    private Integer createTime;

    private Byte isDeleted;

    private Byte isMemberDeleted;

    private Integer finishTime;

    private Integer payTime;

    private Integer sendTime;

    private Integer cancelTime;

    private Integer createdAt;

    private Integer updatedAt;

    private Integer deletedAt;

    private Integer cancelPayTime;

    private Integer cancelSendTime;

    private Byte dispatchTypeId;

    private BigDecimal dispatchPrice;

    private BigDecimal discountPrice;

    private Byte payTypeId;

    private BigDecimal orderGoodsPrice;

    private BigDecimal deductionPrice;

    private Integer refundId;

    private Integer isPlugin;

    private BigDecimal changePrice;

    private BigDecimal changeDispatchPrice;

    private Byte commentStatus;

    private String orderPayId;

    private Byte isVirtual;

    private Integer pluginId;

    @ApiModelProperty(value = "柜子标识")
    private String mark;

    private Byte isPending;

    private BigDecimal costAmount;

    private String shopName;

    private Byte noRefund;

    @ApiModelProperty(value = "是否需要填写收货地址 0:是1:否")
    private Byte needAddress;

    private Integer invoiceType;

    private Integer riseType;

    private String collectName;

    private String companyNumber;

    private String invoice;

    @ApiModelProperty(value = "是否自动收货 0:是1:否")
    private Byte autoReceipt;

    private BigDecimal feeAmount;

    @ApiModelProperty(value = "是否导入到psi")
    private Integer isImport;

    @ApiModelProperty(value = "订单服务费金额")
    private BigDecimal serviceFeeAmount;

    @ApiModelProperty(value = "0 正常全部发货 1部分发货 2多包裹全部发货")
    private Integer isAllSendGoods;

    @ApiModelProperty(value = "预约时间")
    private String appointmentTime;

    private String note;

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

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsTotal() {
        return goodsTotal;
    }

    public void setGoodsTotal(Integer goodsTotal) {
        this.goodsTotal = goodsTotal;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Byte getIsMemberDeleted() {
        return isMemberDeleted;
    }

    public void setIsMemberDeleted(Byte isMemberDeleted) {
        this.isMemberDeleted = isMemberDeleted;
    }

    public Integer getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
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

    public Integer getCancelPayTime() {
        return cancelPayTime;
    }

    public void setCancelPayTime(Integer cancelPayTime) {
        this.cancelPayTime = cancelPayTime;
    }

    public Integer getCancelSendTime() {
        return cancelSendTime;
    }

    public void setCancelSendTime(Integer cancelSendTime) {
        this.cancelSendTime = cancelSendTime;
    }

    public Byte getDispatchTypeId() {
        return dispatchTypeId;
    }

    public void setDispatchTypeId(Byte dispatchTypeId) {
        this.dispatchTypeId = dispatchTypeId;
    }

    public BigDecimal getDispatchPrice() {
        return dispatchPrice;
    }

    public void setDispatchPrice(BigDecimal dispatchPrice) {
        this.dispatchPrice = dispatchPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Byte getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Byte payTypeId) {
        this.payTypeId = payTypeId;
    }

    public BigDecimal getOrderGoodsPrice() {
        return orderGoodsPrice;
    }

    public void setOrderGoodsPrice(BigDecimal orderGoodsPrice) {
        this.orderGoodsPrice = orderGoodsPrice;
    }

    public BigDecimal getDeductionPrice() {
        return deductionPrice;
    }

    public void setDeductionPrice(BigDecimal deductionPrice) {
        this.deductionPrice = deductionPrice;
    }

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public Integer getIsPlugin() {
        return isPlugin;
    }

    public void setIsPlugin(Integer isPlugin) {
        this.isPlugin = isPlugin;
    }

    public BigDecimal getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(BigDecimal changePrice) {
        this.changePrice = changePrice;
    }

    public BigDecimal getChangeDispatchPrice() {
        return changeDispatchPrice;
    }

    public void setChangeDispatchPrice(BigDecimal changeDispatchPrice) {
        this.changeDispatchPrice = changeDispatchPrice;
    }

    public Byte getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Byte commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getOrderPayId() {
        return orderPayId;
    }

    public void setOrderPayId(String orderPayId) {
        this.orderPayId = orderPayId;
    }

    public Byte getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Byte isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Integer getPluginId() {
        return pluginId;
    }

    public void setPluginId(Integer pluginId) {
        this.pluginId = pluginId;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Byte getIsPending() {
        return isPending;
    }

    public void setIsPending(Byte isPending) {
        this.isPending = isPending;
    }

    public BigDecimal getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getRiseType() {
        return riseType;
    }

    public void setRiseType(Integer riseType) {
        this.riseType = riseType;
    }

    public String getCollectName() {
        return collectName;
    }

    public void setCollectName(String collectName) {
        this.collectName = collectName;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public Byte getAutoReceipt() {
        return autoReceipt;
    }

    public void setAutoReceipt(Byte autoReceipt) {
        this.autoReceipt = autoReceipt;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Integer getIsImport() {
        return isImport;
    }

    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }

    public BigDecimal getServiceFeeAmount() {
        return serviceFeeAmount;
    }

    public void setServiceFeeAmount(BigDecimal serviceFeeAmount) {
        this.serviceFeeAmount = serviceFeeAmount;
    }

    public Integer getIsAllSendGoods() {
        return isAllSendGoods;
    }

    public void setIsAllSendGoods(Integer isAllSendGoods) {
        this.isAllSendGoods = isAllSendGoods;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        sb.append(", orderSn=").append(orderSn);
        sb.append(", price=").append(price);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsTotal=").append(goodsTotal);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", isMemberDeleted=").append(isMemberDeleted);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", cancelPayTime=").append(cancelPayTime);
        sb.append(", cancelSendTime=").append(cancelSendTime);
        sb.append(", dispatchTypeId=").append(dispatchTypeId);
        sb.append(", dispatchPrice=").append(dispatchPrice);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", payTypeId=").append(payTypeId);
        sb.append(", orderGoodsPrice=").append(orderGoodsPrice);
        sb.append(", deductionPrice=").append(deductionPrice);
        sb.append(", refundId=").append(refundId);
        sb.append(", isPlugin=").append(isPlugin);
        sb.append(", changePrice=").append(changePrice);
        sb.append(", changeDispatchPrice=").append(changeDispatchPrice);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", orderPayId=").append(orderPayId);
        sb.append(", isVirtual=").append(isVirtual);
        sb.append(", pluginId=").append(pluginId);
        sb.append(", mark=").append(mark);
        sb.append(", isPending=").append(isPending);
        sb.append(", costAmount=").append(costAmount);
        sb.append(", shopName=").append(shopName);
        sb.append(", noRefund=").append(noRefund);
        sb.append(", needAddress=").append(needAddress);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", riseType=").append(riseType);
        sb.append(", collectName=").append(collectName);
        sb.append(", companyNumber=").append(companyNumber);
        sb.append(", invoice=").append(invoice);
        sb.append(", autoReceipt=").append(autoReceipt);
        sb.append(", feeAmount=").append(feeAmount);
        sb.append(", isImport=").append(isImport);
        sb.append(", serviceFeeAmount=").append(serviceFeeAmount);
        sb.append(", isAllSendGoods=").append(isAllSendGoods);
        sb.append(", appointmentTime=").append(appointmentTime);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}