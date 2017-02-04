package com.shopping.service;
import com.shopping.domain.product;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public interface ProductService {
    public void creatProd(File file) throws FileNotFoundException, IOException, SQLException;
    public void deleteProd(int id) throws SQLException;
    public void updateProd(int id) throws IOException, SQLException;
    public List<product>  getallprods() throws SQLException;


}

