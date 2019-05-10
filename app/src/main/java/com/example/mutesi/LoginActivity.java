package com.example.mutesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {
     EditText Title;
      EditText Description;
      LinearLayout Logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
        Title=(EditText)findViewById(R.id.title1);
        Description=(EditText)findViewById(R.id.description1);
        Logo=(LinearLayout)findViewById(R.id.logo1);
    }
}
