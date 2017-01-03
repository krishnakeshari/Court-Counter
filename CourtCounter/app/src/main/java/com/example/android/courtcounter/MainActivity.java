package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Tracks the scores for Team A & Team B
    private int scoreTeamA = 0,scoreTeamB = 0;
    private int subA = 0,subB = 0;

    /**
     * Increase the score by Three for Team A.
     */
    public void plusThreeForTeamA(View view) {
        scoreTeamA += 3;
        subA = 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score by Two for Team A.
     */
    public void plusTwoForTeamA(View view) {
        scoreTeamA += 2;
        subA = 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score by One for Team A.
     */
    public void plusOneForTeamA(View view) {
        scoreTeamA += 1;
        subA = 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Undos the score for Team A.
     */
    public void undoTeamA(View view) {
        scoreTeamA -= subA;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase the score by Three for Team B.
     */
    public void plusThreeForTeamB(View view) {
        scoreTeamB += 3;
        subB = 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score by Two for Team B.
     */
    public void plusTwoForTeamB(View view) {
        scoreTeamB += 2;
        subB = 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score by One for Team B.
     */
    public void plusOneForTeamB(View view) {
        scoreTeamB += 1;
        subB = 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Undos the score for Team B.
     */
    public void undoTeamB(View view) {
        scoreTeamB -= subB;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset All the scores.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + number);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText("" + number);
    }
}
