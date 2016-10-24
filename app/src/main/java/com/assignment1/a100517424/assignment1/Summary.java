package com.assignment1.a100517424.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Summary extends AppCompatActivity {
    int numberOfYes, numberOfNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent intent = getIntent();

        numberOfYes = intent.getIntExtra("Yeses", 0);
        numberOfNo = intent.getIntExtra("Nos", 0);


        main();
    }

    public void main()
    {
        TextView numOfYeses = (TextView)findViewById(R.id.numOfYeses);
        String outputString1 = getResources().getString(R.string.numOfYes);
        numOfYeses.setText(outputString1 + numberOfYes);

        TextView numOfNos = (TextView)findViewById(R.id.numOfNos);
        String outputString2 = getResources().getString(R.string.numOfNo);
        numOfNos.setText(outputString2 + numberOfNo);

    }
}
