package com.example.broadcastreceiverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){

            boolean isConnected=intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false);
            Toast.makeText(context,"Network Not Connected :::"+isConnected,Toast.LENGTH_LONG).show();
        }

    }
}
