package com.alsyun.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class ImsBaseStoreHotel implements Serializable {
    private Long id;

    @ApiModelProperty(value = "门店或酒店id")
    private String stroreHotelId;

    @ApiModelProperty(value = "名称")
    private String stroreHotelName;

    @ApiModelProperty(value = "0 门店  1酒店")
    private Short type;

    @ApiModelProperty(value = "用户名")
    private String username;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStroreHotelId() {
        return stroreHotelId;
    }

    public void setStroreHotelId(String stroreHotelId) {
        this.stroreHotelId = stroreHotelId;
    }

    public String getStroreHotelName() {
        return stroreHotelName;
    }

    public void setStroreHotelName(String stroreHotelName) {
        this.stroreHotelName = stroreHotelName;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stroreHotelId=").append(stroreHotelId);
        sb.append(", stroreHotelName=").append(stroreHotelName);
        sb.append(", type=").append(type);
        sb.append(", username=").append(username);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}