package com.test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util
{

    public static String digSignature(final String input){
        input.getBytes();
        MessageDigest digest;
        try
        {
            
            int h = input.hashCode();
            System.out.println("Hash " +  h);
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            System.out.println("Hash length " +  hash.length);
            for (int i = 0; i < hash.length; i++)
            {
               // System.out.println("Hash code " + hash[i]);
            }
            StringBuffer buff = new StringBuffer();
            for (int i = 0; i < hash.length; i++)
            {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length()==1) buff.append("0");
                buff.append(hex);
            }
            
            System.out.println("Hex string " +  buff.toString());
            return buff.toString();
        }
        catch (NoSuchAlgorithmException | UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
       
        return null;
    }
}
