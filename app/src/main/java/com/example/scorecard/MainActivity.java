package com.example.scorecard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void givepoints3(View view){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void givepoints2(View view){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void givepoints1(View view){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    public void givepoints03(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void givepoints02(View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void givepoints01(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view){
        scoreTeamA=scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
