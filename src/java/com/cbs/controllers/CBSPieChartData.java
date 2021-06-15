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
public class CBSPieChartData {

    private static final List<KeyValue> pieDataList;

    static {
        String risk = "Sex with Partner";
        int count = 18;
        
        pieDataList = new ArrayList<CBSPieChartData.KeyValue>();
        pieDataList.add(new KeyValue("Blood Injection", "20"));
        pieDataList.add(new KeyValue("Sex Workers", "36"));
        pieDataList.add(new KeyValue("Unprotected Sex F", "15"));
        pieDataList.add(new KeyValue("Unprotected Sex M", "22"));
        pieDataList.add(new KeyValue("Prison", "10"));
        pieDataList.add(new KeyValue(risk, String.valueOf(count)));
    }

    public static List<KeyValue> getPieDataList() {
        return pieDataList;
    }

    public static class KeyValue {

        String key;
        String value;

        public KeyValue(String key, String value) {
            super();
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

}
