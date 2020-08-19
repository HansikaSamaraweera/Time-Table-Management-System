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
public class group {
    private int id;
    private int groupn;

    
    public group(int id,int groupn){
    this.id=id;
    this.groupn=groupn;
    
    }
    
    public int getid(){
    return id;
    }
    public int getgroupn(){
    return groupn;
    }
}
