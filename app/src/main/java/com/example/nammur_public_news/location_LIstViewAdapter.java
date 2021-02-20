package com.example.nammur_public_news;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class location_LIstViewAdapter extends ArrayAdapter<location> {
    //the district list that will be displayed
    private List<location> districtlist;

    // the context object
    private Context dCtx;


    //here we are getting the districtlist and context
    // so while creating the object of this adapter class we need to give districtlist and context
    public location_LIstViewAdapter(List<location> districtlist, Context dCtx){
        super(dCtx, R.layout.list_item_location, districtlist);
        this.districtlist=districtlist;
        this.dCtx=dCtx;
    }

    //this method will return the list item
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //getting the layoutinflater
        LayoutInflater inflater = LayoutInflater.from(dCtx);

        //creating a view with our xml layout
        @SuppressLint("ViewHolder") View listViewItem = inflater.inflate(R.layout.list_item_location,null,true);

        //getting the View

        TextView textDistrictName=listViewItem.findViewById(R.id._________ek1);

        //getting location district values to textviews
        location district = districtlist.get(position);

        //setting district values to textviews
        textDistrictName.setText(district.getDistrict());

        // returning the listitem
        return listViewItem;
    }
}
