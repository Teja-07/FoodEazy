package com.example.samplelogin_page;

import static com.example.samplelogin_page.R.layout.activity_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] bankNames={"Gender","Male","Female"};
    Button login;
    TextView firstname,lastname,email,password,reconfirm_password,dob;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_signup);
        getSupportActionBar().hide();
        Spinner spin = (Spinner) findViewById(R.id.Spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bankNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        firstname=(TextView) findViewById(R.id.firstname_signup);
        lastname=(TextView) findViewById(R.id.lastname_signup); 
        email=(TextView) findViewById(R.id.Editmail_signup);
        password=(TextView) findViewById(R.id.Passwordlogin_singup);
        reconfirm_password=(TextView) findViewById(R.id.Reenterpassword_signup);
        dob=(TextView) findViewById(R.id.edittextDob_signup);
        login=findViewById(R.id.login_signpage);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (firstname.getText().length()>0 && lastname.getText().length()>0 && email.getText().length()>0 && password.getText().length()>0 &&
                        reconfirm_password.getText().length()>0 && dob.getText().length()>0)
                {
                    Toast.makeText(getApplicationContext(), "Loading..", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(Signup.this,Home_page.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "One-field is pending", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
        
    }
    
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
//        Toast.makeText(getApplicationContext(), bankNames[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {


    }
}