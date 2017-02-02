package com.java.training;

import java.util.List;

/**
 * Created by bhavyaverma on 1/25/17.
 */
public class Project {
int prid;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    List<Employee> employeeList;

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public int getPrid() {

        return prid;
    }


    public Project(int prid)
    {
        this.prid = prid;
    }


    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee)
    {
        this.employeeList.add(employee);
    }
}
