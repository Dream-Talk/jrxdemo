package com.personal.domain;

import com.personal.utils.DateUtils;

import java.util.Date;
import java.util.List;

public class Order {
    private String id;
    private String productName;
    private Date orderTime;
    private String orderDesc;
    private double productPrice;
    private String orderStatus;
    private String productId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", orderTime=" + orderTime +
                ", orderDesc='" + orderDesc + '\'' +
                ", productPrice=" + productPrice +
                ", orderStatus='" + orderStatus + '\'' +
                ", productId='" + productId + '\'' +
                '}';
    }
}
