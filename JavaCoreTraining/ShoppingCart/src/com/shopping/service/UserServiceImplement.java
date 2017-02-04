package com.shopping.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.shopping.dao.UserDao;

import com.shopping.dao.UserDaoImplement;
import com.shopping.domain.user;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class UserServiceImplement implements UserService {




    @Override
    public List<user> getallusers() throws SQLException {
        List<user> list = new ArrayList<>();
        UserDao ud = new UserDaoImplement();
        list = ud.getallusers();

        return list;
    }

    @Override
    public void createuser(List l1) {

    }

    @Override
    public void deleteuser(int id) throws SQLException {

        UserDao ud1 = new UserDaoImplement();
        ud1.deleteuser(id);

    }

  /*  @Override
    public void displayuserbyid(int id) throws SQLException {
        UserDao udd = new UserDaoImplement();
        udd.displayuserbyid(id);

    }*/




    @Override
    public void createuser(File file) throws FileNotFoundException, IOException, SQLException {

            UserDao udi = new UserDaoImplement();

            udi.createuser(file);


    }

    @Override
    public void updateuser(int id) throws IOException, SQLException {

        UserDao udu = new UserDaoImplement();
        udu.updateuser(id);



    }

    //@Override
    //public void createuser(List<user> l1) {

    }

   /* @Override
    public void createuser() {

    }

   /* @Override
    public void updatecuser(user u1) {

    }

    @Override
    public void deleteuser(user u1) {

    }*/

