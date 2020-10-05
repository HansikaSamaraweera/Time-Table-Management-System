package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class EditMedicine extends AppCompatActivity {
    Spinner spin;
        Button edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_medicine);
        edit = findViewById(R.id.editsave);
        spin = findViewById(R.id.spinner2);

        ArrayList<String> list = new ArrayList<>();
        list.add("Milliliters");
        list.add("Tablets");
        list.add("Spoons");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(arrayAdapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

    @Override
    protected void onResume() {
        super.onResume();

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EditMedicine.this,MedicineActivity.class);
                startActivity(i);
            }
        });
    }
}