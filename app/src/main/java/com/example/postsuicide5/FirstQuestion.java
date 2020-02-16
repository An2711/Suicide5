package com.example.postsuicide5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.view.View;
import android.util.Log;



public class FirstQuestion extends AppCompatActivity {

    private static String TAG = "Final analysis";
    private TextView txtFir;
    private Button btnFir;
    private RatingBar firstRat;
    public static float firStar;
    public FirstQuestion() {

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
        listenerForRatingBar();
        init();
    }

    public void listenerForRatingBar(){
        firstRat = (RatingBar)findViewById(R.id.ratingBar3);
        txtFir = (TextView)(findViewById(R.id.Text3));
        firstRat.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        txtFir.setText(String.valueOf(rating));
                        firStar = firstRat.getRating();
                        Log.d(TAG, "this is "+ firStar);
                    }
                }
        );
    }

    public void init(){
        btnFir = (Button) findViewById(R.id.next2);
        btnFir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bub = new Intent(FirstQuestion.this,SecQuestion.class);
                startActivity(bub);
            }
        });
    }
}
