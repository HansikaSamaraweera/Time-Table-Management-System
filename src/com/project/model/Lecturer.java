/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.model;

/**
 *
 * @author vnaso
 */
public class Lecturer {
    //name+emmid+faculty+department+center+building+level+rank123
    int id;
    String name;
    Float emmid;
    String faculty;
    String department;
    String center;
    String buiding;
    int level;
    Float rank123;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getEmmid() {
        return emmid;
    }

    public void setEmmid(Float emmid) {
        this.emmid = emmid;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getBuiding() {
        return buiding;
    }

    public void setBuiding(String buiding) {
        this.buiding = buiding;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Float getRank123() {
        return rank123;
    }

    public void setRank123(Float rank123) {
        this.rank123 = rank123;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
            
}
