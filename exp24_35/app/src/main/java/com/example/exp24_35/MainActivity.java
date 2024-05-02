package com.example.exp24_35;

import androidx.appcompat.app.AppCompatActivity;
import android.bluetooth.BluetoothAdapter;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Set;
public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    BluetoothAdapter BA;
    Set<BluetoothDevice> devices;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        t1=findViewById(R.id.t1);
        BA=BluetoothAdapter.getDefaultAdapter();
    }
    public void on(View view) {
        if (BA.isEnabled()){
            Toast.makeText(getApplicationContext(),"Already on",Toast.LENGTH_LONG).show();
        }
        else {
            Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            startActivity(turnOn);
            Toast.makeText(getApplicationContext(),"Turned on",Toast.LENGTH_LONG).show();
        }
    }
    public void visible(View view) {
        Intent getVisible= new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivity(getVisible);
    }
    public void list(View view) {
        t1.append("\nPaired Devices are:");
        devices = BA.getBondedDevices();
        for (BluetoothDevice device : devices){
            t1.append("\n Device :"+ device.getName());
        }
    } public void off(View view) {
        BA.disable();
        Toast.makeText(getApplicationContext(),"Turned off",Toast.LENGTH_LONG).show();
    }
}