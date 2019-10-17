package com.example.time.Utils;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *@description:
 *@author jiafeng
 *@date 2019/10/16 0016 09:30
 */
public class ExcelTest {
    public static void main(String[] args) throws Exception {
        List<Student> li = new ArrayList<Student>();

        for (int i = 0 ; i < 10 ; i++){
            Student stu1 = new Student();
            stu1.setUid("uid"+i);
            stu1.setUname("uname"+i);
            stu1.setSex("sex"+i);
            stu1.setNation("nation"+i);
            li.add(stu1);
        }
        OutputStream out = new FileOutputStream("d://aa.xls");
        Map<String, String> fields = new HashMap<String, String>();
        fields.put("uid", "学号");
        fields.put("uname", "姓名");
        fields.put("sex", "性别");
        fields.put("nation", "民族");
        ExcelUtil.ListtoExecl(li, out, fields);
        out.close();
    }
}
