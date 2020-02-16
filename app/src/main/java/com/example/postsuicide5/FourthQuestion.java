package com.example.postsuicide5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class FourthQuestion extends AppCompatActivity {

    private TextView txt;
    private Button btn;
    private RatingBar firstRat;
    public static float fourthStar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);
        listenerForRatingBar();
        init();
    }
    public void listenerForRatingBar(){
        firstRat = (RatingBar)findViewById(R.id.ratingBar5);
        txt = (TextView)(findViewById(R.id.Text5));
        firstRat.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        txt.setText(String.valueOf(rating));
                        fourthStar = firstRat.getRating();
                    }
                }
        );
    }
    public void init(){
        btn = (Button) findViewById(R.id.next5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bub = new Intent(FourthQuestion.this,FifthQuestion.class);
                startActivity(bub);
            }
        });
    }

}
