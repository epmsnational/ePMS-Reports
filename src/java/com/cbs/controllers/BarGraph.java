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
public class BarGraph {
    
    private static final List<Bar> barList;
    
    static{
        barList = new ArrayList<BarGraph.Bar>();
        barList.add(new Bar("Tested",350));
        barList.add(new Bar("Result Positive",120));
        barList.add(new Bar("Notified",60));
        barList.add(new Bar("Linked to ART",90));
        barList.add(new Bar("Viral Load Supressed",30));
    }
    
    
    public static List<Bar> getbarList() {
        return barList;
    }
    
    public static class Bar{
        String pointName;
        int count;

        public Bar(String pointName, int count) {
            this.pointName = pointName;
            this.count = count;
        }
        

        public String getPointName() {
            return pointName;
        }

        public void setPointName(String pointName) {
            this.pointName = pointName;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
        
        
        
    }
    
}
