package com.example.postsuicide5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeeklyLogInstruc extends AppCompatActivity {

    public Button surveyBtn;

    public void init(){
        surveyBtn = (Button) findViewById(R.id.callSurvey);
        surveyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bub = new Intent(WeeklyLogInstruc.this,FirstQuestion.class);
                startActivity(bub);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_log_instruc);
        init();
    }
}
