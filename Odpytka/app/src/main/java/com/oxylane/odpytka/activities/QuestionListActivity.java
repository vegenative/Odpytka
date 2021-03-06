package com.oxylane.odpytka.activities;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.oxylane.odpytka.Person;
import com.oxylane.odpytka.R;

public class QuestionListActivity extends AppCompatActivity {

    private DatabaseReference ref;
    private RecyclerView dyzurny_rv, pracownik_rv;

   private FirebaseRecyclerAdapter<model, PersonViewHolder> adapter;
   private FirebaseRecyclerOptions<model> options;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_list);


        dyzurny_rv = findViewById(R.id.dyzurny_rv);
       // pracownik_rv = findViewById(R.id.pracownicy_rv);

        dyzurny_rv.setHasFixedSize(true);
        dyzurny_rv.setLayoutManager(new LinearLayoutManager(this));
        //Query
        ref = FirebaseDatabase.getInstance().getReference().child("Dyżurny");
//.orderBy
        //RecyclerOptions

        options = new FirebaseRecyclerOptions.Builder<model>()
                .setQuery(ref,model.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<model, PersonViewHolder>(options) {
            @NonNull
            @Override
            public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_single_item,parent,false);
                return new PersonViewHolder(v);
            }

            @Override
            protected void onBindViewHolder(@NonNull PersonViewHolder holder, int position, @NonNull model model) {
                holder.name_single_tv.setText(model.getName());
                holder.percent_single_tv.setText(model.getPercentOfAnswers().toString());
                holder.doneQuestion_single_tv.setText(model.getDoneQuestions());
                holder.date_single_tv.setText(model.getLastAnswerDate());
            }
        };



        adapter.startListening();
        dyzurny_rv.setAdapter(adapter);


    }

    private class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView name_single_tv, percent_single_tv, doneQuestion_single_tv, date_single_tv;
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);

            name_single_tv = itemView.findViewById(R.id.name_single_tv);
            percent_single_tv = itemView.findViewById(R.id.percent_single_tv);
            doneQuestion_single_tv = itemView.findViewById(R.id.doneQuestion_single_tv);
            date_single_tv = itemView.findViewById(R.id.date_single_tv);

        }
    }
}