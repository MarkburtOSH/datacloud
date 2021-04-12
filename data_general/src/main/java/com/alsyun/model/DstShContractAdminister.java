package com.alsyun.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class DstShContractAdminister implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "账户id")
    private String accountId;

    @ApiModelProperty(value = "商户名称")
    private String accountName;

    @ApiModelProperty(value = "法人")
    private String legalPerson;

    @ApiModelProperty(value = "手机号")
    private String phonenumber;

    @ApiModelProperty(value = "法人身份证号")
    private String authenticate;

    @ApiModelProperty(value = "法人身份证照片正面")
    private String corporImgOne;

    @ApiModelProperty(value = "法人身份证照片反面")
    private String corporImgTwo;

    @ApiModelProperty(value = "营业执照照片")
    private String creditImg;

    @ApiModelProperty(value = "删除标志（0正常，1停用，2删除）")
    private String delFlag;

    @ApiModelProperty(value = "审核状态（0成功，1正在审核，2审核失败）")
    private String examine;

    @ApiModelProperty(value = "名单管理（0正常，1白名单，2黑名单）")
    private String rosterType;

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

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate(String authenticate) {
        this.authenticate = authenticate;
    }

    public String getCorporImgOne() {
        return corporImgOne;
    }

    public void setCorporImgOne(String corporImgOne) {
        this.corporImgOne = corporImgOne;
    }

    public String getCorporImgTwo() {
        return corporImgTwo;
    }

    public void setCorporImgTwo(String corporImgTwo) {
        this.corporImgTwo = corporImgTwo;
    }

    public String getCreditImg() {
        return creditImg;
    }

    public void setCreditImg(String creditImg) {
        this.creditImg = creditImg;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine;
    }

    public String getRosterType() {
        return rosterType;
    }

    public void setRosterType(String rosterType) {
        this.rosterType = rosterType;
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
        sb.append(", accountId=").append(accountId);
        sb.append(", accountName=").append(accountName);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", authenticate=").append(authenticate);
        sb.append(", corporImgOne=").append(corporImgOne);
        sb.append(", corporImgTwo=").append(corporImgTwo);
        sb.append(", creditImg=").append(creditImg);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", examine=").append(examine);
        sb.append(", rosterType=").append(rosterType);
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