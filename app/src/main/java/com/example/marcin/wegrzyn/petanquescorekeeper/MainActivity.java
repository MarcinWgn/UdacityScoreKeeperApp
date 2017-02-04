package com.example.marcin.wegrzyn.petanquescorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int countA = 1;
    private int countB = 1;

    TextView TVscoreTeamA;
    TextView TVscoreTeamB;
    TextView TVcountA;
    TextView TVcountB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVscoreTeamA = (TextView) findViewById(R.id.scoreTeamA);
        TVscoreTeamB = (TextView) findViewById(R.id.scoreTeamB);
        TVcountA = (TextView) findViewById(R.id.countA);
        TVcountB = (TextView) findViewById(R.id.countB);
    }

    public void incrementCountA(View view){
        if(countA<6){
            countA++;
            TVcountA.setText(String.valueOf(countA));
        }
    }
    public void decrementCountA(View view){
        if(countA>1){
            countA--;
            TVcountA.setText(String.valueOf(countA));
        }
    }
    public void incrementCountB(View view){
        if(countB<6){
            countB++;
            TVcountB.setText(String.valueOf(countB));
        }
    }
    public void decrementCountB(View view){
        if(countB>1){
            countB--;
            TVcountB.setText(String.valueOf(countB));
        }
    }
    public void addPointsTeamA(View view){
        scoreTeamA = scoreTeamA + countA;
        TVscoreTeamA.setText(String.valueOf(scoreTeamA));
    }
    public void addPointsTeamB(View view){
        scoreTeamB = scoreTeamB + countB;
        TVscoreTeamB.setText(String.valueOf(scoreTeamB));
    }
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        countA = 1;
        countB = 1;
        TVcountA.setText(String.valueOf(countA));
        TVcountB.setText(String.valueOf(countB));
        TVscoreTeamA.setText(String.valueOf(scoreTeamA));
        TVscoreTeamB.setText(String.valueOf(scoreTeamB));
    }

}
