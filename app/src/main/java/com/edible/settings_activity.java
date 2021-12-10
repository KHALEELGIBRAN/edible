package com.edible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings_activity extends AppCompatActivity {

    private Button settings_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        settings_back = findViewById(R.id.settings_back);
        settings_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sing = new Intent(settings_activity.this,Item_Category.class);
                startActivity(sing);
            }
        });
    }
    @Override
    public void onBackPressed() {

        finish();

    }
}