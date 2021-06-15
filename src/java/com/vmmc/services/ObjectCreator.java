/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Developer
 * @param <T>
 */

    public class ObjectCreator<T> {

    public static Object createObject(Class myClass, HttpServletRequest req) throws Exception {
        Constructor constructor = myClass.getConstructor();
        Object myObject = constructor.newInstance();
        Enumeration e = req.getParameterNames();
        while (e.hasMoreElements()) {
            String name = (String) e.nextElement();
            String fieldVal = req.getParameter(name);
            try {
                Field field = myClass.getDeclaredField(name);
                field.setAccessible(true);
                Object fieldType = field.getType();
                // Number num = new Number();
                String className = fieldType.toString();
                if (className.contains("String")) {
                    field.set(myObject, fieldVal);
                } else {
                    Number num = checkVal(className, fieldVal);
                    field.set(myObject, num);
                }
            } catch (Exception ex) {
                continue;
            }
        }
        return myObject;
    }

    private static Number checkVal(String val, String fieldVal) {
        Number num = null;
        switch (val) {
            case "int":
                num = new Integer(fieldVal);
                break;
            case "Integer":
                num = new Integer(fieldVal);
                break;
            case "long":
                num = new Long(fieldVal);
                break;
            case "Long":
                num = new Long(fieldVal);
                break;
            case "float":
                num = new Float(fieldVal);
                break;
            case "Float":
                num = new Float(fieldVal);
                break;
            case "double":
                num = new Double(fieldVal);
                break;
            case "Double":
                num = new Double(fieldVal);
                break;
        }
        return num;
    }
} 
    

