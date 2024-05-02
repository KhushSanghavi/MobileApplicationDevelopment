package com.example.exp25_35;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        img=findViewById(R.id.img);
    }
    public void clock(View view) {
        Animation aniRotateClk =
                AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        img.startAnimation(aniRotateClk);
    }
    public void zoom(View view) {
        Animation animZoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        img.startAnimation(animZoom);
    }
    public void fade(View view) {
        Animation animfade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        img.startAnimation(animfade);
    }
}