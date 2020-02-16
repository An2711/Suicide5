package com.example.postsuicide5;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class FifthQuestion extends AppCompatActivity {
    private static String TAG = "Final analysis";
    private TextView txt;
    private Button btn;
    private RatingBar firstRat;
    public static float fifthStar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);
        listenerForRatingBar();
        init();
    }
    public void listenerForRatingBar(){
        firstRat = (RatingBar)findViewById(R.id.ratingBar6);
        txt = (TextView)(findViewById(R.id.Text6));
        firstRat.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        txt.setText(String.valueOf(rating));
                        fifthStar = firstRat.getRating();
                    }
                }
        );
    }
    public void init(){
        Log.d(TAG, "I am here");
        btn = (Button) findViewById(R.id.next6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bub = new Intent(FifthQuestion.this,Stats.class);
                startActivity(bub);
            }
        });
    }
}
