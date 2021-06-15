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
public class LineChartBarData {
    
    private static final List<Line> lineBarList;
    
    static{
        lineBarList = new ArrayList<LineChartBarData.Line>();
        lineBarList.add(new Line("2009",90,39));
        lineBarList.add(new Line("2010",10,14));
        lineBarList.add(new Line("2011",170,125));
        lineBarList.add(new Line("2012",44,48));
        lineBarList.add(new Line("2013",40,19));
    }
    
    public static List<Line> getLineBarList(){
      return lineBarList;  
    }
    
    public static class Line{
        String year;
        int male;
        int female;

        public Line(String year, int male, int female) {
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
