package com.example.ovedent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ovedent.db.DbHelper;

public class MainActivity extends AppCompatActivity {

    EditText etxUsr, etxPass;
    CheckBox chbSession;
    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxUsr = (EditText) findViewById(R.id.etxUsr);
        etxPass = (EditText) findViewById(R.id.etxPass);
        chbSession = (CheckBox) findViewById(R.id.chbSession);
        btnCrear = findViewById(R.id.btnLogin);
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbHelper dbHelper = new DbHelper(MainActivity.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                if (db !=null){
                Toast.makeText(MainActivity.this, "Base de datos creada",
Toast.LENGTH_LONG).show();
    }
else
{    // Function Login
    Toast.makeText(MainActivity.this, "Base de datos error",
            Toast.LENGTH_LONG).show();
}
}
});
}
}