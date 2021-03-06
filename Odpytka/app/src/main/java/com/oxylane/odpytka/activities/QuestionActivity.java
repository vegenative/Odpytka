package com.oxylane.odpytka.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.oxylane.odpytka.Questions;
import com.oxylane.odpytka.QuestionsManager;
import com.oxylane.odpytka.R;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    TextView questionText;
    TextView answerText;
    TextView maxQuestionsText;
    Button goodButton;
    Button badButton;
    Button backButton;
    int maxQuestions =5;
    //co to?
    int doneQuestions;
    int doneQuestionsAll;

    int licz=1;
    int numberOfGood = 0;
    List<Integer> goodOrBadList;
    String category;
    QuestionsManager questionsAndAnswersM = null;
    Questions questionsAndAnswers = null;
    ArrayList<String> questions;


    // dane do utworzenia pytań
    private String name, lastAnswerDate, userIdKey;

    private Float percentOfAnswersAll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        maxQuestionsText = findViewById(R.id.numberOfHowManyText);
        questionText = findViewById(R.id.questionText);
        answerText = findViewById(R.id.answerText);
        goodButton = findViewById(R.id.goodButton);
        badButton = findViewById(R.id.badButton);
        goodOrBadList = new ArrayList<Integer>();


        Intent intent = getIntent();

        // get data from previous Activity
        name = intent.getStringExtra("name");
        doneQuestionsAll = intent.getIntExtra("doneQuestionsAll",0);
        userIdKey = intent.getStringExtra("userIdKey");
        maxQuestions = getIntent().getIntExtra("maxQuestions",3);
        category = getIntent().getStringExtra("category");
        percentOfAnswersAll = getIntent().getFloatExtra("percentOfAnswers",0);





        if (category.equals("Dyżurny"))
        {
            questionsAndAnswersM = new QuestionsManager();
            questions = questionsAndAnswersM.getList(maxQuestions);

        }
        else
         {
            questionsAndAnswers = new Questions();
            questions = questionsAndAnswers.getList(maxQuestions);

         }



        setQuestion(questions, doneQuestions);

        goodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.Pulse)
                        .duration(500)
                        .playOn(goodButton);

                if(licz== maxQuestions){
                    goodOrBadList.add(1);
                    Intent intent = new Intent (getApplicationContext(),SummaryActivity.class);
                    intent.putExtra("category",category);
                    intent.putExtra("doneQuestions",doneQuestions);
                    intent.putExtra("doneQuestionsAll",doneQuestionsAll);
                    intent.putExtra("percentOfAnswersAll",percentOfAnswersAll);
                    intent.putExtra("name",name);
                    intent.putExtra("userIdKey",userIdKey);

                    for (Integer x: goodOrBadList) {
                        if(x==1){
                            numberOfGood+=1;
                        }
                    }
                    
                    
                    intent.putExtra("good",numberOfGood);
                    intent.putExtra("maxQuestions", maxQuestions);
                    startActivity(intent);
                }else {
                    doneQuestions += 2;
                    licz += 1;
                    goodOrBadList.add(1);
                    setQuestion(questions, doneQuestions);
                }
            }
        });

        badButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.Pulse)
                        .duration(500)
                        .playOn(badButton);

                if(licz== maxQuestions){
                    goodOrBadList.add(0);
                    Intent intent = new Intent (getApplicationContext(),SummaryActivity.class);
                    intent.putExtra("category",category);
                    intent.putExtra("doneQuestions",doneQuestions);
                    intent.putExtra("doneQuestionsAll",doneQuestionsAll);
                    intent.putExtra("percentOfAnswersAll",percentOfAnswersAll);
                    intent.putExtra("name",name);
                    intent.putExtra("userIdKey",userIdKey);

                    for (Integer x: goodOrBadList) {
                        if(x==1){
                            numberOfGood+=1;
                        }
                    }


                    intent.putExtra("good",numberOfGood);
                    intent.putExtra("maxQuestions", maxQuestions);
                    startActivity(intent);
                }else {
                    doneQuestions += 2;
                    licz += 1;
                    goodOrBadList.add(0);
                    setQuestion(questions, doneQuestions);
                }
            }
        });



        /*backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licz==1){
                    Intent intent = new Intent (getApplicationContext(),StartActivity.class);
                    startActivity(intent);
                }else {
                    licz-=1;
                    doneQuestions -=2;
                    goodOrBadList.remove(goodOrBadList.size()-1);
                    setQuestion(questions, doneQuestions);
                }

            }
        });

         */




    }
    public void setQuestion (ArrayList<String> questions, int numberOfQuestions){
        questionText.setText(questions.get(numberOfQuestions));
        answerText.setText(questions.get(numberOfQuestions+1));
        maxQuestionsText.setText(licz +"/"+ maxQuestions);
    }
}