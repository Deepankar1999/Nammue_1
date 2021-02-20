package com.example.nammur_public_news;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class choose_location__5 extends AppCompatActivity {

    private TextView textView;
    private View confirm;
    private RequestQueue mQueue;
    List<location> locationList;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_location__5);
        confirm = (View) findViewById(R.id.rectangle_2110_ek1);
        listView = (ListView) findViewById(R.id.listView);
        locationList=new ArrayList<>();

        textView=findViewById(R.id._________ek1);

        mQueue = Volley.newRequestQueue(this);
        clicklistener(confirm);

        request();




    }


    public void clicklistener(View e) {
        //Click Listener for english Option
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locationActivity = new Intent(choose_location__5.this, UserRegistration__1.class);
                choose_location__5.this.startActivity(locationActivity);

            }
        });


    }

    public void request(){
        String url="http://demo.fruitsec.in/api/user/district";
        JsonObjectRequest request= new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray=response.getJSONArray("data");
                    for (int i=0;1<jsonArray.length();i++){
                        JSONObject data= jsonArray.getJSONObject(i);
                        String district=data.getString("name");
                        location dist=new location(district);

                        locationList.add(dist);

                    }
                    location_LIstViewAdapter adapter= new location_LIstViewAdapter(locationList, getApplicationContext());
                    listView.setAdapter(adapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }




}

