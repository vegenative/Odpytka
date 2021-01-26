package com.oxylane.odpytka.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.oxylane.odpytka.Questions;
import com.oxylane.odpytka.R;

import java.util.ArrayList;

public class QuestionActivity extends AppCompatActivity {

    TextView questionText;
    int y =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        questionText = findViewById(R.id.questionText);



        Questions questionsAndAnswers = new Questions();
        ArrayList<String> questions = questionsAndAnswers.getList(y);
        questionText.setText(questions.get(0));

    }
}