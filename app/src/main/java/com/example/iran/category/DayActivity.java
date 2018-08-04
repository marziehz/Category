package com.example.iran.category;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        ArrayList<category> list_day = new ArrayList<>();

        list_day.add(new category("Sunday",0));
        list_day.add(new category("Monday",0));
        list_day.add(new category("Tuesday",0));
        list_day.add(new category("Wednesday",0));
        list_day.add(new category("Thursday",0));
        list_day.add(new category("Friday",0));



        ListView lv_number = findViewById(R.id.lv_day);

        Adapter adapter = new Adapter(this,list_day,R.color.lightblue);
        lv_number.setAdapter( adapter);
    }
}
