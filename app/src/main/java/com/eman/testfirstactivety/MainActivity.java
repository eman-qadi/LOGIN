package com.eman.testfirstactivety;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText adtName;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adtName = findViewById(R.id.edtName);
        password = findViewById(R.id.edtPassword);
    }

    public void btnsubmitOnClick(View view) {
        String name = adtName.getText().toString();
        String pass=password.getText().toString();
        String mass = "name : "+name+",password :"+pass;
        Toast.makeText(this,mass,Toast.LENGTH_SHORT).show(); //her to show masige
    }
}