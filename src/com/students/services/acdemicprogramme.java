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
public class acdemicprogramme {
    private int id;
    private String programme;

    
    public acdemicprogramme(int id,String programme){
    this.id=id;
    this.programme=programme;
    
    }
    
    
    public int getid(){
    return id;
    }
    public String getprogramme(){
    return programme;
    }
    

}
