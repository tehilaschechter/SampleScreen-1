package com.example.samplescreen;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Child extends AppCompatActivity {
    ImageView imgProfileHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        imgProfileHome = (ImageView)findViewById(R.id.btnProfileHome);

        imgProfileHome.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(Child.this, MainActivity.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_push_in_right,R.transition.anim_push_out_left);
            }
        });
    }

    // Configure back button animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Child.this.overridePendingTransition(R.transition.anim_push_in_left,R.transition.anim_push_out_right);
    }
}
