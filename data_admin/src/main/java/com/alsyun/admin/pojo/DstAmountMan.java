package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:Markburt
 * @Description:DstAmountMan构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "DstAmountMan",value = "DstAmountMan")
@Table(name="dst_amount_man")
public class DstAmountMan implements Serializable{

	@ApiModelProperty(value = "id",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;//id

	@ApiModelProperty(value = "交易单号",required = false)
    @Column(name = "odd_Numbers")
	private String oddNumbers;//交易单号

	@ApiModelProperty(value = "商铺id",required = false)
    @Column(name = "account_id")
	private Integer accountId;//商铺id

	@ApiModelProperty(value = "商铺名称",required = false)
    @Column(name = "account_name")
	private String accountName;//商铺名称

	@ApiModelProperty(value = "交易数量",required = false)
    @Column(name = "amount")
	private String amount;//交易数量

	@ApiModelProperty(value = "物品单位",required = false)
    @Column(name = "unit")
	private String unit;//物品单位

	@ApiModelProperty(value = "交易金额",required = false)
    @Column(name = "amount_money")
	private String amountMoney;//交易金额

	@ApiModelProperty(value = "付款方",required = false)
    @Column(name = "payment_by")
	private String paymentBy;//付款方

	@ApiModelProperty(value = "付款方账号",required = false)
    @Column(name = "payment_account")
	private String paymentAccount;//付款方账号

	@ApiModelProperty(value = "收款方",required = false)
    @Column(name = "collection_by")
	private String collectionBy;//收款方

	@ApiModelProperty(value = "收款方账号",required = false)
    @Column(name = "collection_account")
	private String collectionAccount;//收款方账号

	@ApiModelProperty(value = "佣金",required = false)
    @Column(name = "commission")
	private String commission;//佣金

	@ApiModelProperty(value = "余额",required = false)
    @Column(name = "balance")
	private String balance;//余额

	@ApiModelProperty(value = "支付方式(0现金支付1微信支付2支付宝支付3聚合支付)",required = false)
    @Column(name = "payment_method")
	private String paymentMethod;//支付方式(0现金支付1微信支付2支付宝支付3聚合支付)

	@ApiModelProperty(value = "交易状态（0已支付1未支付2待支付3撤单中4撤单完成)",required = false)
    @Column(name = "trade_state")
	private String tradeState;//交易状态（0已支付1未支付2待支付3撤单中4撤单完成)

	@ApiModelProperty(value = "交易类型（出金方式，入金方式）",required = false)
    @Column(name = "in_out_mode")
	private String inOutMode;//交易类型（出金方式，入金方式）

	@ApiModelProperty(value = "创建人",required = false)
    @Column(name = "create_by")
	private String createBy;//创建人

	@ApiModelProperty(value = "创建时间",required = false)
    @Column(name = "create_time")
	private Date createTime;//创建时间

	@ApiModelProperty(value = "备注",required = false)
    @Column(name = "remark")
	private String remark;//备注

	@ApiModelProperty(value = "更新人",required = false)
    @Column(name = "update_by")
	private String updateBy;//更新人

	@ApiModelProperty(value = "更新时间",required = false)
    @Column(name = "update_time")
	private Date updateTime;//更新时间



	//get方法
	public Integer getId() {
		return id;
	}

	//set方法
	public void setId(Integer id) {
		this.id = id;
	}
	//get方法
	public String getOddNumbers() {
		return oddNumbers;
	}

	//set方法
	public void setOddNumbers(String oddNumbers) {
		this.oddNumbers = oddNumbers;
	}
	//get方法
	public Integer getAccountId() {
		return accountId;
	}

	//set方法
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	//get方法
	public String getAccountName() {
		return accountName;
	}

	//set方法
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	//get方法
	public String getAmount() {
		return amount;
	}

	//set方法
	public void setAmount(String amount) {
		this.amount = amount;
	}
	//get方法
	public String getUnit() {
		return unit;
	}

	//set方法
	public void setUnit(String unit) {
		this.unit = unit;
	}
	//get方法
	public String getAmountMoney() {
		return amountMoney;
	}

	//set方法
	public void setAmountMoney(String amountMoney) {
		this.amountMoney = amountMoney;
	}
	//get方法
	public String getPaymentBy() {
		return paymentBy;
	}

	//set方法
	public void setPaymentBy(String paymentBy) {
		this.paymentBy = paymentBy;
	}
	//get方法
	public String getPaymentAccount() {
		return paymentAccount;
	}

	//set方法
	public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	//get方法
	public String getCollectionBy() {
		return collectionBy;
	}

	//set方法
	public void setCollectionBy(String collectionBy) {
		this.collectionBy = collectionBy;
	}
	//get方法
	public String getCollectionAccount() {
		return collectionAccount;
	}

	//set方法
	public void setCollectionAccount(String collectionAccount) {
		this.collectionAccount = collectionAccount;
	}
	//get方法
	public String getCommission() {
		return commission;
	}

	//set方法
	public void setCommission(String commission) {
		this.commission = commission;
	}
	//get方法
	public String getBalance() {
		return balance;
	}

	//set方法
	public void setBalance(String balance) {
		this.balance = balance;
	}
	//get方法
	public String getPaymentMethod() {
		return paymentMethod;
	}

	//set方法
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	//get方法
	public String getTradeState() {
		return tradeState;
	}

	//set方法
	public void setTradeState(String tradeState) {
		this.tradeState = tradeState;
	}
	//get方法
	public String getInOutMode() {
		return inOutMode;
	}

	//set方法
	public void setInOutMode(String inOutMode) {
		this.inOutMode = inOutMode;
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
	public String getRemark() {
		return remark;
	}

	//set方法
	public void setRemark(String remark) {
		this.remark = remark;
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


}
