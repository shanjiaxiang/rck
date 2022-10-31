package com.rcb.rck.util;



import com.rcb.rck.common.Constant;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *MD5工具
 */
public class MD5Utils {
    public static String getMD5Str(String strValue) throws NoSuchAlgorithmException {

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return java.util.Base64.getEncoder().encodeToString(md5.digest((strValue+ Constant.SALT).getBytes()));
    }


    public static void main(String[] args) {
        try {
            System.out.println(getMD5Str("1234"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
