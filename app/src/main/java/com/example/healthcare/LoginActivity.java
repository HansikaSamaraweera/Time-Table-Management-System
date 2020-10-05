package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button signin;
    private Button login;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText)findViewById(R.id.userNameEditText);
        password = (EditText)findViewById(R.id.editTextTextPassword);
        info = (TextView)findViewById(R.id.textViewInfo);
        login = (Button)findViewById(R.id.button_login);
        signin = (Button)findViewById(R.id.SignInbutton);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validate(username.getText().toString(), password.getText().toString());
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });



    }

    private void Validate(String Username, String Password){
        if( Username.equals("1") ){
            if(Password.equals("1")) {
                Intent intent = new Intent(LoginActivity.this, navActivity.class);
                startActivity(intent);
            }
        }
        else{

        }
    }
}
