package com.oxylane.odpytka.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;

import com.oxylane.odpytka.DialogNumberPicker;
import com.oxylane.odpytka.R;

public class DetailsActivity extends AppCompatActivity implements DialogNumberPicker.numberPickerListener{

    private Button openNumberPickerDialog;
    private Integer maxQuestions=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        openNumberPickerDialog = (Button) findViewById(R.id.openNumberSpinner);

        openNumberPickerDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });


    }

    //numberPicker Dialog
    private void openDialog() {
        DialogNumberPicker dialogNumberPicker = new DialogNumberPicker();
        dialogNumberPicker.show(getSupportFragmentManager(), "numberPicker");
    }

    @Override
    public void applyText(Integer number) {

        //change button text and give maxQuestions
        openNumberPickerDialog.setText(number.toString());
        maxQuestions = number;
    }
}