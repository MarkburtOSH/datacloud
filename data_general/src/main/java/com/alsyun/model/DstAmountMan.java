package com.alsyun.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class DstAmountMan implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "交易单号")
    private String oddNumbers;

    @ApiModelProperty(value = "商铺id")
    private Integer accountId;

    @ApiModelProperty(value = "商铺名称")
    private String accountName;

    @ApiModelProperty(value = "交易数量")
    private String amount;

    @ApiModelProperty(value = "物品单位")
    private String unit;

    @ApiModelProperty(value = "交易金额")
    private String amountMoney;

    @ApiModelProperty(value = "付款方")
    private String paymentBy;

    @ApiModelProperty(value = "付款方账号")
    private String paymentAccount;

    @ApiModelProperty(value = "收款方")
    private String collectionBy;

    @ApiModelProperty(value = "收款方账号")
    private String collectionAccount;

    @ApiModelProperty(value = "佣金")
    private String commission;

    @ApiModelProperty(value = "余额")
    private String balance;

    @ApiModelProperty(value = "支付方式(0现金支付1微信支付2支付宝支付3聚合支付)")
    private String paymentMethod;

    @ApiModelProperty(value = "交易状态（0已支付1未支付2待支付3撤单中4撤单完成)")
    private String tradeState;

    @ApiModelProperty(value = "交易类型（出金方式，入金方式）")
    private String inOutMode;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(String oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(String amountMoney) {
        this.amountMoney = amountMoney;
    }

    public String getPaymentBy() {
        return paymentBy;
    }

    public void setPaymentBy(String paymentBy) {
        this.paymentBy = paymentBy;
    }

    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getCollectionBy() {
        return collectionBy;
    }

    public void setCollectionBy(String collectionBy) {
        this.collectionBy = collectionBy;
    }

    public String getCollectionAccount() {
        return collectionAccount;
    }

    public void setCollectionAccount(String collectionAccount) {
        this.collectionAccount = collectionAccount;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public String getInOutMode() {
        return inOutMode;
    }

    public void setInOutMode(String inOutMode) {
        this.inOutMode = inOutMode;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", oddNumbers=").append(oddNumbers);
        sb.append(", accountId=").append(accountId);
        sb.append(", accountName=").append(accountName);
        sb.append(", amount=").append(amount);
        sb.append(", unit=").append(unit);
        sb.append(", amountMoney=").append(amountMoney);
        sb.append(", paymentBy=").append(paymentBy);
        sb.append(", paymentAccount=").append(paymentAccount);
        sb.append(", collectionBy=").append(collectionBy);
        sb.append(", collectionAccount=").append(collectionAccount);
        sb.append(", commission=").append(commission);
        sb.append(", balance=").append(balance);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", tradeState=").append(tradeState);
        sb.append(", inOutMode=").append(inOutMode);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}