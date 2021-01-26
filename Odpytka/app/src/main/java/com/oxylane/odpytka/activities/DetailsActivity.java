package com.oxylane.odpytka.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.oxylane.odpytka.FirebaseLoadDone;
import com.oxylane.odpytka.Person;
import com.oxylane.odpytka.dialogs.DialogAddName;
import com.oxylane.odpytka.dialogs.DialogNumberPicker;
import com.oxylane.odpytka.R;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity implements DialogNumberPicker.numberPickerListener, FirebaseLoadDone {

    private Button openNumberPickerDialog,newPerson_btn,back_btn;
    private TextView percentageOfAnswers_tv, doneQuestions_tv,lastAnswerData_tv,details_tv;
    private LinearLayout rowDetails1, rowDetails2,rowDetails3;
    private Spinner spinnerName;

    // dane do utworzenia pytań
    public String name, lastAnswerDate;
    public Integer maxQuestions=3, doneQuestions;
    public Float percentOfAnswers;



    private List<Person> people;

    private DatabaseReference nameRef; // referencja Firebase


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //hooks
        openNumberPickerDialog = (Button) findViewById(R.id.openNumberSpinner);
        newPerson_btn = (Button) findViewById(R.id.newPerson_btn);
        back_btn = (Button) findViewById(R.id.back_btn);

        spinnerName = (Spinner) findViewById(R.id.spinnerName);

        percentageOfAnswers_tv = (TextView) findViewById(R.id.percentData_tv);
        doneQuestions_tv = (TextView) findViewById(R.id.numberOfQuestions_tv);
        lastAnswerData_tv = (TextView) findViewById(R.id.lastAnswerData);

        rowDetails1 = (LinearLayout) findViewById(R.id.detailsRow1_tv);
        rowDetails2 = (LinearLayout) findViewById(R.id.detailsRow2_tv);
        rowDetails3 = (LinearLayout) findViewById(R.id.detailsRow3_tv);

        details_tv = (TextView) findViewById(R.id.details_tv);

        //interface
        final FirebaseLoadDone onFirebaseLoadDone;
        onFirebaseLoadDone = this;

        //add new user button
        newPerson_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogAddName();
            }
        });

        //Spinner name
        nameRef = FirebaseDatabase.getInstance().getReference("Person");

        nameRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                List<Person> people = new ArrayList<>();
                for(DataSnapshot personSnapShot:snapshot.getChildren()){
                    people.add(personSnapShot.getValue(Person.class));
                }
                onFirebaseLoadDone.OnFirebaseLoadSuccess(people);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                onFirebaseLoadDone.OnFirebaseLoadFailed(error.getMessage());
            }

        });

        spinnerName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //pobieramy wybraną pozycje z listy
                Person person = people.get(position);


                percentOfAnswers = person.getPercentOfAnswers();
                doneQuestions = person.getNumberOfQuestions();
                lastAnswerDate = person.getLastAnswerDate();
                name = person.getName();

                if(doneQuestions == null){
                    details_tv.setText("Podana osoba jeszcze nie została odpytana");
                    rowDetails1.setVisibility(View.INVISIBLE);
                    rowDetails2.setVisibility(View.INVISIBLE);
                    rowDetails3.setVisibility(View.INVISIBLE);

                }
                else{
                    rowDetails1.setVisibility(View.VISIBLE);
                    rowDetails2.setVisibility(View.VISIBLE);
                    rowDetails3.setVisibility(View.VISIBLE);

                    details_tv.setText("Szczegóły "+ name);
                    percentageOfAnswers_tv.setText(percentOfAnswers.toString()+"%");
                    doneQuestions_tv.setText(doneQuestions.toString());
                    lastAnswerData_tv.setText(lastAnswerDate);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                details_tv.setText("Wybierz osobę, aby wyświetlić szczegóły");
                rowDetails1.setVisibility(View.INVISIBLE);
                rowDetails2.setVisibility(View.INVISIBLE);
                rowDetails3.setVisibility(View.INVISIBLE);

            }
        });


        // number picker Dialog
        openNumberPickerDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialogNumberPicker();
            }
        });

        //back
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StartActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }



    //add new person Dialog
    private void openDialogAddName() {
        DialogAddName dialogAddName = new DialogAddName();
        dialogAddName.show(getSupportFragmentManager(),"addName");
    }

    //number picker Dialog
    private void openDialogNumberPicker() {
        DialogNumberPicker dialogNumberPicker = new DialogNumberPicker();
        dialogNumberPicker.show(getSupportFragmentManager(), "numberPicker");
    }

    @Override
    public void applyText(Integer number) {

        //change button text and give maxQuestions
        openNumberPickerDialog.setText(number.toString());
        maxQuestions = number;
    }


    @Override
    public void OnFirebaseLoadSuccess(List<Person> people) {
        this.people = people;
        //get all name
        List<String> names_list = new ArrayList<>();
        for(Person person:people)
            names_list.add(person.getName());
        //adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names_list);
        spinnerName.setAdapter(adapter);

    }

    @Override
    public void OnFirebaseLoadFailed(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}