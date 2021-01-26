package com.oxylane.odpytka.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.oxylane.odpytka.R;

public class DialogNumberPicker extends AppCompatDialogFragment {

    private Button numberOfQuestions;
    private NumberPicker numberPicker;
    private numberPickerListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_number_picker,null);

        numberOfQuestions = (Button) view.findViewById(R.id.openNumberSpinner);
        numberPicker = (NumberPicker) view.findViewById(R.id.numberPicker);

        //set question number
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(10);


        builder.setView(view)
                .setTitle("Wybierz liczbę pytań")
                .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Akceptuj", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Integer numberOfQuestions = numberPicker.getValue();
                        listener.applyText(numberOfQuestions);
                    }
                });



        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            listener = (numberPickerListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement numberPickerListener");
        }
    }

    public interface numberPickerListener{
        void applyText(Integer number);
    }
}
