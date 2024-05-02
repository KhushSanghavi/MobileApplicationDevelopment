package com.example.exp30_35;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
    }
    public void email(View view) {
        String emailsend = e1.getText().toString();
        String emailsubject = e2.getText().toString();
        String emailbody = e3.getText().toString();

        Intent in = new Intent(Intent.ACTION_SEND);
        in.putExtra(Intent.EXTRA_EMAIL,new String[] { emailsend});
        in.putExtra(Intent.EXTRA_SUBJECT,emailsubject);
        in.putExtra(Intent.EXTRA_TEXT,emailbody);
        in.setType("message/rfc822");
        startActivity(Intent.createChooser(in,"Choose an Email client"));
    }
}