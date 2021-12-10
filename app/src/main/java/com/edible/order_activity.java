package com.edible;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class order_activity extends AppCompatActivity {

    private Button order_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        order_back = findViewById(R.id.order_back);
        order_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(order_activity.this,Item_Category.class);
                startActivity(b);
            }
        });
    }
    @Override
    public void onBackPressed() {

        finish();

    }
}