package com.duapp.aesjni;


public class AESEncrypt {
    public static native int checkSignature(Object obj);

    public static native String decode(Object obj, String str);

    public static native String encode(Object obj, String str);

    public static native String getLeanCloudAppID();

    public static native String getLeanCloudAppKey();

    public static native String getWxAppId(Object obj);

    public static native String getWxAppKey();

    static {
        try {
            System.load("/home/jni/libJNIEncrypt.so");
//            System.loadLibrary("JNIEncrypt");
        } catch (UnsatisfiedLinkError e) {
            e.fillInStackTrace();
            System.err.println("JNI"+ "loadJNI fail " + e.getMessage());
        }

    }
}