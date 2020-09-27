package com.example.time.test;


import com.example.time.dao.model.User;
import com.example.time.test.Thread.V;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.sql.SQLException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/*
 *@description:
 *@author jiafeng
 *@date 2019/11/29 0029 13:52
 */
public class A {
//    public static void main(String [] args)
//    {
//
//               String phone = "1316153003q";
//
//                   System.out.println(phone + (isMobile(phone) == true ? "为手机号":"不为手机号"));
//
//    }

    /** 
     * 大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数 
     * 此方法中前三位格式有： 
     * 13+任意数 
     * 15+除4的任意数 
     * 18+除1和4的任意数 
     * 17+除9的任意数 
     * 147 ·
     */
    public static boolean isMobile(String str) {
        String regExp = "^1\\d{10}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","2");
        map.put("2","3");
        System.out.println(map.toString());
    }

//    @ApiOperation(value="会议室预约-分页列表",notes="分页列表")
//    @GetMapping("getMeetingRessByParam")
//    public PageResult<MeetingRes> getMeetingRessByCriteria(MeetingResExample meetingResExample, Pageable page) {
//        log.debug("REST request to get MeetingRessByCriteria");
//        PageHelper.startPage(page.getPageNumber(), page.getPageSize());
//        String deptCode = RedisUtil.getBuildingInfo();
//        if (deptCode!=null){
//            meetingResExample.setDeptCode(deptCode);
//        }else {
//            meetingResExample.setDeptCode("0");
//        }
//        PageResult<MeetingRes> data = meetingResService.findByExample(meetingResExample, page);
//        List<MeetingRes> MeetingResData = data.getData();
//        for(MeetingRes m : MeetingResData){
//           String name =  m.getName();
//        }
//        return data;
//    }


}
