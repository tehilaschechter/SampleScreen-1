package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFamily;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFamily = (Button)findViewById(R.id.btnFamily);

       btnFamily.setOnClickListener(new View.OnClickListener(){
           Intent intNextActivity = new Intent(MainActivity.this, child.class);


           @Override
           public void onClick(View v) {
                startActivity(intNextActivity);
           }
       });
    }


}
