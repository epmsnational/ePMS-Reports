/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;


/**
 *
 * @author hp
 */
public class DataInit {

    private static DataInit di;

    static {
        di = new DataInit();
    }

    public static DataInit getInstance() {
        return di;
    }

   
    public UserGroupDao getUserGroupDao() {
       // return new UserGroupDao(ConUtil.getConnectionUtility());
       return null;
    }


}
