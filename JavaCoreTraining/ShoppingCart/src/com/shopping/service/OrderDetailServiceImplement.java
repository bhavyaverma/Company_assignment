package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.shopping.dao.OrderDetailDao;
import com.shopping.dao.OrderDetailDaoImplement;

import com.shopping.domain.orderdetails;
import com.shopping.domain.user;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class OrderDetailServiceImplement implements OrderDetailService {
    @Override
    public void createorderdetails(File file) throws IOException, SQLException {
        OrderDetailDao odd = new OrderDetailDaoImplement();
        odd.createorderdetails(file);
    }

    @Override
    public void updateorderdetail (int id) throws IOException, SQLException {
        OrderDetailDao odd = new OrderDetailDaoImplement();
        odd.updateorderdetail(id);

    }

    @Override
    public void deleteorderdetail(int id) throws SQLException {
        OrderDetailDao odd = new OrderDetailDaoImplement();
        odd.deleteorderdetail(id);

    }

    @Override
    public List<orderdetails> getallorders() throws SQLException {
        List<orderdetails> list4 = new ArrayList<>();
        OrderDetailDao od = new OrderDetailDaoImplement();
        list4 = od.getallorders();

        return list4;
    }


}
