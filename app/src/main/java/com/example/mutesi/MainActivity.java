package com.example.mutesi;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText Name;
     EditText Password;
     Button Login;
     Button Register;
     ImageView image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.username);
        Password=(EditText)findViewById(R.id.password);
        Login=(Button)findViewById(R.id.buttonlogin);
        Register=(Button)findViewById(R.id.buttonregister);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String User = Name.getText().toString();
                String Pass = Password.getText().toString();
                if (User.equals("") && Pass.equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter your username and password", Toast.LENGTH_LONG).show();
                } else if (User.equals("Mutesi") && Pass.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
            else

            {
                Toast.makeText(getApplicationContext(), "invalid username or password", Toast.LENGTH_LONG).show();

            }
        }
        });
       Register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
               startActivity(intent);

           }});
       }

    }


