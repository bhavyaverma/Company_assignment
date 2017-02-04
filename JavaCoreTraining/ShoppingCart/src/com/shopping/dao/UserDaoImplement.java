package com.shopping.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.lang.String;

import com.shopping.domain.user;
import com.shopping.utils.DBConnection;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class UserDaoImplement implements UserDao {


    Connection c;
    Statement s;
    String db;
    public UserDaoImplement() throws SQLException {
        c = DBConnection.getConnection();
        s = c.createStatement();
    }

   @Override
    public void createuser(File file) throws IOException, SQLException {


            db = "INSERT INTO user(user_name , first_name , last_name , address)" + "VALUES(?, ?, ?, ?); ";
            File read = file;
            FileReader fr = new FileReader(read);
            BufferedReader br = new BufferedReader(fr);
            String s1;
            int i = 0;
            String[] str = new String[3];

            while ((s1 = br.readLine()) != null) {
                str[i] = s1;
                i++;
            }

            for (String s : str) {
                String[] s0 = s.split(",");


                PreparedStatement ps = c.prepareStatement(db);
                ps.setString(1, s0[0]);
                ps.setString(2, s0[1]);
                ps.setString(3, s0[2]);
                ps.setString(4, s0[3]);
                ps.executeUpdate();

                ps.close();
            }






    }

    @Override
    public void updateuser(int id) throws SQLException {
        db = "UPDATE user set user_name=?, first_name=?, last_name=?, address=? where id = ?";
        PreparedStatement ps = c.prepareStatement(db);
        ps.setString(1, "Kiley33");
        ps.setString(2, "Kishy");
        ps.setString(3, "Chandani");
        ps.setString(4, "Chandigarh");
        ps.setInt(5, id);
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void deleteuser(int id) throws SQLException {

        db = "DELETE FROM user where id = ?";
        PreparedStatement ps2 = c.prepareStatement(db);
        ps2.setInt(1, id);

        ps2.executeUpdate();
        ps2.close();


    }

   /* @Override
    public void displayuserbyid(int id) throws SQLException {

        db = "SELECT * from user where id =?;";
        PreparedStatement ps = c.prepareStatement(db);

        ps.setInt(1, id);
try {
    ResultSet rs = ps.executeQuery(db);

    while (rs.next()) {
        int i = rs.getInt(1);
        String s1 = rs.getString(2);
        String s3 = rs.getString(3);
        String s4 = rs.getString(4);
        String s5 = rs.getString(5);

        System.out.println(i + "," + s1 + "," + s3 + "," + s4 + "," + s5);
    }
    rs.close();
    ps.close();
}catch (SQLException e)
{
    e.printStackTrace();
}


    }*/

   /* @Override
    public void displayuser(int id) throws SQLException {
        db ="SELECT * FROM user where id =?";
        PreparedStatement ps = c.prepareStatement(db);
        ps.setInt(1,id);
        ps.executeUpdate();
        System.out.println("");
        ps.close();

    }*/

    @Override
    public List<user> getallusers() {
        {
            List<user> users=new ArrayList<>();
            ResultSet rs ;
            db = "SELECT * FROM user; ";
            try {
                rs = s.executeQuery(db);

                while(rs.next())
                {
                    user u = new user();
                    int id1 =  rs.getInt("id");
                    String us1 = rs.getString("user_name");
                    String fn1 = rs.getString("first_name");
                    String ln1 =  rs.getString("last_name");
                    String ad1 =  rs.getString("address");
                    u.setId(id1);
                    u.setUserName(us1);
                    u.setFirstName(fn1);
                    u.setLastName(ln1);
                    u.setAddress(ad1);
                    users.add(u);
                }

                return users;
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return users;

        }

    }





}
