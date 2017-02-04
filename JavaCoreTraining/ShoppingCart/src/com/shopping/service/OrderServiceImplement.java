package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.shopping.dao.OrderDao;
import com.shopping.dao.OrderDaoImplement;
import com.shopping.domain.orderdetails;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class OrderServiceImplement implements OrderService {
    @Override
    public void createorder(File file) throws IOException, SQLException {
        OrderDao od = new OrderDaoImplement();
        od.createorder(file);
    }

    @Override
    public void updateorder(int id) throws IOException, SQLException {
        OrderDao od1 = new OrderDaoImplement();
        od1.updateorder(id);
    }

    @Override
    public void deleteorder(int id) throws SQLException {
        OrderDao od2 = new OrderDaoImplement();
        od2.deleteorder(id);
    }


}
