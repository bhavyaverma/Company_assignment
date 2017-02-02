package com.java.training;

import java.util.List;


/**
 * Created by bhavyaverma on 1/25/17.
 */
public class Company {
    private int id;
    private String name;
    private String location;
    private List<Department> departmentList;

    public Company()
    {

    }
    public Company(int id, String name, String location) //, List departmentList)
    {
        this.id = id;
        this.name =name;
        this.location=location;
        //this.departmentList=departmentList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(Department department1)
    {
        this.departmentList.add(department1);
    }

    public static Company createInstance(int id, String name, String location){
        Company company = new Company();
        company.setId(id);
        company.setName(name);
        company.setLocation(location);
        return company;
    }
}
