package com.example.poorva.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore=0;
    int teamBScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View view){
        teamAScore=0;
        teamBScore=0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void plusThree(View view)
    {   teamAScore+=3;
        displayForTeamA(teamAScore);
    }
    public void plusTwo(View view)
    {
        teamAScore+=2;
        displayForTeamA(teamAScore);
    }
    public void plusOne(View view)
    {
        teamAScore++;
        displayForTeamA(teamAScore);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void plusThreeB(View view)
    {   teamBScore+=3;
        displayForTeamB(teamBScore);
    }
    public void plusTwoB(View view)
    {
        teamBScore+=2;
        displayForTeamB(teamBScore);
    }
    public void plusOneB(View view)
    {
        teamBScore++;
        displayForTeamB(teamBScore);
    }
}
