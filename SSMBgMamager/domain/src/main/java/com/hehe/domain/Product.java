package com.hehe.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

import static com.hehe.utils.date.Trans.Date2String;

public class Product implements Serializable{
    private String id; // 主键
    private String productNum;//编号 唯一
    private String productName; // 名称
    private String cityName; // 出发城市
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date departureTime; // 出发时间
    private String departureTimeStr;
    private double productPrice; // 产品价格
    private String productDesc; // 产品描述
    private Integer productStatus; // 状态 0 关闭 1 开启
    private String productStatusStr;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productNum='" + productNum + '\'' +
                ", productName='" + productName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime=" + departureTime +
                ", departureTimeStr='" + departureTimeStr + '\'' +
                ", productPrice=" + productPrice +
                ", productDesc='" + productDesc + '\'' +
                ", productStatus=" + productStatus +
                ", productStatusStr='" + productStatusStr + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
    }

    public void setProductStatusStr(String productStatusStr) {
        this.productStatusStr = productStatusStr;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }


    public String getId() {
        return id;
    }

    public String getProductNum() {
        return productNum;
    }

    public String getProductName() {
        return productName;
    }

    public String getCityName() {
        return cityName;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public String getDepartureTimeStr() {
        if (departureTime != null){
            departureTimeStr = Date2String(departureTime,"yyyy-MM-dd HH:mm:ss");
        }
        return departureTimeStr;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public String getProductStatusStr() {
        if (productStatus!=null){
            if (productStatus==0)
                productStatusStr = "关闭";
            else
                productStatusStr = "开启";
        }
        return productStatusStr;
    }
}

