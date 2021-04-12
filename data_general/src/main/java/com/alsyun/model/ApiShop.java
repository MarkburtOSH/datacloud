package com.alsyun.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class ApiShop implements Serializable {
    private Long id;

    @ApiModelProperty(value = "第三方平台id")
    private String yzId;

    @ApiModelProperty(value = "门店名称")
    private String shopName;

    @ApiModelProperty(value = "门店id")
    private String shopId;

    @ApiModelProperty(value = "类型0 门店 1 酒店")
    private Short type;

    @ApiModelProperty(value = "所属平台  0  富蕴电商平台  1  0距离")
    private Short pingtai;

    @ApiModelProperty(value = "门店用户名")
    private String username;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "状态   -1 暂停 0 有效  ")
    private Short status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYzId() {
        return yzId;
    }

    public void setYzId(String yzId) {
        this.yzId = yzId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getPingtai() {
        return pingtai;
    }

    public void setPingtai(Short pingtai) {
        this.pingtai = pingtai;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", yzId=").append(yzId);
        sb.append(", shopName=").append(shopName);
        sb.append(", shopId=").append(shopId);
        sb.append(", type=").append(type);
        sb.append(", pingtai=").append(pingtai);
        sb.append(", username=").append(username);
        sb.append(", note=").append(note);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}