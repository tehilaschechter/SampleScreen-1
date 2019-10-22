package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

public class Work extends AppCompatActivity {
    ImageView imgProfileHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        imgProfileHome = (ImageView)findViewById(R.id.btnProfileHome);

        imgProfileHome.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Work.this, MainActivity.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });
    }

    // Configure back button animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Work.this.overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
    }
}
