package com.example.time.Utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

/*
 *@description:
 *@author jiafeng
 *@date 2019/11/12 0012 17:16
 */
public class IpAddressUtil {
    public static void main(String[] args) {
        System.out.println(new Date(0));
    }

    public static String getIpAddress(){
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return addr.getHostAddress();
    }
}
