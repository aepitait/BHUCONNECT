package com.example.shashikant.bhuconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout complainLinearLayout = (LinearLayout)findViewById(R.id.complain_LinearLayout);
        complainLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent complainIntent = new Intent(MainActivity.this, Complain.class);
                startActivity(complainIntent);
            }
        });
    }
}
