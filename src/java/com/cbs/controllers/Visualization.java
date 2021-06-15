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
public class Visualization {
    private static final List<DataBar> barDataList;
    
    static{
        barDataList = new ArrayList<Visualization.DataBar>();
        barDataList.add(new DataBar("2012",900,390));
        barDataList.add(new DataBar("2013",1000,400));
        barDataList.add(new DataBar("2014",1170,440));
        barDataList.add(new DataBar("2015",1250,480));
        barDataList.add(new DataBar("2016",1530,540));
        barDataList.add(new DataBar("2017",1190,560));
        barDataList.add(new DataBar("2018",1280,680));
        barDataList.add(new DataBar("2019",1370,780));
    }
    
    public static List<DataBar> getbarDataList() {
        return barDataList;
    }
    public static class DataBar{
        String year;
        int asia;
        int europe;

        public DataBar(String year, int asia, int europe) {
            this.year = year;
            this.asia = asia;
            this.europe = europe;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public int getAsia() {
            return asia;
        }

        public void setAsia(int asia) {
            this.asia = asia;
        }

        public int getEurope() {
            return europe;
        }

        public void setEurope(int europe) {
            this.europe = europe;
        }
        
    
}
}
