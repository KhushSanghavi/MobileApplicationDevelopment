package com.example.exp28_35;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;
    String userin, passin;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.e1);

        e2 = findViewById(R.id.e2);
    }

    public void submit(View view) {
        userin = e1.getText().toString();
        passin = e2.getText().toString();
        if (!userin.isEmpty()) {
            if (userin.length() >= 5) {
                if (userin.equals("khush")) {
                    if (!passin.isEmpty()) {
                        if (passin.length() >= 8) {
                            if (passin.equals("khush1110")) {
                                count += 1;
                                Toast.makeText(getApplicationContext(), "Login Successfully\n after number of attempts:" + count, Toast.LENGTH_LONG).show();
                            } else {
                                count += 1;
                                Toast.makeText(getApplicationContext(), "Login UnSuccessfully\ninvalid password\nnumber of attempts:" + count, Toast.LENGTH_LONG).show();
                            }
                        } else {
                            count += 1;
                            Toast.makeText(getApplicationContext(), "Login unSuccessfully\npassword must be atleast 8 length\nnumber of attempts:" + count, Toast.LENGTH_LONG).show();
                        }
                    } else {
                        count += 1;
                        Toast.makeText(getApplicationContext(), "Login unSuccessfully\nenter password\nnumber of attempts:" + count, Toast.LENGTH_LONG).show();
                    }
                } else {
                    count += 1;
                    Toast.makeText(getApplicationContext(), "Login unSuccessfully\nenter valid username\nnumber of attempts:" + count, Toast.LENGTH_LONG).show();
                }
            } else {
                count += 1;
                Toast.makeText(getApplicationContext(), "Login unSuccessfully\nusername must be atleast 5 length\nnumber of attempts:" + count, Toast.LENGTH_LONG).show();
            }
        } else {
            count += 1;
            Toast.makeText(getApplicationContext(), "Login unSuccessfully\nenter username\nnumber of attempts:" + count, Toast.LENGTH_LONG).show();
        }
    }
}