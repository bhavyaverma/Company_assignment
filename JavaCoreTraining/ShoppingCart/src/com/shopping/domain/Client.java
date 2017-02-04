package com.shopping.domain;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SyncFailedException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.shopping.service.*;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class Client {

    static UserService us;
    static ProductService ps;
    static OrderService os;
    static OrderDetailService ods;

    static {
        us = new UserServiceImplement();
        ps = new ProductServiceImplement();
        os = (OrderService) new OrderServiceImplement();
        ods = (OrderDetailService) new OrderDetailServiceImplement();
    }

    public static void main(String[] args) throws IOException, SQLException {

        int delid, delprodid, disu, upuid, uppid, upod, delordid, ods, dod, uod;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        File f = new File("/Users/bhavyaverma/Java/JavaCoreTraining/ShoppingCart/src/com/shopping/User");
        Client c = new Client();
        c.us.createuser(f);

        System.out.println("Enter the user id to delete");
        delid = Integer.parseInt(br.readLine());
        c.us.deleteuser(delid);

        System.out.println("Enter the user id to update");
        upuid = Integer.parseInt(br.readLine());
        c.us.updateuser(upuid);


       /* System.out.println("Enter the user id to display data");
        disu = Integer.parseInt(br.readLine());
        c.us.displayuserbyid(disu);
*/
        List<user> list = new ArrayList<>() ;
        try{
       list = c.us.getallusers();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        for(user u : list)
        {
            System.out.println(u.getId() + "," + u.getUserName() + ","  + u.getFirstName() + "," + u.getLastName() + "," + u.getAddress());

        }



        File f1 = new File("/Users/bhavyaverma/Java/JavaCoreTraining/ShoppingCart/src/com/shopping/Product");
        Client c1 = new Client();
        c1.ps.creatProd(f1);



       System.out.println("Enter the product id to delete");
        delprodid = Integer.parseInt(br.readLine());
        c1.ps.deleteProd(delprodid);

        System.out.println("Enter the prod id to update");
        uppid = Integer.parseInt(br.readLine());
        c1.ps.updateProd(uppid);

        List<product> list1 = new ArrayList<>() ;
        try{
            list1 = c1.ps.getallprods();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        for(product p : list1)
        {
            System.out.println(p.getId() + "," + p.getName() + ","  + p.getCode() + "," + p.getPrice() + "," + p.getStock());

        }





        File f2 = new File ("/Users/bhavyaverma/Java/JavaCoreTraining/ShoppingCart/src/com/shopping/Order");
        Client c2 = new Client();
        c2.os.createorder(f2);


        System.out.println("Enter the order id to delete");
        delordid = Integer.parseInt(br.readLine());
        c2.os.deleteorder(delordid);










        File f3 = new File ("/Users/bhavyaverma/Java/JavaCoreTraining/ShoppingCart/src/com/shopping/OrderDetails");
        Client c3 = new Client();
        c3.ods.createorderdetails(f3);




        System.out.println("Enter the order detail id to delete");
        dod = Integer.parseInt(br.readLine());
        c3.ods.deleteorderdetail(dod);



        System.out.println("Enter the order detail to update");
        uod = Integer.parseInt(br.readLine());
        c3.ods.updateorderdetail(uod);




        List<orderdetails> orderDetails = new ArrayList<>();
        orderDetails = ods.getallorders(1);


         File f4 = new File("/Users/bhavyaverma/Java/JavaCoreTraining/ShoppingCart/src/com/shopping/Amt.txt.csv");
        String fc = ",";
        String nls = "\n";
        String fh = "Id, Order_Id, Product_Id, Quantity, Price, Amount ";
        FileWriter fw = null;
        try {
            try {
                f1.createNewFile();
                fw = new FileWriter(f1);
                fw.append(fh.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            double Total = 0.0;
            for (orderdetails ord : orderDetails)
            {
                double sum = 0;
                try {
                    fw.append(nls);

                    fw.append(Integer.toString(ord.getId()));
                    fw.append(fc);
                    fw.append(Integer.toString(ord.getOrderId()));
                    fw.append(fc);
                    fw.append(Integer.toString(ord.getProductId()));
                    fw.append(fc);
                    fw.append(Integer.toString(ord.getQuantity()));
                    fw.append(fc);
                    fw.append(Double.toString(ord.getPrice()));
                    fw.append(fc);
                    Double x = ord.getPrice();
                    int q = ord.getQuantity();
                    sum = sum + (q * x);
                    fw.append(Double.toString(sum));
                    fw.flush();

                    Total = Total + sum;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                fw.append(nls);
                fw.append(fc);
                fw.append(fc);
                fw.append(fc);
                fw.append(fc);
                fw.append(fc);
                fw.append(Double.toString(Total));
            } catch (IOException e) {
                e.printStackTrace();
            }










       /* List<order> list3 = new ArrayList<>() ;
        try{
            list3 = c2.os.getallorders();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        for(order o : list3)
        {
            System.out.println(o.getId() + "," + o.getOrderDate() + ","  + o.getAmount() + "," + o.getUserId());

        }*/



            /* user u = new user();
        u.setId(1);
        u.setUserName("bhavya94");
        u.setFirstName("Bhavya");
        u.setLastName("Verma");*/




       /* List<user> l1 = new ArrayList<>();
        try{
            l1 =us.getallusers();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        us.createuser(u);*/


    }

}
