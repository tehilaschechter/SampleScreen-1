package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Childhood extends AppCompatActivity {
    ImageView btnProfileHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_childhood);

        btnProfileHome = (ImageView)findViewById(R.id.btnProfileHome);

        btnProfileHome.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(Childhood.this, MainActivity.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });
    }

    //Configure back button animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Childhood.this.overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
    }
}
