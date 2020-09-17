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
public class LectuersStructure {
    
    /*
    id int primary key,
   roomid int ,
   timeslot float,
   mon varchar(300),
   tue varchar(300),
   wed varchar(300),
   thur varchar(300),
   fri varchar(300),
   sat varchar(300),
   sun 
    */
    
    int id;
    int lec;
    float timeslot;
    String mon;
    String tue;
    String wed;
    String thur;
    String fri;
    String sat;
    String sun;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLec() {
        return lec;
    }

    public void setLec(int lec) {
        this.lec = lec;
    }

    public float getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(float timeslot) {
        this.timeslot = timeslot;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getTue() {
        return tue;
    }

    public void setTue(String tue) {
        this.tue = tue;
    }

    public String getWed() {
        return wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }

    public String getThur() {
        return thur;
    }

    public void setThur(String thur) {
        this.thur = thur;
    }

    public String getFri() {
        return fri;
    }

    public void setFri(String fri) {
        this.fri = fri;
    }

    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public String getSun() {
        return sun;
    }

    public void setSun(String sun) {
        this.sun = sun;
    }
    
    
    
}
