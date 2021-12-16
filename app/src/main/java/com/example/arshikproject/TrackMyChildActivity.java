package com.example.arshikproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrackMyChildActivity extends AppCompatActivity {
    private Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_my_child);
        b4=findViewById(R.id.button3);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrackMyChildActivity.this,SecurityActivity.class);
                startActivity(intent);
            }
        });
    }
}