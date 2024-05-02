package com.example.exp14_35;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=(ImageView)findViewById(R.id.imageView2);
    }
    public void display(View view) {
        i.setImageResource(R.drawable.instagram);
    }


}
