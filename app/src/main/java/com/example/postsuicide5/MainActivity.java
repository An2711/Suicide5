package com.example.postsuicide5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btn;

    public void init(){
        btn = (Button) findViewById(R.id.WeeklyLog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bub = new Intent(MainActivity.this,WeeklyLogInstruc.class);
                startActivity(bub);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("MyApp", "This is your weekly log!");
//                Toast.makeText(getApplicationContext(), "It's your log!", Toast.LENGTH_LONG).show();
//            }
//        });
    }
}
