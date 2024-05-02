package com.example.exp12_35;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);
    }
    public void display(View view) {
        s="";
        if (r1.isChecked())
        {
            s=s + " " +r1.getText().toString();
        }
        if (r2.isChecked())
        {
            s=s + " " +r2.getText().toString();
        }
        if (r3.isChecked())
        {
            s=s + " " +r3.getText().toString();
        }
        if (r4.isChecked())
        {
            s=s + " " +r4.getText().toString();
        }
        s="Following radio button are selected"+"\n"+s;
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }
}

