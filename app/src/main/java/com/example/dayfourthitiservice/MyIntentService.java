package com.example.dayfourthitiservice;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;


public class MyIntentService extends IntentService {

    public static String TAG="IntentService";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "onHandleIntent: ");
        long endTime = System.currentTimeMillis();
        while (System.currentTimeMillis()<endTime){
            synchronized (this){
                try{
                    wait(endTime - System.currentTimeMillis());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }
}