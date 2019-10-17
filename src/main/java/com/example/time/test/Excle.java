package com.example.time.test;


import java.io.*;
import java.util.*;

/**
 * Created by wqmy on 2019/10/14.
 */
public class Excle {
    private static final String ACCOUNT_FILEPATH = "G:\\time\\src\\main\\resources\\ygty_all.txt";
    private static final String filename = "G:\\time\\src\\main\\resources\\family_user_removecrm_animate_daily_zhejiang_20190922.csv";
    public static void main(String[] args) throws IOException {
        //创建一个 类型为文件的列表
        Map<String, Integer> register = getRegister(filename);
        for (String key : register.keySet()) {
            System.out.println(key+":"+register.get(key));
        }
    }
    private static Map<String,Integer> getRegister(String filename) throws IOException {
        Map<String,Integer> res = new HashMap<>();//统计结果
        Set<String> registerPhones = new HashSet<>();

        Map<String,Account> acounts = getAcounts();
        FileInputStream fis = new FileInputStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;
        while ((line = br.readLine())!=null) {
            String[] split = line.split(",");
            String phone = split[0].substring(0,11);
            registerPhones.add(phone);
        }
        br.close();
        for (String phone : registerPhones) {
            Account account = acounts.get(phone);
            if (account!=null) {
                String key = account.getCity() + "," + account.getDep();
                Integer integer = res.get(key);
                if (integer==null) {
                    integer = new Integer(0);
                }
                res.put(key,++integer);
            }
        }
        return res;
    }
    public static Map<String,Account> getAcounts() throws IOException {
        Map<String,Account> res = new HashMap();
        FileInputStream fis = new FileInputStream(ACCOUNT_FILEPATH);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;
        while ((line = br.readLine())!=null) {
            String[] split = line.split(",");
            Account account = new Account();
            account.setName(split[0].trim());
            account.setPhone(split[1].trim());
            account.setCity(split[2].trim());
            if (split.length==3) {
                account.setDep("未知部门");
            } else {
                account.setDep(split[3].trim());
            }
            res.put(account.getPhone(),account);
        }
        br.close();
        return res;
    }

    public static Map<String,Account> getDate(String filename) throws IOException {
        Map<String,Account> res = new HashMap();
        FileInputStream fis = new FileInputStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;
        while ((line = br.readLine())!=null) {
            String[] split = line.split(",");
            Account account = new Account();
            account.setName(split[0].trim());
            account.setPhone(split[1].trim());
            account.setCity(split[2].trim());
            if (split.length==3) {
                account.setDep("未知部门");
            } else {
                account.setDep(split[3].trim());
            }
            res.put(account.getPhone(),account);
        }
        br.close();
        return res;
    }
}