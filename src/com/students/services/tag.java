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
public class tag {
    private int tagid;
    private String tagname;
    
    public tag(int tagid,String tagname){
    this.tagid=tagid;
    this.tagname=tagname;

}

public int gettagid(){
    return tagid;
}
public String gettagname(){
    return tagname;
}
   
}
