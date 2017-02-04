package com.shopping.service;
import com.shopping.domain.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;



/**
 * Created by bhavyaverma on 2/2/17.
 */
public interface UserService {

public List <user> getallusers() throws SQLException ;
//public void createuser(user u1) throws SQLException;

    void createuser(List l1);

    public void createuser(File file) throws FileNotFoundException, IOException, SQLException;

    public void updateuser(int id) throws IOException, SQLException;
    public void deleteuser(int id ) throws SQLException, FileNotFoundException;

    //public void displayuserbyid(int id) throws SQLException;



}
