package com.example.broadcastreceiverexample;

import android.app.Application;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

public class BroadCastReceiverExample extends Application {


    MyBroadCastReceiver myBroadCastReceiver=new MyBroadCastReceiver();
    @Override
    public void onCreate() {
        super.onCreate();

        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(myBroadCastReceiver, intentFilter);
    }




}
