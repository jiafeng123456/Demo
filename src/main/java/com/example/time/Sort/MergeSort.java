package com.example.time.Sort;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *@description:
 *@author jiafeng
 *@date 2020/9/23 0023 15:21
 */
public class MergeSort {

    public static void main(String[] args) {
        String json ="{\"\":[{\"ret\":\"{\"resphead\":{\"respdetails\":\"成功\",\"respcode\":\"0000\"},\"respbody\":[{\"complextagcode\":\"209e6eb6395d48a0ac6d1957fb6b03a1\"},{\"complextagcode\":\"e67bea8057894d42a36f44dc5d92cb62\"}]}\"}]}";
        System.out.println(getParamByRex(json));
    }

    public static String getParamByRex(String json) {
        Pattern pattern = Pattern.compile("/^\\w+([()]+)$/");
        Matcher matcher = pattern.matcher(json);
        String result = null;
        while (matcher.find()) {
            result = matcher.group(1);
        }
        return result;
    }
}
