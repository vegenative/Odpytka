package com.oxylane.odpytka.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.oxylane.odpytka.Questions;
import com.oxylane.odpytka.R;

import java.util.ArrayList;

//public class FragmentQuestion extends Fragment {
//    private TextView questionText;
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.fragment_question,container,false);
//
//        questionText = v.findViewById(R.id.questionText);
//        Questions questionsAndAnswers = new Questions();
//        ArrayList<String> questions = questionsAndAnswers.getList(numberOfHowMany);
//        questionText.setText(questions.get(numberOfQuestion));
//
//        return v;
//    }


//    public void setQuestion(int numberOfHowMany,int numberOfQuestion){
//        Questions questionsAndAnswers = new Questions();
//        ArrayList<String> questions = questionsAndAnswers.getList(numberOfHowMany);
//        questionText.setText(questions.get(numberOfQuestion));
//    }
//}
