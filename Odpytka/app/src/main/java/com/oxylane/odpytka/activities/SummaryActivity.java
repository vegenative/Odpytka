package com.oxylane.odpytka.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.oxylane.odpytka.Person;
import com.oxylane.odpytka.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class SummaryActivity extends AppCompatActivity {


    int percent;
    int good;

    // dane do utworzenia pytań
    private String name, lastAnswerDate,category, userIdKey;
    private Integer maxQuestions, doneQuestions, doneQuestionsAll;
    private Float percentOfAnswers, percentOfAnswersAll;

    TextView percentText;
    TextView endText;

    Button endButton;

    //database
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        percentText = findViewById(R.id.percentText);
        endText = findViewById(R.id.endText);
        endButton = findViewById(R.id.endButton);

        Intent intent = getIntent();
        maxQuestions = intent.getIntExtra("maxQuestions",3);
        percentOfAnswersAll = intent.getFloatExtra("percentOfAnswersAll",0);
        name = intent.getStringExtra("name");
        doneQuestions = intent.getIntExtra("doneQuestions",0);
        doneQuestionsAll = intent.getIntExtra("doneQuestionAll",0);
        good = intent.getIntExtra("good",0);
        userIdKey = intent.getStringExtra("userIdKey");
        category = intent.getStringExtra("category");

        //data
        lastAnswerDate = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        // percent of answers
        percent=(good * 100) / maxQuestions;
        if(percentOfAnswersAll!=0) {
            percentOfAnswers = ((float) percent + percentOfAnswersAll) / 2;
        }
        else {
            percentOfAnswers = (float) percent;
        }

        endText.setText("Odpytka osoby "+ name +" zakończona");
        percentText.setText(percent+"%");
        doneQuestions=doneQuestionsAll+maxQuestions;

        firebaseDatabase = FirebaseDatabase.getInstance();
        reference = firebaseDatabase.getReference(category).child(userIdKey);


        reference.child("percentOfAnswers").setValue(percentOfAnswers);
        reference.child("doneQuestions").setValue(doneQuestions);
        reference.child("lastAnswerDate").setValue(lastAnswerDate);



        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),StartActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });


    }
}