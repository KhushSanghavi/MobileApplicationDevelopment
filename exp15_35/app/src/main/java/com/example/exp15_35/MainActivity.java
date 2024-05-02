package com.example.exp15_35;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button b1;
    CheckBox c1,c2,c3,c4,c5;
    String s;
    Integer total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
    }
    public void select(View view) {
        s="";
        total=0;
        if (c1.isChecked())
        {
            s=s + " " + "PIZZA 200Rs";
            total=total+200;
        }
        if (c2.isChecked())
        {
            s=s + " " + "COFFEE 50Rs";
            total=total+50;
        }
        if (c3.isChecked())
        {
            s=s + " " + "BURGER 120Rs";
            total=total+120;
        }
        s="Selected Items"+"\n"+s +"\n"+ "Total: " + total.toString()+"Rs";
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }
}
