package com.example.iran.category;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<category> list_family = new ArrayList<>();

        list_family.add(new category(R.drawable.grandma,"Grandmother",1));
        list_family.add(new category(R.drawable.grandpa,"Grandfather",1));
        list_family.add(new category(R.drawable.mother,"Mother",1));
        list_family.add(new category(R.drawable.father,"Father",1));
        list_family.add(new category(R.drawable.sisi,"Sister",1));
        list_family.add(new category(R.drawable.bro,"Brother",1));


        ListView lv_number = findViewById(R.id.lv_family);

        Adapter adapter = new Adapter(this,list_family,R.color.pink);
        lv_number.setAdapter( adapter);
    }
}
