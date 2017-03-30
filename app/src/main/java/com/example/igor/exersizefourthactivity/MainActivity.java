package com.example.igor.exersizefourthactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView firstName;

    public TextView surName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = (TextView)findViewById(R.id.firstName);
        surName = (TextView)findViewById(R.id.surName);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void submit(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("firstName", firstName.getText().toString());
        intent.putExtra("secondName", surName.getText().toString());
        startActivity(intent);
    }
}
