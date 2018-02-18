package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int visitorsScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
      * Home Team Scored
     */

    public void scoredTouchdownHome(View view) {
        homeScore += 6;
        updateHomeScore(homeScore);
    }

    public void scoredExtraPointHome(View view) {
        homeScore += 1;
        updateHomeScore(homeScore);
    }

    public void scoredTwoPointHome(View view) {
        homeScore += 2;
        updateHomeScore(homeScore);
    }

    public void scoredFieldGoalHome(View view) {
        homeScore += 3;
        updateHomeScore(homeScore);
    }


    /**
     * Visitors Team Scored
     */
    public void scoredTouchdownVisitors(View view) {
        visitorsScore += 6;
        updateVisitorsScore(visitorsScore);
    }

    public void scoredExtraPointVisitors(View view) {
        visitorsScore += 1;
        updateVisitorsScore(visitorsScore);
    }

    public void scoredTwoPointVisitors(View view) {
        visitorsScore += 2;
        updateVisitorsScore(visitorsScore);
    }

    public void scoredFieldGoalVisitors(View view) {
        visitorsScore += 3;
        updateVisitorsScore(visitorsScore);
    }


    /**
     * Update Score
     */
    public void updateHomeScore(int updatedScore) {
        TextView score = (TextView) findViewById(R.id.home_score);
        score.setText(String.valueOf(updatedScore));
    }

    public void updateVisitorsScore(int updatedScore) {
        TextView score = (TextView) findViewById(R.id.visitors_score);
        score.setText(String.valueOf(updatedScore));
    }


    /**
     * Reset Scores
     */
    public void resetScores(View view) {
        homeScore = 0;
        visitorsScore = 0;

        updateHomeScore(homeScore);
        updateVisitorsScore(visitorsScore);
    }
}
