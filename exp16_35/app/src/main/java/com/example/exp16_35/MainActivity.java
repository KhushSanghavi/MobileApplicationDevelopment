package com.example.exp16_35;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    EditText e1, e2;
    Integer y, m, d, mi, h;
    private boolean is24HourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
    }
    public void seldate(View view) {
        Calendar c = Calendar.getInstance();
        y = c.get(Calendar.YEAR);
        m = c.get(Calendar.MONTH);
        d = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dt1 = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener()
        {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                e1.setText(dayOfMonth + "-" + (month + 1) + "-" + year);
            }
        }, y, m, d);
        dt1.show();
    }
    public void seltime(View view) {
        Calendar c = Calendar.getInstance();
        h = c.get(Calendar.HOUR_OF_DAY);
        mi = c.get(Calendar.MINUTE);
        TimePickerDialog timep = new TimePickerDialog(this, new
                TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        e2.setText(hourOfDay + ":" + minute);
                    }
                }, h, mi, false);
        timep.show();
    }
}