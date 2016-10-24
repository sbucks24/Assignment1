package com.assignment1.a100517424.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int answeredQuestion;
    public int yeses, nos;
    public int answerOfQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answeredQuestion = 0;
        yeses = 0;
        nos = 0;

        main();
    }

    public void AskQuestion(View view)
    {
        Intent intent = new Intent(this, AnswerQuestion.class);
        intent.putExtra("currentQuestion", answeredQuestion);
        startActivityForResult(intent, answerOfQuestion);
    }

    protected void onActivityResult(int answerOfQuestion, int result, Intent data)
    {
        if (result == 0)
            nos++;
        else if (result == 1)
                    yeses++;

        answeredQuestion++;

        main();
    }

    public void main()
    {
        TextView numOfAns = (TextView)findViewById(R.id.numOfAnswers);
        String outputString1 = getResources().getString(R.string.numberOfAnswers);
        String outputString2 = getResources().getString(R.string.numberOfAnswers2);
        numOfAns.setText(outputString1 + answeredQuestion + outputString2);

        if (answeredQuestion == 5) {
            Intent summaryIntent = new Intent(this, Summary.class);
            summaryIntent.putExtra("Yeses",yeses);
            summaryIntent.putExtra("Nos", nos);
            startActivity(summaryIntent);
        }
    }

}
