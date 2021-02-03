package com.oxylane.odpytka.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.oxylane.odpytka.R;

public class SummaryActivity extends AppCompatActivity {


    int howMany;
    int percent;
    int good;
    TextView percentText;

    Button endButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        percentText = findViewById(R.id.percentText);
        endButton = findViewById(R.id.endButton);

        Intent intent = getIntent();
        howMany = intent.getIntExtra("howMany",0);
        good = intent.getIntExtra("good",0);

        percent=(good * 100) / howMany;

        percentText.setText(percent+"%");

        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),StartActivity.class);
                startActivity(intent);
            }
        });


    }
}