package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Family extends AppCompatActivity {
    Button btnChildren;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        btnChildren = (Button)findViewById(R.id.btnChildren);

        btnChildren.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(Family.this, Child.class);


            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });
    }
}
