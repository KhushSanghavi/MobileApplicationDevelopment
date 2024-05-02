package com.example.exp21_35;

import androidx.appcompat.app.AppCompatActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView t1;
    ProgressBar p1;
    BroadcastReceiver mReciever;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        p1=findViewById(R.id.p1);
        mReciever = new BatteryReceiver();
    }
    protected void onStart(){
        registerReceiver(mReciever,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        super.onStart();
    }
    protected void onStop(){
        unregisterReceiver(mReciever);
        super.onStop();
    }

    private class BatteryReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
            t1.setText("Battery Level"+level+"%");
            p1.setProgress(level);
        }
    }
}