package com.example.exp18_35;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        t1=findViewById(R.id.t1);
        String val=getIntent().getStringExtra("num");
        int n=Integer.parseInt(val.toString());
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        t1.setText(String.valueOf(fact));
    }
}