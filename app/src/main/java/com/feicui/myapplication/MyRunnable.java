package com.feicui.myapplication;

import android.os.Handler;

/**
 * 重点
 * Created by AAAAA on 2016/6/27.
 */
public abstract class MyRunnable implements Runnable {
    Handler mHandler;
    int time=0;
    public MyRunnable(Handler handler,int time){
        mHandler=handler;
        this.time=time;
    }

    @Override
    public void run() {
        time=time-1;
        turnoverTime(time);
        if (time==30){
            onPlayNotification();
        }
        if (time>0){
            mHandler.postDelayed(this,1000);
        }else {
            overTime();
        }
    }

    protected abstract void overTime();

    protected abstract void onPlayNotification();

    protected abstract void turnoverTime(int time);
}
