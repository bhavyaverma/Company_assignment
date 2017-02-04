package com.shopping.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.shopping.domain.product;

import com.shopping.utils.DBConnection;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class ProductDaoImplement implements ProductDao {
    Connection c1;
    Statement s1;
    String db1;

    public ProductDaoImplement() throws SQLException {
        c1 = DBConnection.getConnection();
        s1 = c1.createStatement();
    }

    @Override
    public void createProd(File file) throws IOException, SQLException {

        db1 = "INSERT INTO prod_details(prod_name , prod_code , prod_price , stock)" + "VALUES(?, ?, ?, ?); ";
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


            PreparedStatement ps1 = c1.prepareStatement(db1);
            ps1.setString(1, s0[0]);
            ps1.setString(2, s0[1]);
            ps1.setString(3, s0[2]);
            ps1.setString(4, s0[3]);
            ps1.executeUpdate();

            ps1.close();
        }


    }

    @Override
    public void deleteProd(int id) throws SQLException {
        db1 = "DELETE FROM prod_details where id = ?";
        PreparedStatement ps2 = c1.prepareStatement(db1);
        ps2.setInt(1, id);
        ps2.executeUpdate();
        ps2.close();
    }

    @Override
    public void updateProd(int id) throws SQLException {
        db1 = "UPDATE prod_details set prod_name=?, prod_code=?, prod_price=?, stock=? where id = ?";
        PreparedStatement ps3 = c1.prepareStatement(db1);
        ps3.setString(1, "Jam");
        ps3.setString(2, "J43");
        ps3.setDouble(3, 100);
        ps3.setInt(4, 34);
        ps3.setInt(5, id);
        ps3.executeUpdate();
        ps3.close();
    }

    @Override
    public List<product> getallprods() throws SQLException {
        List<product> prod = new ArrayList<>();
        ResultSet rs;
        db1 = "SELECT * FROM prod_details; ";
        try {
            rs = s1.executeQuery(db1);

            while (rs.next()) {
                product p = new product();
                int id1 = rs.getInt("id");
                String us1 = rs.getString("prod_name");
                String fn1 = rs.getString("prod_code");
                Double ln1 = rs.getDouble("prod_price");
                int ad1 = rs.getInt("stock");
                p.setId(id1);
                p.setName(us1);
                p.setCode(fn1);
                p.setPrice(ln1);
                p.setStock(ad1);
                prod.add(p);
            }


                return prod;
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            return prod;
        }


    }

