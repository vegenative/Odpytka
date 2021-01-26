package com.oxylane.odpytka.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.oxylane.odpytka.Person;
import com.oxylane.odpytka.R;

public class DialogAddName extends AppCompatDialogFragment {

    private Button newPerson_btn;
    private EditText name_et;
    private FirebaseDatabase rootNode;
    private DatabaseReference reference;




    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_add_name,null);

        newPerson_btn = (Button) view.findViewById(R.id.newPerson_btn);
        name_et = (EditText) view.findViewById(R.id.name_editText);

        // database
        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("Person");

        builder.setView(view)
                .setTitle("Wpisz imię i nazwisko osoby którą chcesz dodać")
                .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Dodaj", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //change edit text to String and upper letters
                        String name = name_et.getText().toString().trim();
                        //String name = text.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");

                        //adding new Person to database
                        Person addNewPerson = new Person(name);

                        reference.push().setValue(addNewPerson);

                    }
                });
        return builder.create();


    }



}
