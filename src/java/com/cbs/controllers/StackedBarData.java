/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cbs.controllers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DevOOP
 */
public class StackedBarData {
    
    private static final List<Stack> stackedBarList;
    
    static{
       stackedBarList = new ArrayList<StackedBarData.Stack>(); 
       stackedBarList.add(new Stack("2012",900,390));
       stackedBarList.add(new Stack("2013",1000,400));
       stackedBarList.add(new Stack("2014",1170,440));
       stackedBarList.add(new Stack("2015",1250,480));
       stackedBarList.add(new Stack("2016",1530,540));
    }
    
    public static List<Stack> getStackedBarList(){
        return stackedBarList;
    }
    public static class Stack{
        String year;
        int male;
        int female;

        public Stack(String year, int male, int female) {
            this.year = year;
            this.male = male;
            this.female = female;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public int getMale() {
            return male;
        }

        public void setMale(int male) {
            this.male = male;
        }

        public int getFemale() {
            return female;
        }

        public void setFemale(int female) {
            this.female = female;
        }
        
    }
    
}
