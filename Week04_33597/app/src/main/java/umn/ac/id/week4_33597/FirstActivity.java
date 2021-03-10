package umn.ac.id.week4_33597;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class FirstActivity extends AppCompatActivity {

    private Button btnHal1, btnHal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);




        btnHal1.setOnClickListener((v) -> {
            startActivity(new Intent(FirstActivity.this, SecondActivity.class));
        });

        btnHal2.setOnClickListener((v) -> {
            startActivity(new Intent(FirstActivity.this, ThirdActivity.class));

        });


    }
}