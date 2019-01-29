package com.ninge07.nrlscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method for adding 4 Try points Team A
    public void addTryTeamA(View view) {

        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    //Method for adding 2 try conversion points Team A
    public void addTryConversionTeamA(View view) {

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //Method for adding 2 Penalty goal points Team A
    public void addPenaltyGoalTeamA(View view) {

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //Method for adding 1 Field goal points Team A
    public void addFieldGoalTeamA(View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    //Method for adding 4 Try points Team B
    public void addTryTeamB(View view) {

        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    //Method for adding 2 Try conversion points Team B
    public void addTryConversionTeamB(View view) {

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    //Method for adding 2 penalty point Team B
    public void addPenaltyGoalTeamB(View view) {

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    //Method for adding 1 point Team B
    public void addFieldGoalTeamB(View view) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    //Reset the score back to zero
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}