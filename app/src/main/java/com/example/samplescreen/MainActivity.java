package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnChildhood;
    Button btnFamily;
    Button btnWork;
    Button btnWisdom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChildhood = (Button)findViewById(R.id.btnChildhood);
        btnFamily = (Button)findViewById(R.id.btnFamily);
        btnWork = (Button)findViewById(R.id.btnWork);
        btnWisdom = (Button)findViewById(R.id.btnWisdom);

        btnChildhood.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(MainActivity.this, Childhood.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });

       btnFamily.setOnClickListener(new View.OnClickListener(){
           Intent intNextActivity = new Intent(MainActivity.this, Family.class);
           @Override
           public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
           }
       });

        btnWork.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(MainActivity.this, Work.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });

        btnWisdom.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(MainActivity.this, Wisdom.class);
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
        MainActivity.this.overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
    }


}
