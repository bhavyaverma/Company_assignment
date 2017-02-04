package com.shopping.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.shopping.domain.orderdetails;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public interface OrderService {
    public void createorder(File file) throws IOException, SQLException;
    public void updateorder(int id) throws IOException, SQLException;
    public void deleteorder(int id) throws SQLException;

}
