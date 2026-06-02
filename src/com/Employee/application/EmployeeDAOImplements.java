package com.Employee.application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

import static com.Employee.application.DBconnection.con;

public class EmployeeDAOImplements implements EmployeeDAOinterface{

    @Override
    public void createEmployee(Employee emp) {
        Connection con=DBconnection.createDBconnection();
        String query="insert into employee values(?,?,?,?)";
        try {
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1, emp.getId());
            pstm.setString(2, emp.getName());
            pstm.setDouble(3, emp.getSalary());
            pstm.setInt(4, emp.getAge());
            int count=pstm.executeUpdate();
            if(count!=0)
            {
                System.out.println("Employee inserted successfully");
            }
        }catch(Exception ex) {
            ex.printStackTrace();
        }


    }

    @Override
    public void showAllEmployees() {
        con=DBconnection.createDBconnection();
        String query="select * from Employee";
        System.out.println("Employee Details : ");
        System.out.println("---------------------------------------------------------------");
        System.out.format("%-10s %-15s %-12s %-5s%n", "ID","Name","Salary","Age");
        System.out.println("---------------------------------------------------------------");
        try{
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(query);
            while(result.next())
            {
                System.out.format("%-10d %-15s %-12.2f %-5d%n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4));
                System.out.println("---------------------------------------------------------------");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void showEmployeeOnId(int id) {
        con=DBconnection.createDBconnection();
        String query="select * from Employee where id="+id;
        try{
            Statement stmt=con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while(result.next())
            {
                System.out.format("%d\t%s\t%f\t\t%d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getDouble(3),
                        result.getInt(4));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String e_name) {
        con=DBconnection.createDBconnection();
        String query="update employee set e_name=? where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setString(1,e_name);
            pstm.setInt(2,id);
            int count=pstm.executeUpdate();
            if(count!=0)
            {
                System.out.println("Employee details updated successfully!");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        con=DBconnection.createDBconnection();
        String query="delete from employee where id=?";
        try{
            PreparedStatement pstm= con.prepareStatement(query);
            pstm.setInt(1,id);
            int count = pstm.executeUpdate();
            if(count!=0)
            {
                System.out.println("Employee deleted successfully!");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
