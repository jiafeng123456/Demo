package com.example.time.test;

import com.example.time.Utils.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/6 0006 14:28
 */
public class brithday {
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static void main(String[] args) {
        String brithday = "12-07";
        System.out.println(getBrithday(brithday));
    }
    public static int getBrithday(String brithday){
        String dataOne = String.valueOf(getNowYear())+"-"+brithday;
        String dataTwo = String.valueOf(getNowYear()+1)+"-"+brithday;
        Date birthdayOne = DateUtil.parse(dataOne,DATE_FORMAT);
        Date birthdayTwo = DateUtil.parse(dataTwo,DATE_FORMAT);
        int n = 0;
        if (birthdayOne.before(new Date())){
            n = getIntervalDay(new Date(),birthdayTwo);
        }else {
            n = getIntervalDay(new Date(),birthdayOne);
        }
        return n;
    }

    /**
     * 获取今年是哪一年
     * @return
     */
    public static Integer getNowYear(){
        Date date = new Date();
        GregorianCalendar gc=(GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        return Integer.valueOf(gc.get(1));
    }

    /**
     * 获取两个日期之间间隔的天数
     * @author sunyy
     * @return
     */
    public static int getIntervalDay(Date start_date, Date end_date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            start_date = sdf.parse(sdf.format(start_date));
            end_date = sdf.parse(sdf.format(end_date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(start_date);
        long time1 = cal.getTimeInMillis();
        cal.setTime(end_date);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2-time1)/(1000*3600*24);
        return Integer.parseInt(String.valueOf(between_days));
    }
}
