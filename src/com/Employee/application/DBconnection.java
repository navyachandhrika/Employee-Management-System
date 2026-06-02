package com.Employee.application;

import java.sql.DriverManager;
import java.sql.Connection;

public class DBconnection {
    static Connection con;
    public static Connection createDBconnection()
    {

        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url="jdbc:mysql://localhost:3306/employee_db";
            String username="root";
            String password="NavyaRoot@123";
            con= DriverManager.getConnection(url, username, password);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return con;
    }
}
