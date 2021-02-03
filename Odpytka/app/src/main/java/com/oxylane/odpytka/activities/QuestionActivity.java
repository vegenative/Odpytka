package com.oxylane.odpytka.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.oxylane.odpytka.Questions;
import com.oxylane.odpytka.R;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    TextView questionText;
    TextView answerText;
    TextView numberOfHowManyText;
    Button goodButton;
    Button badButton;
    Button backButton;
    int numberOfHowMany =5;
    int numberOfQuestion =0;
    int licz=1;
    int numberOfGood = 0;
    List<Integer> goodOrBadList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        numberOfHowManyText = findViewById(R.id.numberOfHowManyText);
        questionText = findViewById(R.id.questionText);
        answerText = findViewById(R.id.answerText);
        goodButton = findViewById(R.id.goodButton);
        badButton = findViewById(R.id.badButton);
        backButton = findViewById(R.id.backButton);
        goodOrBadList = new ArrayList<Integer>();

        Questions questionsAndAnswers = new Questions();
      final  ArrayList<String> questions = questionsAndAnswers.getList(numberOfHowMany);
        questionText.setText(questions.get(numberOfQuestion));
        setQuestion(questions,numberOfQuestion);

        goodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licz==numberOfHowMany){
                    goodOrBadList.add(1);
                    Intent intent = new Intent (getApplicationContext(),SummaryActivity.class);

                    for (Integer x: goodOrBadList) {
                        if(x==1){
                            numberOfGood+=1;
                        }
                    }
                    
                    
                    intent.putExtra("good",numberOfGood);
                    intent.putExtra("howMany", numberOfHowMany);
                    startActivity(intent);
                }else {
                    numberOfQuestion += 2;
                    licz += 1;


                    goodOrBadList.add(1);

                    setQuestion(questions, numberOfQuestion);
                }
            }
        });

        badButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licz==numberOfHowMany){
                    goodOrBadList.add(0);
                    Intent intent = new Intent (getApplicationContext(),SummaryActivity.class);

                    for (Integer x: goodOrBadList) {
                        if(x==1){
                            numberOfGood+=1;
                        }
                    }


                    intent.putExtra("good",numberOfGood);
                    intent.putExtra("howMany", numberOfHowMany);
                    startActivity(intent);
                }else {
                    numberOfQuestion += 2;
                    licz += 1;
                    goodOrBadList.add(0);
                    setQuestion(questions, numberOfQuestion);
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licz==1){
                    Intent intent = new Intent (getApplicationContext(),DetailsActivity.class);
                    startActivity(intent);
                }else {
                    licz-=1;
                    numberOfQuestion-=2;
                    goodOrBadList.remove(goodOrBadList.size()-1);
                    setQuestion(questions,numberOfQuestion);
                }

            }
        });




    }
    public void setQuestion (ArrayList<String> questions, int numberOfQuestion){
        questionText.setText(questions.get(numberOfQuestion));
        answerText.setText(questions.get(numberOfQuestion+1));
        numberOfHowManyText.setText(licz +"/"+ numberOfHowMany);
    }
}