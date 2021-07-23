package com.myspeec.housrentsolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    CardView visitpost;
    CardView createpost;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        visitpost = (CardView) findViewById(R.id.home_cardview);
        createpost = (CardView) findViewById(R.id.post_cardview);

        visitpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HouseView.class);
                startActivity(i);
            }
        });

        createpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CreatePost.class);
                startActivity(i);
            }
        });

    }
}