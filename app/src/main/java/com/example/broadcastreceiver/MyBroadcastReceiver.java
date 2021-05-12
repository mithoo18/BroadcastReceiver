package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    String ACTION = "com.example.action.MY_ACTION";

    public MyBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent != null && intent.getAction().equals(ACTION)){
            String data = intent.getStringExtra("data");
            Toast.makeText(context,data,Toast.LENGTH_SHORT).show();
        }
        if (intent == null){
            Toast.makeText(context,"null",Toast.LENGTH_SHORT).show();
        }
    }
}
