package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.healthcare.ui.medicine.MedicineFragment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Logger;

public class AddMedicine extends AppCompatActivity {
    private static final String TAG = "AddMedicine";
    Spinner medi;
    Button save;
    EditText day;
    private DatePickerDialog.OnDateSetListener dateSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);
        medi = findViewById(R.id.spinner);
        save = findViewById(R.id.savemed);
        day =  findViewById(R.id.datemed);

        ArrayList<String> list = new ArrayList<>();
        list.add("Milliliters");
        list.add("Tablets");
        list.add("Spoons");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        medi.setAdapter(arrayAdapter);

        medi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String name=parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),"Selected:"+name,Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal =Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int dayte = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(AddMedicine.this,android.R.style.Theme_Material_Dialog_NoActionBar_MinWidth,dateSetListener,year,month,dayte);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                Log.d(TAG,"onDateSet: date: "+i+"/"+i1+"/"+i2);
                String date = i + "/" + i1 +"/" + i2;
                day.setText(date);
            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddMedicine.this, MedicineActivity.class);
                startActivity(i);
            }
        });
    }
}