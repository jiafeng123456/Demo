package com.example.time.Utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import static com.example.time.Utils.TimeDateUtils.getMonthEnd;

/*
 *@description:
 *@author jiafeng
 *@date 2019/12/6 0006 09:44
 */
public class DateUtil extends DateUtils {
    private final static Logger logger = LoggerFactory.getLogger(DateUtil.class);

    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_FORMAT_NO_DELIMITER = "yyyyMMdd";
    public static final String TIME_FORMAT = "HH:mm:ss";
    public static final String TIME_FORMAT_NO_SEC = "HH:mm";
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.S";
    public static final String DATE_TIME_FORMAT_NO_SEC = "yyyy-MM-dd HH:mm";
    public static final String DATE_TIME_FORMAT_NO_DELIMITER = "yyyyMMddHHmmss";
    public static final String DATE_PRECISE_TO_MINUTE = "yyyyMMddHHmm";
    public static final String[] WEEKS={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static final String[] DEFAULT_FORMATS = {TIMESTAMP_FORMAT, DATE_TIME_FORMAT, DATE_FORMAT, TIME_FORMAT, DATE_PRECISE_TO_MINUTE};

    /**
     * 自动判断日期字符串的格式，返回Date对象
     * @param dateString 日期字符串
     * @param dateFormat 格式字符串数组。为空时使用<code>DateUtil.DEFAULT_FORMATS</code>
     * @see DateUtil#parseDate
     * @return 日期Date对象
     * @throws ParseException
     */
    public static Date parse(String dateString, String ... dateFormat) throws ParseException {
        if (StringUtils.isEmpty(dateString)) {
            return null;
        }

        if (dateFormat == null || dateFormat.length == 0) {
            return DateUtil.parseDate(dateString, DEFAULT_FORMATS);
        } else {
            return DateUtil.parseDate(dateString, dateFormat);
        }
    }

    /**
     * 取指定格式的当前时间字符串
     * @param dateFormat
     * @return
     */
    public static String getCurrentTime(String dateFormat) {
        Date date = new Date();
        return format(date, dateFormat);
    }

    /**
     * 将字符串转换成Date类型
     * @param dateString
     * @param dateFormat
     * @return
     */
    public static Date parse(String dateString, String dateFormat) {
        if (StringUtils.isEmpty(dateString)) {
            return null;
        }
        try {
            return DateUtil.parseDate(dateString, dateFormat);
        } catch (ParseException e) {
            logger.error("日期格式化异常", e);
            return null;
        }
    }

    /**
     * 将Date类型转化成字符串
     * @param date
     * @param dateFormat
     * @return
     */
    public static String format(Date date, String dateFormat) {
        if (date == null) {
            return "";
        } else {
            return DateFormatUtils.format(date, dateFormat);
        }
    }

    /**
     * 在传入的日期基础上往后加n天
     * @param date
     * @param n 要加的天数
     * @return
     */
    public static Date addDay(Date date, int n) {
        return DateUtil.addDays(date, n);
    }
    /**
     * 在传入的日期基础上往后加n月
     * @param date
     * @param n 要加的月数
     * @return
     */
    public  Date subMonth(Date date,int n){
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.MONTH, n);
        Date date1 = rightNow.getTime();
        return date1;
    }
    /**
     * 判断当前时间是否在开始时间与结束时间之间
     * @param time 当前时间
     * @param begin 开始时间
     * @param end 结束时间
     * @return boolen类型，true表示在两者间，false表示不在两者之间
     */
    public static boolean isTimeIn(Date time, Date begin, Date end) {
        return time.getTime() >= begin.getTime() && time.getTime() <= end.getTime();
    }

    /**
     * 判断指定日期是星期几
     * @param time 要判断的日期
     * @param format 输入的日期格式
     * @return 返回数字[1:星期一，2：星期二，....，7：星期日]
     * @throws ParseException
     */
    public static int getWeek(String time, String format) throws ParseException {
        return getWeek(DateUtil.parseDate(time, format));
    }

    /**
     * 判断指定日期是星期几
     * @return 返回数字[1:星期一，2：星期二，....，7：星期日]
     * @throws ParseException
     */
    public static int getWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int week = 0;
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            week = 7;
        } else {
            week = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return week;
    }

    /**
     * 判断是否为有效的身份证日期
     * @param date
     * @return
     */
    public static boolean isIdDate(String date) {
        return isDateFormat(date, "yyyyMMdd");
    }

    /**
     * 判断传入的字符串dateStr是否是日期格式patternStr的字符串 @author yejg
     * @param dateStr
     * @param patternStr
     * @return
     */
    public static boolean isDateFormat(String dateStr, String patternStr) {
        Date date = null;
        try {
            date = parse(dateStr, patternStr);
        } catch (Exception e) {}

        return date == null ? false : true;
    }

    /**
     * 将字符串日期转成Timestamp类型
     * @param dateString 字符串类型的时间
     * @param format 字符串类型的时间要转换的格式
     * @return Timestamp类型的时间戳
     * @throws ParseException
     */
    public static java.sql.Timestamp parse2Timestamp(String dateString, String format) throws ParseException {
        return new java.sql.Timestamp(DateUtil.parseDate(dateString, format).getTime());
    }

    /**
     * 获取两个时间的间隔,字符串表示
     * @author huadi
     * @param start
     * @param end
     * @return
     */
    public static String getDiffTimeStr(Date start, Date end) {
        String time = "";
        if (start != null && end != null) {
            int t = (int)(end.getTime() - start.getTime()) / 1000;
            String h = "";
            String m = "";
            String s = "";
            h = (int)t / 3600 + "";
            m = (int)(t % 3600) / 60 + "";
            s = t % 60 + "";
            if (h.length() <= 1) {
                h = "0" + h;
            }
            if (m.length() <= 1) {
                m = "0" + m;
            }
            if (s.length() <= 1) {
                s = "0" + s;
            }
            time = h + ":" + m + ":" + s;
        }
        return time;
    }

    /**
     * 获取两个日期之间间隔的分钟数
     * @author zhougz
     * @param startDate
     * @param endDate
     * @return
     */
    public static int getIntervalMinute(Date startDate, Date endDate) {
        int min = 0;
        if (null != startDate && null != endDate) {
            long end = endDate.getTime();
            long start = startDate.getTime();
            long betweenDate = (end - start) / (60 * 1000);
            min = Long.valueOf(betweenDate).intValue();
        }
        return min;
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


    /**
     * 根据类型参数返回不同的日期
     * @param type
     *        <pre>
     *  today:当天
     *  yesterday：前一天
     *  less7：前6天 （近7天）
     *  less30：前29天 （近30天）
     *  all：前29年 （近30年）
     * </pre>
     * @author zhouzc
     * @return 返回yyyy-MM-dd格式字符串
     */
    public static String getSpecifiedDay(String type) {
        String time = "";
        if ("today".equals(type)) {
            time = getCurrentTime(DATE_FORMAT);
        } else if ("yesterday".equals(type)) {
            Date yesterday = addDay(new Date(), -1);
            time = format(yesterday, DATE_FORMAT);
        } else if ("less7".equals(type)) {
            Date yesterday = addDay(new Date(), -6);
            time = format(yesterday, DATE_FORMAT);
        } else if ("less30".equals(type)) {
            Date yesterday = addDay(new Date(), -29);
            time = format(yesterday, DATE_FORMAT);
        } else if ("all".equals(type)) {
            // 取全部就设置截至时间为30年以前
            Date yesterday = addYears(new Date(), -29);
            time = format(yesterday, DATE_FORMAT);
        }
        return time;
    }

    /**
     * 星期转换为星期索引
     * @author guanhui
     * @param week
     * @return
     */
    public static int weekToNum(String week){
        int weekNum=-1;
        for(int i=0,j=WEEKS.length;i<j;i++){
            if(week!=null && WEEKS[i].toLowerCase().contains(week.toLowerCase())){
                weekNum=i+1;
                break;
            }
        }
        return weekNum;
    }


    /**
     * 获取当天开始时间
     * @return
     */
    public static Date getDayBegin(){
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);//0点
        cal.set(Calendar.MINUTE, 0);//0分
        cal.set(Calendar.SECOND, 0);//0秒
        cal.set(Calendar.MILLISECOND, 0);//0毫秒
        return cal.getTime();
    }


    /**
     * 获取当天结束时间
     * @return
     */
    public static Date getDayEnd(){
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 23);//23点
        cal.set(Calendar.MINUTE, 59);//59分
        cal.set(Calendar.SECOND, 59);//59秒
        return cal.getTime();
    }


    /**
     * 获取昨天开始时间
     * @return
     */
    public static Date getBeginDayOfYesterday(){
        Calendar cal=Calendar.getInstance();
        cal.setTime(getDayBegin());//当天开始时间
        cal.add(Calendar.DAY_OF_MONTH, -1);//当天月份天数减1
        return cal.getTime();
    }

    /**
     * 获取昨天结束时间
     * @return
     */
    public static Date getEndDayOfYesterday(){
        Calendar cal=Calendar.getInstance();
        cal.setTime(getDayEnd());//当天结束时间
        cal.add(Calendar.DAY_OF_MONTH, -1);//当天月份天数减1
        return cal.getTime();
    }


    /**
     * 获取明天开始时间
     * @return
     */
    public static Date getBeginDayOfTomorrow(){
        Calendar cal=Calendar.getInstance();
        cal.setTime(getDayBegin());//当天开始时间
        cal.add(Calendar.DAY_OF_MONTH, 1);//当天月份天数加1
        return cal.getTime();
    }


    /**
     * 获取明天结束时间
     * @return
     */
    public static Date getEndDayOfTomorrow(){
        Calendar cal=Calendar.getInstance();
        cal.setTime(getDayEnd());//当天结束时间
        cal.add(Calendar.DAY_OF_MONTH, 1);//当天月份天数加1
        return cal.getTime();
    }


    /**
     * 获取某个日期的开始时间
     * @param d
     * @return
     */
    public static Timestamp getDayStartTime(Date d) {
        Calendar calendar=Calendar.getInstance();
        if(null!=d){
            calendar.setTime(d);
        }
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }
    /**
     * 获取某个日期的结束时间
     * @param d
     * @return
     */
    public static Timestamp getDayEndTime(Date d) {
        Calendar calendar=Calendar.getInstance();
        if(null!=d){
            calendar.setTime(d);
        }
        calendar.set(calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return new Timestamp(calendar.getTimeInMillis());
    }


    /**
     * 获取本周的开始时间
     * @return
     */
    @SuppressWarnings("unused")
    public static Date getBeginDayOfWeek(){
        Date date=new Date();
        if(date==null){
            return null;
        }
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
        if(dayOfWeek==1){
            dayOfWeek+=7;
        }
        cal.add(Calendar.DATE, 2-dayOfWeek);
        return getDayStartTime(cal.getTime());
    }


    /**
     * 获取本周的结束时间
     * @return
     */
    public static Date getEndDayOfWeek(){
        Calendar cal=Calendar.getInstance();
        cal.setTime(getBeginDayOfWeek());
        cal.add(Calendar.DAY_OF_WEEK, 6);
        Date weekEndSta = cal.getTime();
        return getDayEndTime(weekEndSta);
    }


    /**
     * 获取上周开始时间
     */
    @SuppressWarnings("unused")
    public static Date getBeginDayOfLastWeek() {
        Date date=new Date();
        if (date==null) {
            return null;
        }
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        int dayofweek=cal.get(Calendar.DAY_OF_WEEK);
        if (dayofweek==1) {
            dayofweek+=7;
        }
        cal.add(Calendar.DATE, 2-dayofweek-7);
        return getDayStartTime(cal.getTime());
    }


    /**
     * 获取上周的结束时间
     * @return
     */
    public static Date getEndDayOfLastWeek(){
        Calendar cal=Calendar.getInstance();
        cal.setTime(getBeginDayOfLastWeek());
        cal.add(Calendar.DAY_OF_WEEK, 6);
        Date weekEndSta = cal.getTime();
        return getDayEndTime(weekEndSta);
    }


    /**
     * 获取今年是哪一年
     * @return
     */
    public static Integer getNowYear(){
        Date date = new Date();
        GregorianCalendar gc=(GregorianCalendar)Calendar.getInstance();
        gc.setTime(date);
        return Integer.valueOf(gc.get(1));
    }


    /**
     * 获取本月是哪一月
     * @return
     */
    public static int getNowMonth() {
        Date date = new Date();
        GregorianCalendar gc=(GregorianCalendar)Calendar.getInstance();
        gc.setTime(date);
        return gc.get(2) + 1;
    }


    /**
     * 获取本月的开始时间
     * @return
     */
    public static Date getBeginDayOfMonth() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(getNowYear(), getNowMonth()-1, 1);
        return getDayStartTime(calendar.getTime());
    }


    /**
     * 获取本月的结束时间
     * @return
     */
    public static Date getEndDayOfMonth() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(getNowYear(), getNowMonth()-1, 1);
        int day = calendar.getActualMaximum(5);
        calendar.set(getNowYear(), getNowMonth()-1, day);
        return getDayEndTime(calendar.getTime());
    }


    /**
     * 获取上月的开始时间
     * @return
     */
    public static Date getBeginDayOfLastMonth() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(getNowYear(), getNowMonth()-2, 1);
        return getDayStartTime(calendar.getTime());
    }


    /**
     * 获取上月的结束时间
     * @return
     */
    public static Date getEndDayOfLastMonth() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(getNowYear(), getNowMonth()-2, 1);
        int day = calendar.getActualMaximum(5);
        calendar.set(getNowYear(), getNowMonth()-2, day);
        return getDayEndTime(calendar.getTime());
    }


    /**
     * 获取本年的开始时间
     * @return
     */
    public static java.util.Date getBeginDayOfYear() {
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR, getNowYear());
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DATE, 1);
        return getDayStartTime(cal.getTime());
    }


    /**
     * 获取本年的结束时间
     * @return
     */
    public static java.util.Date getEndDayOfYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, getNowYear());
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DATE, 31);
        return getDayEndTime(cal.getTime());
    }


    /**
     * 两个日期相减得到的天数
     * @param beginDate
     * @param endDate
     * @return
     */
    public static int getDiffDays(Date beginDate, Date endDate) {
        if(beginDate==null||endDate==null) {
            throw new IllegalArgumentException("getDiffDays param is null!");
        }
        long diff=(endDate.getTime()-beginDate.getTime())/(1000*60*60*24);
        int days = new Long(diff).intValue();
        return days;
    }


    /**
     * 两个日期相减得到的毫秒数
     * @param beginDate
     * @param endDate
     * @return
     */
    public static long dateDiff(Date beginDate, Date endDate) {
        long date1ms=beginDate.getTime();
        long date2ms=endDate.getTime();
        return date2ms-date1ms;
    }


    /**
     * 获取两个日期中的最大日起
     * @param beginDate
     * @param endDate
     * @return
     */
    public static Date max(Date beginDate, Date endDate) {
        if(beginDate==null) {
            return endDate;
        }
        if(endDate==null) {
            return beginDate;
        }
        if(beginDate.after(endDate)) {//beginDate日期大于endDate
            return beginDate;
        }
        return endDate;
    }


    /**
     * 获取两个日期中的最小日期
     * @param beginDate
     * @param endDate
     * @return
     */
    public static Date min(Date beginDate, Date endDate) {
        if(beginDate==null) {
            return endDate;
        }
        if(endDate==null) {
            return beginDate;
        }
        if(beginDate.after(endDate)) {
            return endDate;
        }
        return beginDate;
    }


    /**
     * 获取某月该季度的第一个月
     * @param date
     * @return
     */
    public static Date getFirstSeasonDate(Date date) {
        final int[] SEASON={ 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        int sean = SEASON[cal.get(Calendar.MONTH)];
        cal.set(Calendar.MONTH, sean*3-3);
        return cal.getTime();
    }


    /**
     * 返回某个日期下几天的日期
     * @param date
     * @param i
     * @return
     */
    public static Date getNextDay(Date date, int i) {
        Calendar cal=new GregorianCalendar();
        cal.setTime(date);
        cal.set(Calendar.DATE,cal.get(Calendar.DATE)+i);
        return cal.getTime();
    }


    /**
     * 返回某个日期前几天的日期
     * @param date
     * @param i
     * @return
     */
    public static Date getFrontDay(Date date, int i) {
        Calendar cal=new GregorianCalendar();
        cal.setTime(date);
        cal.set(Calendar.DATE, cal.get(Calendar.DATE)-i);
        return cal.getTime();
    }

    /**
     * 判断当前日期是否在[startDate, endDate]区间
     *
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @author jqlin
     * @return
     */
    public static boolean isEffectiveDate(Date startDate, Date endDate){
        if(startDate == null || endDate == null){
            return false;
        }
        long currentTime = new Date().getTime();
        if(currentTime >= startDate.getTime()
                && currentTime <= endDate.getTime()){
            return true;
        }
        return false;
    }


    /**
     * 得到二个日期间的间隔天数
     * @param secondString：后一个日期
     * @param firstString：前一个日期
     * @return
     */
    public static String getTwoDay(String secondString, String firstString) {
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        long day = 0;
        try {
            java.util.Date secondTime = myFormatter.parse(secondString);
            java.util.Date firstTime = myFormatter.parse(firstString);
            day = (secondTime.getTime() - firstTime.getTime()) / (24 * 60 * 60 * 1000);
        } catch (Exception e) {
            return "";
        }
        return day + "";
    }


    /**
     * 时间前推或后推分钟,其中JJ表示分钟.
     * @param StringTime：时间
     * @param minute：分钟（有正负之分）
     * @return
     */
    public static String getPreTime(String StringTime, String minute) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String mydate1 = "";
        try {
            Date date1 = format.parse(StringTime);
            long Time = (date1.getTime() / 1000) + Integer.parseInt(minute) * 60;
            date1.setTime(Time * 1000);
            mydate1 = format.format(date1);
        } catch (Exception e) {
            return "";
        }
        return mydate1;
    }


    /**
     * 将短时间格式字符串转换为时间 yyyy-MM-dd
     *
     * @param strDate
     * @return
     */
    public static Date strToDate(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }



    /**
     * 得到一个时间延后或前移几天的时间
     * @param nowdate：时间
     * @param delay：前移或后延的天数
     * @return
     */
    public static String getNextDay(String nowdate, String delay) {
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String mdate = "";
            Date d = strToDate(nowdate);
            long myTime = (d.getTime() / 1000) + Integer.parseInt(delay) * 24 * 60 * 60;
            d.setTime(myTime * 1000);
            mdate = format.format(d);
            return mdate;
        }catch(Exception e){
            return "";
        }
    }


    /**
     * 判断是否闰年
     * @param ddate
     * @return
     */
    public static boolean isLeapYear(String ddate) {
        /**
         * 详细设计： 1.被400整除是闰年，否则： 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
         * 3.能被4整除同时能被100整除则不是闰年
         */
        Date d = strToDate(ddate);
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(d);
        int year = gc.get(Calendar.YEAR);
        if ((year % 400) == 0){
            return true;
        }else if ((year % 4) == 0){
            if ((year % 100) == 0){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }


    /**
     * 返回美国时间格式
     * @param str
     * @return
     */
    public static String getEDate(String str) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(str, pos);
        String j = strtodate.toString();
        String[] k = j.split(" ");
        return k[2] + k[1].toUpperCase() + k[5].substring(2, 4);
    }


    /**
     * 判断二个时间是否在同一个周
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameWeekDates(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        int subYear = cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR);
        if(0 == subYear) {
            if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR)){
                return true;
            }
        }else if(1 == subYear && 11 == cal2.get(Calendar.MONTH)) {
            // 如果12月的最后一周横跨来年第一周的话则最后一周即算做来年的第一周
            if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR)){
                return true;
            }
        }else if (-1 == subYear && 11 == cal1.get(Calendar.MONTH)) {
            if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR)){
                return true;
            }
        }
        return false;
    }



    /**
     * 产生周序列,即得到当前时间所在的年度是第几周
     * @return
     */
    public static String getSeqWeek() {
        Calendar c = Calendar.getInstance(Locale.CHINA);
        String week = Integer.toString(c.get(Calendar.WEEK_OF_YEAR));
        if (week.length() == 1)
            week = "0" + week;
        String year = Integer.toString(c.get(Calendar.YEAR));
        return year +"年第"+ week+"周";
    }


    /**
     * 获得一个日期所在的周的星期几的日期，如要找出2002年2月3日所在周的星期一是几号
     * @param sdate：日期
     * @param num：星期几（星期天是一周的第一天）
     * @return
     */
    public static String getWeek1(String sdate, String num) {
        // 再转换为时间
        Date dd = strToDate(sdate);
        Calendar c = Calendar.getInstance();
        c.setTime(dd);
        if (num.equals("1")) // 返回星期一所在的日期
            c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        else if (num.equals("2")) // 返回星期二所在的日期
            c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        else if (num.equals("3")) // 返回星期三所在的日期
            c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        else if (num.equals("4")) // 返回星期四所在的日期
            c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
        else if (num.equals("5")) // 返回星期五所在的日期
            c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        else if (num.equals("6")) // 返回星期六所在的日期
            c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        else if (num.equals("0")) // 返回星期日所在的日期
            c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
    }


    /**
     * 根据一个日期，返回是星期几的字符串
     * @param sdate
     * @return
     */
    public static String getWeek(String sdate) {
        // 再转换为时间
        Date date = strToDate(sdate);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        // int hour=c.get(Calendar.DAY_OF_WEEK);
        // hour中存的就是星期几了，其范围 1~7
        // 1=星期日 7=星期六，其他类推
        return new SimpleDateFormat("EEEE").format(c.getTime());
    }


    /**
     * 根据一个日期，返回是星期几的字符串
     * @param sdate
     * @return
     */
    public static String getWeekStr(String sdate){
        String str = "";
        str = getWeek(sdate);
        if("1".equals(str)){
            str = "星期日";
        }else if("2".equals(str)){
            str = "星期一";
        }else if("3".equals(str)){
            str = "星期二";
        }else if("4".equals(str)){
            str = "星期三";
        }else if("5".equals(str)){
            str = "星期四";
        }else if("6".equals(str)){
            str = "星期五";
        }else if("7".equals(str)){
            str = "星期六";
        }
        return str;
    }


    /**
     * 两个时间之间的天数
     * @param date1
     * @param date2
     * @return
     */
    public static long getDays(String date1, String date2) {
        if (date1 == null || date1.equals(""))
            return 0;
        if (date2 == null || date2.equals(""))
            return 0;
        // 转换为标准时间
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        java.util.Date mydate = null;
        try {
            date = myFormatter.parse(date1);
            mydate = myFormatter.parse(date2);
        } catch (Exception e) {
        }
        long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
        return day;
    }


    /**
     * 形成如下的日历 ， 根据传入的一个时间返回一个结构 星期日 星期一 星期二 星期三 星期四 星期五 星期六 下面是当月的各个时间
     * 此函数返回该日历第一行星期日所在的日期
     * @param sdate
     * @return
     */
    public static String getNowMonth(String sdate) {
        // 取该时间所在月的一号
        sdate = sdate.substring(0, 8) + "01";

        // 得到这个月的1号是星期几
        Date date = strToDate(sdate);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int u = c.get(Calendar.DAY_OF_WEEK);
        String newday = getNextDay(sdate, (1 - u) + "");
        return newday;
    }


    /**
     * 根据用户传入的时间表示格式，返回当前时间的格式 如果是yyyyMMdd，注意字母y不能大写
     * @param sformat
     * @return
     */
    public static String getUserDate(String sformat) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(sformat);
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /*
     * @Description  将时间按自然日周月切片
     * @author jiafeng
     * @date 2019/12/6 0006
     */
//月 返回类型String 字符串 eg：20190102~20190131~20190201~20190230~
    public static String getMonths(String begins, String ends) throws ParseException {
        StringBuilder time = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date begin = new Date();
        Date end = new Date();

        begin = sdf.parse(begins);
        end = sdf.parse(ends);

        Calendar cal_begin = Calendar.getInstance();
        cal_begin.setTime(begin);
        Calendar cal_end = Calendar.getInstance();
        cal_end.setTime(end);
        while (true) {
            if (cal_begin.get(Calendar.YEAR) == cal_end.get(Calendar.YEAR)&& cal_begin.get(Calendar.MONTH) == cal_end.get(Calendar.MONTH)) {
                time.append(sdf.format(cal_begin.getTime())+"~"+sdf.format(cal_end.getTime())+"~");
                break;
            }
            String str_begin = sdf.format(cal_begin.getTime());
            String str_end = getMonthEnd(cal_begin.getTime());
            time.append(str_begin+"~"+str_end+"~");
            cal_begin.add(Calendar.MONTH, 1);
            cal_begin.set(Calendar.DAY_OF_MONTH, 1);
        }
        return time.toString();
    }
    //周 返回String类型字符串 eg：20190102~20190106~20190107~20190113~
    public static String getWeeks(String begins, String ends) throws ParseException {
        StringBuilder time1 = new StringBuilder();
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
        String begin_date =begins;
        String end_date =ends;
        String begin_date_fm =  begins;
        String end_date_fm = ends;
        Date b = null;
        Date e = null;
        try {
            b = sd.parse(begin_date_fm);
            e = sd.parse(end_date_fm);
        } catch (ParseException ee) {
            ee.printStackTrace();
        }
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(b);
        Date time =b;
        String timeb = begin_date_fm;

        String timee = null;
        if(begin_date.equals(end_date)){
            time1.append(begin_date+"~"+end_date+"~");
        }else{
            while(time.getTime()<=e.getTime()){
                rightNow.add(Calendar.DAY_OF_YEAR,1);
                time = sd.parse(sd.format(rightNow.getTime()));
                if(time.getTime()>e.getTime()){break;}
                Calendar calendar = Calendar. getInstance();
                calendar.setTime(time);
                int timew = calendar.get(Calendar.DAY_OF_WEEK);
                if(timew == 2){
                    timeb = (sd.format(time));
                }
                if(timew ==1 || time.getTime() == e.getTime()){
                    timee = (sd.format(time));
                    time1.append(timeb+"~"+timee+"~");
                }
            }
        }
        return time1.toString();
    }


    //根据时间区间获得日时间段 eg：20190102~20190102~
    public static String getDays1(String start, String end) throws java.text.ParseException {
        StringBuilder time = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date dBegin = sdf.parse(start);
        Date dEnd = sdf.parse(end);
        time.append(sdf.format(dBegin)+"~");
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            time.append(sdf.format(calBegin.getTime())+"~");
        }
        return time.toString();
    }
}
