package com.example.nammur_public_news;
import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class choose_location__5 extends AppCompatActivity {
    // the Url having the json data
    private static final String URL="http://demo.fruitsec.in/api/user/district";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_location__5);

        //this method will fetch and parse the data
        loadDistrictList();
    }
    public void loadDistrictList(){


        //creating a string request to send request to the url
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            //getting the whole json object from the response
                            JSONObject obj = new JSONObject(response);

                            //we have the array named hero inside the object
                            //so here we are getting that json array
                            JSONArray districtArray = obj.getJSONArray("names");

                            //now looping through all the elements of the json array
                            for (int i = 0; i < districtArray.length(); i++) {
                                //getting the json object of the particular index inside the array
                                JSONObject heroObject = districtArray.getJSONObject(i);

                                //creating a hero object and giving them the values from json object


                                //adding the district to district list

                            }

                            //creating custom adapter object


                            //adding the adapter to listview


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //displaying the error in toast if occurrs
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        //creating a request queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //adding the string request to request queue
        requestQueue.add(stringRequest);


    }
}