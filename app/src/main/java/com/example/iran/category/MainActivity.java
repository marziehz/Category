package com.example.iran.category;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_n = findViewById(R.id.txt_N);
        TextView tv_f = findViewById(R.id.txt_F);
        TextView tv_d = findViewById(R.id.txt_D);

        tv_n.setOnClickListener(this);
        tv_f.setOnClickListener(this);
        tv_d.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        Intent intent = null ;
        switch (id){

            case R.id.txt_N:
                intent = new Intent(MainActivity.this,NumberActivity.class);
                Toast.makeText(this, "Numbers", Toast.LENGTH_SHORT).show();
                break;

            case R.id.txt_F:
                intent = new Intent(MainActivity.this,FamilyActivity.class);
                Toast.makeText(this, "Family", Toast.LENGTH_SHORT).show();
                break;

            case R.id.txt_D:
                intent = new Intent(MainActivity.this,DayActivity.class);
                Toast.makeText(this, "Days", Toast.LENGTH_SHORT).show();
                break;
        }

        startActivity(intent);

    }
}
