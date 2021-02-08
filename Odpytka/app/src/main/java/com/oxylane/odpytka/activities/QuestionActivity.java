package com.oxylane.odpytka.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    int doneQuestions;
    int licz=1;
    int numberOfGood = 0;
    List<Integer> goodOrBadList;
    String category;
    QuestionsManager questionsAndAnswersM = null;
    Questions questionsAndAnswers = null;
    ArrayList<String> questions;


    // dane do utworzenia pytań
    private String name, lastAnswerDate, userIdKey;

    private Float percentOfAnswers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        maxQuestionsText = findViewById(R.id.numberOfHowManyText);
        questionText = findViewById(R.id.questionText);
        answerText = findViewById(R.id.answerText);
        goodButton = findViewById(R.id.goodButton);
        badButton = findViewById(R.id.badButton);
        backButton = findViewById(R.id.backButton);
        goodOrBadList = new ArrayList<Integer>();


        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        doneQuestions = intent.getIntExtra("doneQuestions",0);
        userIdKey = intent.getStringExtra("userIdKey");

        //get number of questions
        Intent previousIntent = getIntent();
        maxQuestions = previousIntent.getIntExtra("maxQuestions",3);
        category = previousIntent.getStringExtra("category");



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



                if(licz== maxQuestions){
                    goodOrBadList.add(1);
                    Intent intent = new Intent (getApplicationContext(),SummaryActivity.class);
                    intent.putExtra("category",category);
                    intent.putExtra("maxQuestions",maxQuestions);
                    intent.putExtra("doneQuestions",doneQuestions);
                    intent.putExtra("percentOfAnswers",percentOfAnswers);
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
                if(licz== maxQuestions){
                    goodOrBadList.add(0);
                    Intent intent = new Intent (getApplicationContext(),SummaryActivity.class);
                    intent.putExtra("category",category);
                    intent.putExtra("maxQuestions",maxQuestions);
                    intent.putExtra("doneQuestions",doneQuestions);
                    intent.putExtra("percentOfAnswers",percentOfAnswers);
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

        backButton.setOnClickListener(new View.OnClickListener() {
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




    }
    public void setQuestion (ArrayList<String> questions, int numberOfQuestion){
        questionText.setText(questions.get(numberOfQuestion));
        answerText.setText(questions.get(numberOfQuestion+1));
        maxQuestionsText.setText(licz +"/"+ maxQuestions);
    }
}