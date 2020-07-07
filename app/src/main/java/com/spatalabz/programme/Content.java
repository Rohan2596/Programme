package com.spatalabz.programme;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Content extends AppCompatActivity {

    Toolbar toolbar;
    Intent intent;
    String techTitle;
    ListView simpleList;
    //"SHELLSCRIPT PROGRAMMING","JAVA PROGRAMMING"
    String javaList[]={"1. Java Introduction", "China", "australia", "Portugle"};
    String shelllists[]={"1. Shell Introduction", "australia", "Portugle", "America", "NewZealand"};

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


        if(techTitle.equals("SHELLSCRIPT PROGRAMMING")){
            simpleList = (ListView)findViewById(R.id.contentList);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.content_list, R.id.textView, shelllists);
            simpleList.setAdapter(arrayAdapter);

        }
        if(techTitle.equals("JAVA PROGRAMMING")){
            simpleList = (ListView)findViewById(R.id.contentList);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.content_list, R.id.textView, javaList);
            simpleList.setAdapter(arrayAdapter);

        }

    }


}