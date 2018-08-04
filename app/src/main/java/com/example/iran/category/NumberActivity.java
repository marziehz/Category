package com.example.iran.category;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


        ArrayList<category>  list_number = new ArrayList<>();

        list_number.add(new category(R.drawable.number1,"One",1));
        list_number.add(new category(R.drawable.number2,"Two",1));
        list_number.add(new category(R.drawable.number3,"Three",1));
        list_number.add(new category(R.drawable.number4,"Four",1));
        list_number.add(new category(R.drawable.number5,"Five",1));
        list_number.add(new category(R.drawable.number6,"Six",1));
        list_number.add(new category(R.drawable.number7,"Seven",1));



        ListView lv_number = findViewById(R.id.lv_number);

        Adapter adapter = new Adapter(this,list_number,R.color.white);
        lv_number.setAdapter( adapter);



    }
}
