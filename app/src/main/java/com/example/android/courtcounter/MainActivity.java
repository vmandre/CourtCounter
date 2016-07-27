package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addTwoTeamA(View view) {
        scoreTeamA += 2;
        displayScoreA(scoreTeamA);
    }

    public void addThreeTeamA(View view) {
        scoreTeamA += 3;
        displayScoreA(scoreTeamA);
    }

    public void addOneTeamA(View view) {
        scoreTeamA += 1;
        displayScoreA(scoreTeamA);
    }

    public void displayScoreA(int point) {
        TextView v = (TextView) findViewById(R.id.team_a_score);
        v.setText(String.valueOf(point));
    }

    public void addTwoTeamB(View view) {
        scoreTeamB += 2;
        displayScoreB(scoreTeamB);
    }

    public void addThreeTeamB(View view) {
        scoreTeamB += 3;
        displayScoreB(scoreTeamB);
    }

    public void addOneTeamB(View view) {
        scoreTeamB += 1;
        displayScoreB(scoreTeamB);
    }

    public void displayScoreB(int point) {
        TextView v = (TextView) findViewById(R.id.team_b_score);
        v.setText(String.valueOf(point));
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }
}
