package com.example.samplelogin_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class splash_screen extends AppCompatActivity {
    TextView signup;
    Button login;
    TextView emailtext,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_spash_screen);
        signup=(TextView) findViewById(R.id.signup_loginpage);
        emailtext=(TextView) findViewById(R.id.Enter_ur_name_email);
        Password=(TextView) findViewById(R.id.Password_login);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(splash_screen.this,Signup.class);
                startActivity(intent);
            }
        });
        login=(Button) findViewById(R.id.login_loginpage);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (emailtext.getText().length()>0 && Password.getText().length()>0 )
                {

                    Toast.makeText(getApplicationContext(),"Loading...", Toast.LENGTH_SHORT).show();
                 Intent intent=new Intent(splash_screen.this,Home_page.class);
                startActivity(intent);

                }
               else {
                    String toastMessage = "Username or Password are not populated";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}