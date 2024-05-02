package com.example.exp29_35;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2;
    String phoneNo,message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
    }
    public void send(View view) {
        phoneNo = e1.getText().toString();
        message =e2.getText().toString();
        try {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phoneNo,null,message,null,null);
            Toast.makeText(getApplicationContext(),"SMS Sent",Toast.LENGTH_LONG).show();
        }catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
        }
    }
}