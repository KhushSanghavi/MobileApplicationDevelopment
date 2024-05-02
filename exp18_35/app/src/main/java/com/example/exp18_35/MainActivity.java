package com.example.exp18_35;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
    }
    public void fact(View view) {
        Intent in = new Intent(this,SecondActivity2.class);
        String no = e1.getText().toString();
        in.putExtra("num",no);
        startActivity(in);
    }
}