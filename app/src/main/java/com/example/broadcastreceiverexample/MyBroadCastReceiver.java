package com.example.broadcastreceiverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if("com.example.BR_FILTER".equals(intent.getAction())){

            Toast.makeText(context,intent.getStringExtra("data"),Toast.LENGTH_LONG).show();
        }

    }
}
