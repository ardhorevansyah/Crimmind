package com.example.timnasplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.ActivityNotFoundException;
import android.net.Uri;


public class MainHomeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    private Button btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId( )) {
            case R.id.button1:
                startActivity(new Intent(this, MainModusActivity.class));
                break;

                case R.id.button2:
                    startActivity(new Intent(this, MainActivity.class));
                    break;



        }

    }
public void buka(View view) {
        Uri uri = Uri.parse("https://www.instagram.com/divisihumaspolri/?hl=id");
        Intent button3 = new Intent(Intent.ACTION_VIEW, uri);
        button3.setPackage("com.instagram.android");

        try {
        startActivity(button3);
        } catch (ActivityNotFoundException e) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/divisihumaspolri/?hl=id")));
        }
        }
        }



