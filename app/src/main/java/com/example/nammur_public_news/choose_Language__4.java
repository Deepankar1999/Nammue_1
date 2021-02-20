package com.example.nammur_public_news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choose_Language__4 extends AppCompatActivity {
    private View eng;
    private View Kannad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose__language__4);
        //Declaring Views
        eng=(View)findViewById(R.id.rectangle_95);
        Kannad=(View)findViewById(R.id.rectangle_2110);
        // Calling Click Listener Function
        clicklistener(eng,Kannad);

    }
    public void clicklistener(View e,View k){
        //Click Listener for english Option
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locationActivity=new Intent(choose_Language__4.this,choose_location__5.class);
                choose_Language__4.this.startActivity(locationActivity);

            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locationActivity=new Intent(choose_Language__4.this,choose_location__5.class);
                choose_Language__4.this.startActivity(locationActivity);

            }
        });




    }
}