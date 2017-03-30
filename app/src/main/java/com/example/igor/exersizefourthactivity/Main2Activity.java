package com.example.igor.exersizefourthactivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
//import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    public TextView firstName;

    public TextView secondName;

    public String first;

    public String second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        first = new String(getIntent().getExtras().getString("firstName"));
        second = new String(getIntent().getExtras().getString("secondName"));
        firstName = (TextView)findViewById(R.id.firstName);
        secondName = (TextView)findViewById(R.id.secondName);
        firstName.setText(first);
        secondName.setText(second);
    }

}
