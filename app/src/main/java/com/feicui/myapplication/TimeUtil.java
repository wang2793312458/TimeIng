package com.feicui.myapplication;

/**
 * 转换时间格式
 * Created by AAAAA on 2016/6/27.
 */
public class TimeUtil {
    public static String getTime(int time){
        int seconds=time%60;
        time=time/60;
        int minutes=time%60;
        time=time/60;
        int hour=time;
        String ss   = seconds < 10 ? "0" + seconds : seconds + "";
        String mm   = minutes < 10 ? "0" + minutes : minutes + "";
        String hh   = hour < 10 ? "0" + hour : hour + "";
        return hh+":"+mm+":"+ss;
    }
    public static int getIntTime(String time){
        if (time!=null){
            String timeString=time.trim();
            String[] strings=timeString.split(":");
            return Integer.valueOf(strings[0])*60*60 + Integer.valueOf(strings[1]) *
                    60 + Integer.valueOf(strings[2]);
        }
        return 0;
    }
}
