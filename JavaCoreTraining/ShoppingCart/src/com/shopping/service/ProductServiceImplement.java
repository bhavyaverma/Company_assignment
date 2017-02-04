package com.shopping.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.dao.ProductDao;
import com.shopping.dao.ProductDaoImplement;
import com.shopping.domain.product;


/**
 * Created by bhavyaverma on 2/2/17.
 */
public class ProductServiceImplement implements ProductService {
    @Override
    public void creatProd(File file) throws FileNotFoundException, IOException, SQLException {


            ProductDao pdi = new ProductDaoImplement();

            pdi.createProd(file);
    }

    @Override
    public void deleteProd(int id) throws SQLException {
        ProductDao pdd = new ProductDaoImplement();
        pdd.deleteProd(id);
    }

    @Override
    public void updateProd(int id) throws IOException, SQLException {
        ProductDao pdu = new ProductDaoImplement();
        pdu.updateProd(id);
    }

    @Override
    public List<product> getallprods() throws SQLException {

            List<product> list1 = new ArrayList<>();
            ProductDao pd = new ProductDaoImplement();
            list1 = pd.getallprods();

            return list1;
        }

    }



