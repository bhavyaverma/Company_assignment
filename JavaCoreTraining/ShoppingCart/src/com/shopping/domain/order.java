package com.shopping.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by bhavyaverma on 1/25/17.
 */
public class order {
    private int id;
    private Date orderDate;
    private double amount;
    private int userId;
    private List<orderdetails> orderdetailsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<orderdetails> getOrderdetailsList() {
        return orderdetailsList;
    }

    public void setOrderdetailsList(List<orderdetails> orderdetailsList) {
        this.orderdetailsList = orderdetailsList;
    }
}
