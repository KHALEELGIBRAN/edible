package com.edible;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    private TextView forget,admin,signup;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         admin = findViewById(R.id.admin);
         signup = findViewById(R.id.signup);
        String text = "Not Registered? SignUp";
        SpannableString ss = new SpannableString(text);

        ClickableSpan ClickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {

                Intent sing = new Intent(Login.this,sign_up.class);
                startActivity(sing);

            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getResources().getColor(R.color.Yellow));
                ds.setUnderlineText(false);
            }
        };

        ss.setSpan(ClickableSpan1, 16,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        signup.setText(ss);
        signup.setMovementMethod(LinkMovementMethod.getInstance());


        forget = findViewById(R.id.forget);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sing = new Intent(Login.this,forget_password.class);
                startActivity(sing);
            }
        });

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sing = new Intent(Login.this,Item_Category.class);
                startActivity(sing);
            }
        });


        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sing = new Intent(Login.this,Admin_Item_Category.class);
                startActivity(sing);
            }
        });
        
        

    }


    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        new AlertDialog.Builder(this)
                .setTitle("Exit Edible")
                .setMessage("Are you sure you want to Exit?")
                .setPositiveButton("Yes",new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which){
                        //super.onBackPressed();
                        //Or used finish();


                        finishAffinity();
                        System.exit(0);
                    }
                })
                .setNegativeButton("No",null)
                .show();

    }
}