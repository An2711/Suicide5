package com.example.postsuicide5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.graphics.Color;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;

public class FinalStats extends FifthQuestion {

    private static String TAG = "Final analysis";
    private String Happiness = "Happiness";
    private String SocialMedia = "Social Media";
    private String Sleep = "Sleep";
    private String General = "General";
    private String ExtraCirr = "Extra Currilcular";
    private float firQ = FirstQuestion.firStar;
    private float secQ = SecQuestion.secStar;
    private float thirdQ = ThirdActivity.thirdStar;
    private float fourthQ = FourthQuestion.fourthStar;
    private float fifthQ = FifthQuestion.fifthStar;
    private int firQues = 0;
    private int secQues = 0;
    private int thrQues = 0;
    private int frQuestion = 0;
    private int fivQuestion = 0;

    PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_stats);
        //booleanSet();


       // int[] percentages = new int[5];
        booleanSet();

        pieChart = (PieChart) findViewById(R.id.idPieChart);

        pieChart.setDescription("Statistics of your friend");
        pieChart.setRotationEnabled(true);
        pieChart.setHoleRadius(25f);
        pieChart.setTransparentCircleAlpha(0);
        pieChart.setCenterText("Statistics");
        pieChart.setCenterTextSize(10);
        pieChart.setDrawEntryLabels(true);
        addDataSet();


    }



    public void booleanSet(){
        if (firQ <= 4 && firQ >= 0) {
            firQues+=4;

        }
        else if (firQ >= 5 && firQ <= 7) {
            firQues+=2;
        }


        if (secQ <= 4 && secQ >= 0) {
            secQues+=4;
        } else if (secQ >= 5 && secQ <= 7) {
            secQues+=2;
        }

        if (thirdQ <= 4 && thirdQ >= 0) {
            thrQues+=4;
        } else if (thirdQ >= 5 && thirdQ <= 7) {
            thrQues+=2;
        }

        if (fourthQ <= 4 && fourthQ >= 0) {
            frQuestion += 4;
        } else if (fourthQ >= 5 && fourthQ <= 7) {
            frQuestion += 2;
        }

        if (fifthQ <= 4 && fifthQ >= 0) {
            fivQuestion += 4;
        }
        else if (fifthQ >= 5 && fifthQ <= 7) {
           fivQuestion += 2;
        }

    }
    public void addDataSet(){
        ArrayList<PieEntry> x = new ArrayList<PieEntry>();
        ArrayList<String> ogNums = new ArrayList<String>();
        ogNums.set(0, General);
        ogNums.set(1, Happiness);
        ogNums.set(2, Sleep);
        ogNums.set(3, SocialMedia);
        ogNums.set(4, ExtraCirr);
        Log.d(TAG, "Sup were here");
       float[] names = {13, 13, 33, 33, 33};
       for(int i = 0; i < names.length; i++){
            x.add(new PieEntry(names[i], i));
       }

       PieDataSet pieDataSet = new PieDataSet(x, "Stats");
       pieDataSet.setSliceSpace(2);
       pieDataSet.setValueTextSize(12);

       ArrayList<Integer> colors = new ArrayList<>();
       colors.add(Color.BLUE);
       colors.add(Color.WHITE);
       colors.add(Color.GRAY);
       colors.add(Color.YELLOW);
       colors.add(Color.GREEN);

       pieDataSet.setColors(colors);

       Legend legend = pieChart.getLegend();
       legend.setForm(Legend.LegendForm.CIRCLE);
       legend.setPosition(Legend.LegendPosition.LEFT_OF_CHART);

       PieData pieData = new PieData(pieDataSet);
       pieChart.setData(pieData);
       pieChart.invalidate();

    }



}
