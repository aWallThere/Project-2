package com.example.android.twilightimperium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int yssarilScore = 0;
    int hacanScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Yssaril.
     */
    public void displayYssaril(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yssaril_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases score for Yssaril by one.
     */
    public void yssarilPrelim(View v) {
        yssarilScore = yssarilScore + 1;
        displayYssaril(yssarilScore);
    }

    /**
     * Increases score for Yssaril by two.
     */
    public void yssarilSecret(View v) {
        yssarilScore = yssarilScore + 2;
        displayYssaril(yssarilScore);
    }

    /**
     * Increases score for Yssaril by one..
     */
    public void yssarilTierOne(View v) {
        yssarilScore = yssarilScore + 1;
        displayYssaril(yssarilScore);
    }

    /**
     * Increases score for Yssaril by two.
     */
    public void yssarilTierTwo(View v) {
        yssarilScore = yssarilScore + 2;
        displayYssaril(yssarilScore);
    }

    /**
     * Displays the given score for Emirates of Hacan.
     */
    public void displayHacan(int score) {
        TextView scoreView = (TextView) findViewById(R.id.hacan_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases score for Hacan by one.
     */
    public void hacanPrelim(View v) {
        hacanScore = hacanScore + 1;
        displayHacan(hacanScore);
    }

    /**
     * Increases score for Hacan by two.
     */
    public void hacanSecret(View v) {
        hacanScore = hacanScore + 2;
        displayHacan(hacanScore);
    }

    /**
     * Increases score for Hacan by one.
     */
    public void hacanTierOne(View v) {
        hacanScore = hacanScore + 1;
        displayHacan(hacanScore);
    }

    /**
     * Increases score for Hacan by two.
     */
    public void hacanTierTwo(View v) {
        hacanScore = hacanScore + 2;
        displayHacan(hacanScore);
    }

    public void newGame(View v) {
        yssarilScore = 0;
        hacanScore = 0;
        displayYssaril(yssarilScore);
        displayHacan(hacanScore);
    }


}
