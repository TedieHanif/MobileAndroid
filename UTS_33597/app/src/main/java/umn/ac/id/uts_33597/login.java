package umn.ac.id.uts_33597;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    Button Login;
    EditText user, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        Login = (Button) findViewById(R.id.login);


        Login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(user.getText().toString().equals("uasmobile") &&
                        pass.getText().toString().equals("uasmobilegenap")){
                    Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_SHORT).show();
                }
                Login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        Intent i = new Intent(login.this, List_Music.class);
                        startActivity(i);
                    }
                });

            }


        });



    }



    }

