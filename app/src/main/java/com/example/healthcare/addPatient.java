package com.example.healthcare;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.healthcare.ui.patients.PatientsFragment;

import java.util.ArrayList;

public class addPatient extends AppCompatActivity {
    Button canP;


    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patient);

        canP=findViewById(R.id.btnCancel);

        canP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cp=new Intent(addPatient.this,PatientsFragment.class);
                startActivity(cp);
            }
        });

        Spinner sp123=findViewById(R.id.spinner123);
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("A+");
        list.add("A-");
        list.add("B");
        list.add("B+");
        list.add("B-");
        list.add("O");
        list.add("O+");
        list.add("O-");
        list.add("AB");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp123.setAdapter(arrayAdapter);
        sp123.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String name=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),"Selected:"+name,Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }


}
