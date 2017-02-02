package com.java.training;

import java.util.List;

/**
 * Created by bhavyaverma on 1/25/17.
 */
public class Department {
    int id;
    String name;
    List<Project> projectList;

    public List<Project> getProjectList() {
        return projectList;
    }

    public Department()
    {

    }
    /*public Department(int id, String name, List projectList)
    {
        this.id = id;
        this.name = name;
        this.projectList = projectList;
    }*/



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addProject(Project project)
    {
        this.projectList.add(project);
    }
}
