package com.yonyou.iuap.corp.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des
 */
public class BaseUtils {

    public static String getCurrentData(){
        Date date = new Date();
        String str = "yyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        return sdf.format(date);
    }

}
