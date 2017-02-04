package com.shopping.dao;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import com.shopping.domain.*;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public interface ProductDao {
    public void createProd(File file) throws IOException, SQLException;
    public void deleteProd(int id) throws SQLException;
    public void updateProd(int id) throws SQLException;
    public List<product>  getallprods() throws SQLException;
}
