package com.testtask.servicestest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("MyService", "onBind");
        return null;
    }

    @Override
    public void onCreate() {
        Log.d("MyService", "onCreate");
        super.onCreate();
    }

    //flags: 1 = START_FLAG_REDELIVERY, 2 = START_FLAG_RETRY

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService", "onStartCommand");
        if( intent != null) {
            Log.d("intent", intent.toString());
        } else Log.d("intent", "is null");

        Log.d("flags", flags + "");
        Log.d("startId", startId + "");

        new Runnable() {
            @Override
            public void run() {
                Log.d("MyServiceRuns", "started Run");
                SimpleSingleton.getInstance().doSomething();
                Log.d("MyServiceRuns", "ended Run");
            }
        }.run();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyService", "onDestroy");
    }
}
