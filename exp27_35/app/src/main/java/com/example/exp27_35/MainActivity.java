package com.example.exp27_35;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1=findViewById(R.id.b1);
    }
    public void submit(View view) {
        if (e1.getText().toString().equals("khush")){
            if (e2.getText().toString().equals("khus1110")){
                Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(getApplicationContext(),"Login Unsuccessfully",Toast.LENGTH_LONG).show();
            }
        }
        else {
            Toast.makeText(getApplicationContext(),"Login Unsuccessfully",Toast.LENGTH_LONG).show();
        }
    }
}