package com.example.ovedent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etxUsr, etxPass;
    CheckBox chbSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxUsr = (EditText) findViewById(R.id.etxUsr);
        etxPass = (EditText) findViewById(R.id.etxPass);
        chbSession = (CheckBox) findViewById(R.id.chbSession);
    }

    // Function Login
    public void login (View view) {


    }

    // Function Register
    public void register (View view) {

    }

}