package com.example.exp23_35;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
public class MainActivity extends AppCompatActivity {
    Button b1;
    VideoView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        v1=findViewById(R.id.v1);
    }
    public void video(View view) {
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(takeVideoIntent,1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            v1.setVideoURI(data.getData());
            v1.start();
        }
    }
    public void replay(View view) {
        v1.start();
    }
}