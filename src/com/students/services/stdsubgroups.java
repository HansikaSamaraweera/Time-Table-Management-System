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
public class stdsubgroups {
    private int id;
    private int grpId;
    private String subgrp;

    
    public stdsubgroups(int id,int grpId,String subgrp){
    this.id=id;
    this.grpId=grpId;
    this.subgrp=subgrp;
    }
    
    public int getid(){
    return id;
    }
    public int getgrpId(){
    return grpId;
    }
    
    public String getSubgrpID(){
        return subgrp;
    }
}
