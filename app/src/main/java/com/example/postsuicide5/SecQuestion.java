package com.example.postsuicide5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class SecQuestion extends AppCompatActivity {

    private TextView txt2;
    private Button btn2;
    private RatingBar firstRat2;
    public static float secStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_question);
        listenerForRatingBar();
        init();
    }
        public void listenerForRatingBar(){
            firstRat2 = (RatingBar)findViewById(R.id.ratingBar);
            txt2 = (TextView)(findViewById(R.id.Text2));
            firstRat2.setOnRatingBarChangeListener(
                    new RatingBar.OnRatingBarChangeListener() {
                        @Override
                        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                            txt2.setText(String.valueOf(rating));
                            secStar = firstRat2.getRating();
                        }
                    }
            );
        }
        public void init(){
            btn2 = (Button) findViewById(R.id.next3);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent bub = new Intent(SecQuestion.this,ThirdActivity.class);
                    startActivity(bub);
                }
            });
        }
}

