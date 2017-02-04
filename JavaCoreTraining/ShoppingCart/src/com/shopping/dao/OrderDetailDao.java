package com.shopping.dao;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.shopping.domain.orderdetails;
import com.shopping.utils.DBConnection;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public interface OrderDetailDao {


    public void createorderdetails (File file) throws IOException, SQLException;
    public void updateorderdetail(int id) throws IOException, SQLException;
    public void deleteorderdetail(int id) throws SQLException;
    public List<orderdetails> getallorders() throws SQLException;


}
