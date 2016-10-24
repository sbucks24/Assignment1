package com.assignment1.a100517424.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnswerQuestion extends AppCompatActivity {

    public int question = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_question);

        Intent intent = getIntent();

        question = intent.getIntExtra("currentQuestion", 0);

        main();
    }

    public void AnswerNo(View view)
    {
        Intent resultIntent = new Intent();
        setResult(0, resultIntent);
        finish();
    }

    public void AnswerYes(View view)
    {
        Intent resultIntent = new Intent();
        setResult(1, resultIntent);
        finish();
    }


    public void main()
    {
        TextView questionText = (TextView)findViewById(R.id.Question);
        String[] listOfQuestions = getResources().getStringArray(R.array.Questions);

        String outputString;

        switch(question)
        {
            case 0:
                outputString = getResources().getString(R.string.questionText);
                questionText.setText(outputString + listOfQuestions[0]);
                break;
            case 1:
                outputString = getResources().getString(R.string.questionText);
                questionText.setText(outputString + listOfQuestions[1]);
                break;
            case 2:
                outputString = getResources().getString(R.string.questionText);
                questionText.setText(outputString + listOfQuestions[2]);
                break;
            case 3:
                outputString = getResources().getString(R.string.questionText);
                questionText.setText(outputString + listOfQuestions[3]);
                break;
            case 4:
                outputString = getResources().getString(R.string.questionText);
                questionText.setText(outputString + listOfQuestions[4]);
                break;
        }
    }


}
