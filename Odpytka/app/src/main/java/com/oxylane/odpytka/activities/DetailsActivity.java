package com.oxylane.odpytka.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.tasks.Task;
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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity implements DialogNumberPicker.numberPickerListener, FirebaseLoadDone {

    private Button openNumberPickerDialog,newPerson_btn, add_btn, next_btn;
    private TextView percentageOfAnswers_tv, doneQuestions_tv,lastAnswerData_tv,details_tv,info_tv;
    private EditText  addNewPerson_et;
    private LinearLayout rowDetails1, rowDetails2,rowDetails3;
    private Spinner spinnerName;

    // dane do utworzenia pytań
    private String name, lastAnswerDate,category, userIdKey;
    private Integer maxQuestions=3, doneQuestions;
    private Float percentOfAnswers;

    //database
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference nameRef; // referencja Firebase

    private List<Person> people;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        //hooks
        openNumberPickerDialog = (Button) findViewById(R.id.openNumberSpinner);
        newPerson_btn = (Button) findViewById(R.id.newPerson_btn);
        next_btn = (Button) findViewById(R.id.next_btn);
        add_btn = (Button) findViewById(R.id.add_btn);
        add_btn.setVisibility(View.GONE);

        spinnerName = (Spinner) findViewById(R.id.spinnerName);

        percentageOfAnswers_tv = (TextView) findViewById(R.id.percentData_tv);
        doneQuestions_tv = (TextView) findViewById(R.id.numberOfQuestions_tv);
        lastAnswerData_tv = (TextView) findViewById(R.id.lastAnswerData);
        details_tv = (TextView) findViewById(R.id.details_tv);
        info_tv = (TextView) findViewById(R.id.info_tv);


        addNewPerson_et = (EditText) findViewById(R.id.addPerson_et);

        rowDetails1 = (LinearLayout) findViewById(R.id.detailsRow1_tv);
        rowDetails2 = (LinearLayout) findViewById(R.id.detailsRow2_tv);
        rowDetails3 = (LinearLayout) findViewById(R.id.detailsRow3_tv);




        // get category from previous activity
        Intent intent = getIntent();
        category = intent.getStringExtra("category");


        //interface
        final FirebaseLoadDone onFirebaseLoadDone;
        onFirebaseLoadDone = this;

        //add new user button
        newPerson_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialogAddName();
                add_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        firebaseDatabase = FirebaseDatabase.getInstance();
                        nameRef = firebaseDatabase.getReference(category);

                        String name = addNewPerson_et.getText().toString().trim();
                        //String name = text.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");

                        if(name.isEmpty()){
                            addNewPerson_et.setError("Pole nie może być puste");
                        }
                        else{

                            DatabaseReference idKeyRef = nameRef.push();
                            userIdKey = idKeyRef.getKey();

                            //adding new Person to database
                            Person addNewPerson = new Person(name,userIdKey);
                            nameRef.child(userIdKey).setValue(addNewPerson);


                            //Toast
                            Toast.makeText(getApplicationContext(),"Pomyślnie dodano nową osobę do kategorii " + category, Toast.LENGTH_LONG).show();

                            //refresh app
                            Intent intent = getIntent();
                            finish();
                            startActivity(intent);
                        }

                    }
                });
            }
        });

        //Spinner name
        nameRef = FirebaseDatabase.getInstance().getReference(category);

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
                doneQuestions = person.getDoneQuestions();
                lastAnswerDate = person.getLastAnswerDate();
                name = person.getName();
                userIdKey = person.getUserIdKey();



                if(lastAnswerDate == null){
                    details_tv.setText("Podana osoba jeszcze nie została odpytana");
                }
                else{

                    details_tv.setText("Szczegóły "+ name);
                    percentageOfAnswers_tv.setText(percentOfAnswers.toString()+"%");
                    doneQuestions_tv.setText(doneQuestions.toString());
                    lastAnswerData_tv.setText(lastAnswerDate);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                details_tv.setText("Wybierz osobę, aby zobaczyć szczegóły");

            }
        });

        // number picker Dialog
        openNumberPickerDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialogNumberPicker();

            }
        });

        //next Activity
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                        if(name != null){
                            Intent intent = new Intent(getApplicationContext(),QuestionActivity.class);
                            intent.putExtra("category",category);
                            intent.putExtra("maxQuestions",maxQuestions);
                            intent.putExtra("doneQuestionsAll",doneQuestions);
                            intent.putExtra("percentOfAnswers",percentOfAnswers);
                            intent.putExtra("name",name);
                            intent.putExtra("userIdKey",userIdKey);

                            startActivity(intent);

                        }
                        else {
                            Toast.makeText(getApplicationContext(),"Musisz najpierw wybrać osobę do odpytki",Toast.LENGTH_LONG).show();

                            // if spinner name is gone, call on click
                            if(spinnerName.getVisibility()==View.GONE){
                                newPerson_btn.callOnClick();
                            }

                            // anim spinner
                            YoYo.with(Techniques.Shake)
                                    .duration(3000)
                                    .playOn(spinnerName);
                        }

                };
        });

    }



    //add new person
    private void openDialogAddName() {
        if(spinnerName.getVisibility()==View.VISIBLE){

            rotateAnimation(newPerson_btn,"-");
            addNewPerson_et.setVisibility(View.VISIBLE);
            add_btn.setVisibility(View.VISIBLE);
            spinnerName.setVisibility(View.GONE);

        }
        else{
            rotateAnimation(newPerson_btn,"+");
            addNewPerson_et.setVisibility(View.GONE);
            add_btn.setVisibility(View.GONE);
            spinnerName.setVisibility(View.VISIBLE);
        }
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

    //animation
    private void rotateAnimation(final Button button, final String text){

        final Animation rotateAnim = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnim.setDuration(300);

        button.startAnimation(rotateAnim);

        rotateAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                YoYo.with(Techniques.FadeInLeft)
                        .duration(1000)
                        .playOn(addNewPerson_et);
                YoYo.with(Techniques.FadeInLeft)
                        .duration(1000)
                        .playOn(add_btn);
                YoYo.with(Techniques.FadeInLeft)
                        .duration(1000)
                        .playOn(spinnerName);


            }

            @Override
            public void onAnimationEnd(Animation animation) {
                animation.setFillAfter(true);
                button.setText(text);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }


        });
    }
}