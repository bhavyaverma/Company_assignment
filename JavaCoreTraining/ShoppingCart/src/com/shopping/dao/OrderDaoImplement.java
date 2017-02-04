package com.shopping.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import java.util.Date;

import com.shopping.domain.order;
import com.shopping.utils.DBConnection;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class OrderDaoImplement implements OrderDao {
    Connection c2;
    Statement s;

    String db2;
    public OrderDaoImplement() throws SQLException {
        c2 = DBConnection.getConnection();
        s = c2.createStatement();

        System.out.println("con");
    }

    @Override
    public void createorder(File file) throws IOException, SQLException {

        db2 = "INSERT INTO orders(order_date , amount , user_id)" + "VALUES(?, ?, ?); ";
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


            PreparedStatement ps = c2.prepareStatement(db2);
            ps.setString(1, s0[0]);
            ps.setString(2, s0[1]);
            ps.setString(3, s0[2]);
            ps.executeUpdate();

            ps.close();
        }
    }

    @Override
    public void updateorder(int id) throws IOException, SQLException {
        //DateFormat dateFormatYMD = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       // DateFormat dateFormatMDY = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        //Date now = new Date();

        //String vDateYMD = dateFormatYMD.format(now);
        //String vDateMDY = dateFormatMDY.format(now);
       // String vDateMDYSQL =  vDateMDY ;
        //java.sql.Date date = new java.sql.Date(0000-00-00);



        db2 = "UPDATE orders set order_date=?, amount=?, user_id=?, where id = ?";
        PreparedStatement ps = null;
                ps = c2.prepareStatement(db2);
        ps.setDate(1, java.sql.Date.valueOf("2013-09-04"));
       // ps.setDate(1, date.valueOf(vDateMDYSQL));
        ps.setDouble(2, 400);
        ps.setInt(3, 5);

        ps.setInt(4, id);
        ps.executeUpdate();
        ps.close();

    }

    @Override
    public void deleteorder(int id) throws SQLException {
        db2 = "DELETE FROM orders where id = ?";
        PreparedStatement ps3 = c2.prepareStatement(db2);
        ps3.setInt(1, id);
        ps3.executeUpdate();
        ps3.close();
    }


}
