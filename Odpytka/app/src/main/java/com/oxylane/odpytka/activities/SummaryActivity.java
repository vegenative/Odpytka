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

import java.util.Map;

public class SummaryActivity extends AppCompatActivity {


    int percent;
    int good;

    // dane do utworzenia pytań
    private String name, lastAnswerDate,category, postId;
    private Integer maxQuestions, doneQuestions;
    private Float percentOfAnswers;

    TextView percentText;

    Button endButton;

    //database
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        percentText = findViewById(R.id.percentText);
        endButton = findViewById(R.id.endButton);

        Intent intent = getIntent();
        maxQuestions = intent.getIntExtra("maxQuestions",3);
        name = intent.getStringExtra("name");
        doneQuestions = intent.getIntExtra("doneQuestions",0);
        good = intent.getIntExtra("good",0);
        postId = intent.getStringExtra("postId");

        percent=(good * 100) / maxQuestions;

        percentText.setText(percent+"%");

        firebaseDatabase = FirebaseDatabase.getInstance();
        reference = firebaseDatabase.getReference(category).child(name);

        Person model = new Person();
        model.setLastAnswerDate(lastAnswerDate);
        model.setNumberOfQuestions(doneQuestions);
        model.setPercentOfAnswers(percentOfAnswers);




        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),StartActivity.class);
                startActivity(intent);
            }
        });


    }
}