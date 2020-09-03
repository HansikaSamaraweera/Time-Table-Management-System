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
public class students {
    private int id;
    private String ay;
    private String as;
    private String programme;
    private int grpno;
    private String grpid;
    private int subno;
    private String subid;
    int count;

    public String getProgramme() {
        return programme;
    }

    public void setProgram (String programme) {
        this.programme = programme;
    }

    public students() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public students(int id,String ay,String as,String programme,int grpno,String grpid,int subno,String subid){
    this.id=id;
    this.ay=ay;
    this.as=as;
    this.programme=programme;
    this.grpno=grpno;
    this.grpid=grpid;
    this.subno=subno;
    this.subid=subid;
}
public int getid(){
    return id;
}
public String getprogramme(){
    return programme;
}
public String getay(){
    return ay;
}
public String getas(){
    return as;
}
public int getgrpno(){
    return grpno;
}
public String getgrpid(){
    return grpid;
}
public int getsubno(){
    return subno;
}
public String getsubid(){
    return subid;
}
}
