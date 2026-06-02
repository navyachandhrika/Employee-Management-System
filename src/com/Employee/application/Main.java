package com.Employee.application;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        EmployeeDAOinterface dao=new EmployeeDAOImplements();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Employee Management application");
        do {
            System.out.println("1. Add Employee\n" +
                    "2. Show all Employees\n" +
                    "3. Show Employee based on ID\n" +
                    "4. Update the Employee\n" +
                    "5. Delete the Employee\n");
            System.out.println("Enter the Choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    Employee emp=new Employee();
                    System.out.println("Enter ID");
                    int id=sc.nextInt();
                    System.out.println("Enter Name");
                    String e_name=sc.next();
                    System.out.println("Enter salary");
                    double salary=sc.nextDouble();
                    System.out.println("Enter Age");
                    int age=sc.nextInt();
                    emp.setId(id);
                    emp.setName(e_name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployees();
                    break;
                case 3:
                    System.out.println("Enter ID to show the details");
                    int empid=sc.nextInt();
                    dao.showEmployeeOnId(empid);
                    break;
                case 4:
                    System.out.println("Enter the ID to update the details");
                    int e_id=sc.nextInt();
                    System.out.println("Enter the new name");
                    String empname=sc.next();
                    dao.updateEmployee(e_id, empname);
                    break;
                case 5:
                    System.out.println("Enter the ID to delete");
                    int eid=sc.nextInt();
                    dao.deleteEmployee(eid);
                    break;
                case 6:
                    System.out.println("Thank you for using our application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;

            }
        }while(true);
    }
}
