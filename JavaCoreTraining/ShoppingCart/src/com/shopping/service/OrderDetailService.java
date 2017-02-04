package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.shopping.domain.orderdetails;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public interface OrderDetailService {
    public void createorderdetails (File file) throws IOException, SQLException;
    public void updateorderdetail(int id) throws IOException, SQLException;
    public void deleteorderdetail(int id) throws SQLException;
    public List<orderdetails> getallorders() throws SQLException;
}
