package com.example.postsuicide5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private TextView txt;
    private Button btn;
    private RatingBar firstRat;
    public static float thirdStar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        listenerForRatingBar();
        init();
    }
    public void listenerForRatingBar(){
        firstRat = (RatingBar)findViewById(R.id.ratingBar4);
        txt = (TextView)(findViewById(R.id.Text4));
        firstRat.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        txt.setText(String.valueOf(rating));
                        thirdStar = firstRat.getRating();
                    }
                }
        );
    }
    public void init(){
        btn = (Button) findViewById(R.id.next4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bub = new Intent(ThirdActivity.this,FourthQuestion.class);
                startActivity(bub);
            }
        });
    }
}
