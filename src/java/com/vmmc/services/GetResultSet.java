/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ignatious
 */
public class GetResultSet {
    String startDate;
    String endDate;

    public String getStart(){
        String startdate;
        try (Connection conn = GetUpdatedReportDates.getConnection()) {
            
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from reportdates");
            
            while(resultSet.next()){
                startdate = resultSet.getString("startDate");
                endDate = resultSet.getString("End");
                
//                System.out.println("Start Date: " + startdate +"\t");
//                System.out.println("End Date: " + enddate);
                
                return startdate;
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return "0000-00-00";
    }
    }
