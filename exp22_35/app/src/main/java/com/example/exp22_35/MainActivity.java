package com.example.exp22_35;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    ListView l1;
    SensorManager s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> deviceSensors = s.getSensorList(Sensor.TYPE_ALL);
        l1=findViewById(R.id.l1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,deviceSensors);
        l1.setAdapter(arrayAdapter);
    }
}