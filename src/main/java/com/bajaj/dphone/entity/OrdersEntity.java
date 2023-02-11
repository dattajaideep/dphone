package com.bajaj.dphone.entity;


import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "orders")
public class OrdersEntity {
    @Column(name="order_id")
    private int orderId;
    @Column(name = "user_Id")
    private int userid;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "order_quantity")
    private int orderQuantity;
    @Column(name = "total_price")
    private int orderTotalPrice;
    @Override
    public String toString() {
        return "OrdersEntity [orderId=" + orderId + ", userid=" + userid + ", orderDate=" + orderDate
                + ", orderQuantity=" + orderQuantity + ", orderTotalPrice=" + orderTotalPrice + "]";
    }
    public OrdersEntity() {
    }
    public OrdersEntity(int orderId, int userid, Date orderDate, int orderQuantity, int orderTotalPrice) {
        this.orderId = orderId;
        this.userid = userid;
        this.orderDate = orderDate;
        this.orderQuantity = orderQuantity;
        this.orderTotalPrice = orderTotalPrice;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public int getOrderQuantity() {
        return orderQuantity;
    }
    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
    public int getOrderTotalPrice() {
        return orderTotalPrice;
    }
    public void setOrderTotalPrice(int orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }
    

}
