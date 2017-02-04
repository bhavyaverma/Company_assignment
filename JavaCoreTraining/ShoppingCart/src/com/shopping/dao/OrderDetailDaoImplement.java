package com.shopping.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.shopping.domain.orderdetails;
import com.shopping.utils.DBConnection;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class OrderDetailDaoImplement implements OrderDetailDao {

    Connection c4;
    Statement s4;

    String db4;

    public OrderDetailDaoImplement() throws SQLException {
        c4 = DBConnection.getConnection();
        s4 = c4.createStatement();

    }

    @Override
    public void createorderdetails(File file) throws IOException, SQLException {
        db4 = "INSERT INTO order_details(order_id , product_id , quantity, price, amount)" + "VALUES(?, ?, ?, ?, ?); ";
        File read = file;
        FileReader fr = new FileReader(read);
        BufferedReader br = new BufferedReader(fr);
        String s1;
        int i = 0;
        String[] str = new String[2];

        while ((s1 = br.readLine()) != null) {
            str[i] = s1;
            i++;
        }

        for (String s : str) {
            String[] s0 = s.split(",");


            PreparedStatement ps = c4.prepareStatement(db4);
            ps.setInt(1, Integer.parseInt(s0[0]));
            ps.setInt(2, Integer.parseInt(s0[1]));
            ps.setInt(3, Integer.parseInt(s0[2]));
            ps.setInt(4, Integer.parseInt(s0[3]));
            ps.setInt(4, Integer.parseInt(s0[4]));

            ps.executeUpdate();

            ps.close();
        }
    }

    @Override
    public List<orderdetails> getallorders() throws SQLException {
        return null;
    }

    @Override
    public void updateorderdetail(int id) throws IOException, SQLException {
        db4 = "UPDATE order_details set order_id=?, product_id=?, price=?, amount=?, where id = ?";
        PreparedStatement ps = null;
        ps = c4.prepareStatement(db4);
        ps.setInt(1, 3);
        ps.setInt(2, 7);
        ps.setDouble(3, 50);
        ps.setDouble(4, 60 );

        ps.setInt(5, id);
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void deleteorderdetail(int id) throws SQLException {
        db4 = "DELETE FROM order_details where id = ?";
        PreparedStatement ps3 = c4.prepareStatement(db4);
        ps3.setInt(1, id);
        ps3.executeUpdate();
        ps3.close();

    }
}
