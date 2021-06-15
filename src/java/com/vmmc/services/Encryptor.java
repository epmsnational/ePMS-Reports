/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vmmc.services;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author hp
 */
public class Encryptor {
    public static String str(String str)
    {
        String encpass = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            md.update(str.getBytes("UTF-8")); // Change this to "UTF-16" if needed
            byte[] digest = md.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            encpass = bigInt.toString(16);
            return encpass;

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {

        }
        return encpass;
    }
    
}
