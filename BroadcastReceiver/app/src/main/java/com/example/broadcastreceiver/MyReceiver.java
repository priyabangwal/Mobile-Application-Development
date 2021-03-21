package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import ...

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    protected void onReceive(Context context, Intent intent);

    ConnectivityManager conMan = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo nt = conMan.getActiveNetworkInfo();
    if(nt.getType()== ConnectivityManager.TYPE_MOBILE)
    }
}