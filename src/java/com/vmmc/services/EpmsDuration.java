/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import java.util.concurrent.TimeUnit;
import java.sql.Timestamp;

/**
 *
 * @author Developer
 */
public class EpmsDuration {
    public static long getDays(Timestamp stamp)
    {
    
                    long timeCreated = stamp.getTime();
                    long nowSec = System.currentTimeMillis();
                    long days = TimeUnit.MILLISECONDS.toDays(nowSec - timeCreated);
                    return days;
    }
    
}
