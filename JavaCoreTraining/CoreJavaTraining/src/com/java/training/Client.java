package com.java.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.String;



/**
 * Created by bhavyaverma on 1/25/17.
 */
public class Client {
    public static void main(String[] args) {
        Company c0 = Company.createInstance(1, "AppDirect", "Pune");

        List<Department> departments = new ArrayList<>();

        List<Project> projects = new ArrayList<>();

        List<Employee> employees = new ArrayList<>();

        Department d1 = new Department();
        d1.setId(1);
        d1.setName("IT");
        Project p1 = new Project(100);
        Employee e1 = new Employee(1, "Bhavya", 22);
        Employee e2 = new Employee(2, "Priyam", 24);
        p1.setEmployeeList(employees);
        p1.addEmployee(e1);
        p1.addEmployee(e2);



        Project p2 = new Project(101);
        Employee e3 = new Employee(3, "Bhanu", 20);
        Employee e4 = new Employee(4, "Priya", 23);
        p2.setEmployeeList(employees);
        p2.addEmployee(e3);
        p2.addEmployee(e4);

        Project p3 = new Project(102);
        Employee e5 = new Employee(5, "Bhavz", 19);
        Employee e6 = new Employee(6, "Pri", 26);
        p3.setEmployeeList(employees);
        p3.addEmployee(e5);
        p3.addEmployee(e6);
        d1.setProjectList(projects);
        d1.addProject(p1);
        d1.addProject(p2);
        d1.addProject(p3);




        Department d2 = new Department();
        d2.setId(2);
        d2.setName("HR");
        departments.add(d1);
        departments.add(d2);
        Project p4 = new Project(111);
        Employee e7 = new Employee(11, "Bhavz", 19);
        Employee e8 = new Employee(9, "Pri", 26);
        p4.setEmployeeList(employees);
        p4.addEmployee(e7);
        p4.addEmployee(e8);

        Project p5 = new Project(112);
        c0.setDepartmentList(departments);
        d2.setProjectList(projects);
        d2.addProject(p4);
        d2.addProject(p5);
        Employee e9 = new Employee(7, "Bha", 19);
        Employee e10 = new Employee(8, "Pruno", 26);
        p5.setEmployeeList(employees);
        p5.addEmployee(e9);
        p5.addEmployee(e10);


        Department d3 = new Department();
        d3.setId(3);
        d3.setName("Admin");
        c0.addDepartment(d3);

        Project p7 = new Project(114);
        Employee e11 = new Employee(9, "Bhat", 34);
        Employee e12 = new Employee(10, "Prul", 46);
        p7.setEmployeeList(employees);
        p7.addEmployee(e11);
        p7.addEmployee(e12);

        d3.setProjectList(projects);

        d3.addProject(p7);


        Department d4 = new Department();
        d4.setId(4);
        d4.setName("Engineering");
        c0.addDepartment(d4);
        Project p8 = new Project(115);
        Employee e13 = new Employee(11, "Bha", 19);
        Employee e14 = new Employee(12, "Pruno", 26);
        p8.setEmployeeList(employees);
        p8.addEmployee(e13);
        p8.addEmployee(e14);

        Project p9 = new Project(116);
        Employee e15 = new Employee(13, "Bhahu", 32);
        Employee e16 = new Employee(14, "Pruno", 27);
        p9.setEmployeeList(employees);
        p9.addEmployee(e15);
        p9.addEmployee(e16);

        d4.setProjectList(projects);
        d4.addProject(p8);
        d4.addProject(p9);


        Company c1 =  Company.createInstance(2, "Amazon", "Bangalore" );
        List<Department> departments1 = new ArrayList<>();
        List<Project> projects1 = new ArrayList<>();
        Department d5 = new Department();
        Project p10 = new Project(120);
        Employee e17 = new Employee(71, "Bha", 19);
        Employee e18 = new Employee(88, "Pruno", 26);
        p10.setEmployeeList(employees);
        p10.addEmployee(e17);
        p10.addEmployee(e18);

        Project p11 = new Project(119);
        Employee e19 = new Employee(72, "Bhaghu", 19);
        Employee e20 = new Employee(86, "Prunio", 26);
        p11.setEmployeeList(employees);
        p11.addEmployee(e19);
        p11.addEmployee(e20);



        d5.setId(1);
        d5.setName("Analytics");
        c1.setDepartmentList(departments1);
        c1.addDepartment(d5);
        d5.setProjectList(projects1);
        d5.addProject(p10);
        d5.addProject(p11);



        Department d6 = new Department();
        d6.setId(2);
        d6.setName("Finance");
        c1.setDepartmentList(departments1);
        c1.addDepartment(d6);
        Project p14 = new Project(121);
        Employee e21 = new Employee(74, "Bhaghu", 19);
        Employee e22 = new Employee(82, "Prunio", 26);
        p14.setEmployeeList(employees);
        p14.addEmployee(e21);
        p14.addEmployee(e22);


        d6.setProjectList(projects1);
        d6.addProject(p14);


        List<Company> companies = new ArrayList<>();
        companies.add(c0);
        companies.add(c1);
        for (Company company :companies)
        {
            System.out.println("Company id is " + company.getId());
            System.out.println("\n");
            System.out.println("Company's name is " + company.getName());
            System.out.println("\n");
            System.out.println("Company's location is " + company.getLocation());

            System.out.println("Printing departments\n");
            System.out.println(" ");
            List<Department> departmentList1 = company.getDepartmentList();

           int i = 0;

           while(i < departmentList1.size())
            {
                Department department = departmentList1.get(i);
                System.out.println("Department id is " + department.getId() + "\nDepartment name is " + department.getName());
                i++;

                List<Project> projects2 = department.getProjectList();
                Iterator<Project> projectIterator = projects2.iterator();
                while(projectIterator.hasNext())
                {
                    Project project = projectIterator.next();
                    int j = 0;
                    System.out.println("Projects are\n");
                    System.out.println("Project id is " + project.getPrid());
                    System.out.println(" ");
                    j++;




                    List<Employee> employees1 = project.getEmployeeList();

                    System.out.println("Employees are : \n");


                    for(int k = 0; k < employees1.size(); k++)
                    {
                        Employee employee = employees.get(k);
                        System.out.println("Employee id is " + employee.getId());
                        System.out.println("Name is " + employee.getName());
                        System.out.println("Age is " + employee.getAge());
                        System.out.println(" ");
                    }



            }
            }
        }









    }
}
