package com.shopping.dao;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import com.shopping.domain.*;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public interface UserDao {

public List<user>  getallusers() throws SQLException;

public void createuser(File file) throws IOException, SQLException;
public void updateuser(int id) throws SQLException;
public void deleteuser(int id) throws SQLException;
//public void displayuserbyid(int id) throws SQLException;


}
