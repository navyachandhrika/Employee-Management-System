package com.Employee.application;

public class Employee {
    private int id;
    private String e_name;
    private double salary;
    private int age;

    public Employee()
    {

    }
    public Employee(int id, String e_name, double salary, int age)
    {
        this.id=id;
        this.e_name=e_name;
        this.salary=salary;
        this.age=age;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return e_name;
    }
    public void setName(String e_name)
    {
        this.e_name=e_name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", name='" + e_name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
