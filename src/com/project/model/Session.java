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
public class Session {
    //id,lec_g,tag_g,s_grp_g,sub_grp_g,subject_c_g,no_students_g,duration_g
    int id;
   String lec;
   String tag;
   String s_grp;
   String sub_grp;
   String subject_c;
   int n0_students;
   int duration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLec() {
        return lec;
    }

    public void setLec(String lec) {
        this.lec = lec;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getS_grp() {
        return s_grp;
    }

    public void setS_grp(String s_grp) {
        this.s_grp = s_grp;
    }

    public String getSub_grp() {
        return sub_grp;
    }

    public void setSub_grp(String sub_grp) {
        this.sub_grp = sub_grp;
    }

    public String getSubject_c() {
        return subject_c;
    }

    public void setSubject_c(String subject_c) {
        this.subject_c = subject_c;
    }

    public int getN0_students() {
        return n0_students;
    }

    public void setN0_students(int n0_students) {
        this.n0_students = n0_students;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
   
            
    
}
