package com.spatalabz.programme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class Topic extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    GridView topicGridView;
    Context context;


    public static  String[] techstackName={"SHELLSCRIPT PROGRAMMING","JAVA PROGRAMMING"};
    public static int [] techstackImages={R.drawable.shell,R.drawable.java};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        drawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView=(NavigationView) findViewById(R.id.nav_view);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
setSupportActionBar(toolbar);
         actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.navigation_open,R.string.navigation_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorWhite));
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        topicGridView=(GridView) findViewById(R.id.topicGrid);
        topicGridView.setAdapter(new CustomAdapter(this, techstackName,techstackImages));;

        topicGridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                if(position==0) {
                    Intent toContentActivity= new Intent(Topic.this,Content.class);
                    toContentActivity.putExtra("TechStack",techstackName[position]);
                                        Toast.makeText(getApplicationContext(), "You Clicked "+ techstackName[position], Toast.LENGTH_LONG).show();
                    startActivity(toContentActivity);
                }
                else if(position==1)
                {
                    Intent toContentActivity= new Intent(Topic.this,Content.class);
                    toContentActivity.putExtra("TechStack",techstackName[position]);
                    Toast.makeText(getApplicationContext(), "You Clicked "+ techstackName[position], Toast.LENGTH_LONG).show();
                    startActivity(toContentActivity);

                }
//
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    public  void toContent(String techStack) {
        Intent toContentActivity= new Intent(Topic.this,Content.class);
        toContentActivity.putExtra("TechStack",techStack);
        startActivity(toContentActivity);
    }

}