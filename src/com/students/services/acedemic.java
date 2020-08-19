/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.services;

/**
 *
 * @author ACER
 */
public class acedemic {
    private int id;
    private String year;
    private String semester;
    private String acd;
    
    public acedemic(int id,String year,String semester,String acd){
    this.id=id;
    this.year=year;
    this.semester=semester;
    this.acd=acd;
    }
    
    
    public int getid(){
    return id;
    }
    public String getyear(){
    return year;
    }
    public String getsemester(){
    return semester;
    }
    public String getacd(){
    return acd;
    }

}
