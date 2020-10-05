package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healthcare.ui.home.HomeFragment;

public class MedicineActivity extends AppCompatActivity {

    Button edit,cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);
        edit = findViewById(R.id.editm);
        cancel = findViewById(R.id.cancelm);
    }

    @Override
    protected void onResume() {
        super.onResume();

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MedicineActivity.this,EditMedicine.class);
                startActivity(i);
            }
        });

//        cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MedicineActivity.this,HomeFragment.class);
//                startActivity(i);
//            }
//        });
    }
}
