package com.example.exams;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox c1,c2,c3;
Button b1;
String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
    }


    public void display(View view) {
        str="";
        if(c1.isChecked()) {
            str=""+"c1 selected"+"";
        }
        if(c2.isChecked()) {
            str=""+"c2 selected"+"";
        }
        if(c3.isChecked()) {
            str=""+"c3 selected"+"";
        }
        Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();
    }
}