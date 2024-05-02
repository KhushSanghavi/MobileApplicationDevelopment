package com.example.exp20_35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
    }

    public void start(View view) {
        WifiManager wifi=(WifiManager)
                getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifi.setWifiEnabled(true);
        s="service started";
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
    }

    public void stop(View view) {
        WifiManager wifi=(WifiManager)
                getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifi.setWifiEnabled(false);
        s="service stop";
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
    }
}