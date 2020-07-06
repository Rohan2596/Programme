package com.spatalabz.programme;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

public class Content extends AppCompatActivity {

    Toolbar toolbar;
    Intent intent;
    String techTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        intent=getIntent();
        techTitle=intent.getStringExtra("TechStack");
        getSupportActionBar().setTitle(techTitle);
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}