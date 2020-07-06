package com.spatalabz.programme;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter {

    String [] techStackName;
    Context context;
    int [] techStackImage;
    LayoutInflater inflater;

    public CustomAdapter(Topic topic, String[] techStackNames,int[] techStackImages) {
    techStackName=techStackNames;
    context=topic;
    techStackImage=techStackImages;
     inflater=(LayoutInflater) context
             .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return techStackName.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder
    {
        TextView techName;
        ImageView techImage;
    }

    @Override
    public View getView(final int position, View techGrid, ViewGroup parent) {
        Holder holder=new Holder();



        techGrid = inflater.inflate(R.layout.topic_grid,null);
        holder.techName=(TextView) techGrid.findViewById(R.id.techName);
        holder.techImage=(ImageView) techGrid.findViewById(R.id.techImage);

        holder.techName.setText(techStackName[position]);
        holder.techImage.setImageResource(techStackImage[position]);


        return techGrid;
    }



}
