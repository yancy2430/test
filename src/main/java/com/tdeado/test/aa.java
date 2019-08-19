package com.tdeado.test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class aa {
    public static final String a(String paramString) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(paramString.getBytes());
            byte[] arrayOfByte = messageDigest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            int i = arrayOfByte.length;
            for (byte b = 0; b < i; b++) {
                for (paramString = Integer.toHexString(arrayOfByte[b] & 0xFF); paramString.length() < 2; paramString = "0" + paramString);
                stringBuilder.append(paramString);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }
}
