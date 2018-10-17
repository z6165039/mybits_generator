package com.jis.platform.enrol.entity;

import java.util.Date;

public class EnrolProductSku {
    private Long id;

    private Long productId;

    private String skuName;

    private Long costPrice;

    private Long salePrice;

    private Long needPoint;

    private Long givePoint;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public Long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Long getNeedPoint() {
        return needPoint;
    }

    public void setNeedPoint(Long needPoint) {
        this.needPoint = needPoint;
    }

    public Long getGivePoint() {
        return givePoint;
    }

    public void setGivePoint(Long givePoint) {
        this.givePoint = givePoint;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}