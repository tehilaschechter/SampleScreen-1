package com.example.samplescreen;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JPGBackground extends AppCompatActivity {
    Button btnBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jpgbackground);


        btnBirth = (Button)findViewById(R.id.btnBirth);

        btnBirth.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(JPGBackground.this, child.class);


            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
            }
        });
    }
}
