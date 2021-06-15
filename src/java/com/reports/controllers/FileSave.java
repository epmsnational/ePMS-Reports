/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reports.controllers;

import java.util.Date;

/**
 *
 * @author ignatious
 */
public class FileSave {
    
    String filename;
    Date date;

    public FileSave() {
    }

    
    public FileSave(String filename, Date date) {
        this.filename = filename;
        this.date = date;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
}
