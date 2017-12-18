package com.example.suhanshu.malariasympton;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button caus,compli,diag,outloo,prevent,symp,treat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar ab=getSupportActionBar();
        ab.setLogo(R.mipmap.ic_launcher3);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayShowHomeEnabled(true);
        caus=(Button)findViewById(R.id.causes);
        compli=(Button)findViewById(R.id.complication);
        diag=(Button)findViewById(R.id.diagnosis);
        outloo=(Button)findViewById(R.id.outlook);
        prevent=(Button)findViewById(R.id.prevention);
        symp=(Button)findViewById(R.id.symptom);
        treat=(Button)findViewById(R.id.treatment);
        caus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Causes.class);
                startActivity(intent);
            }
        });
        compli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Complication.class);
                startActivity(intent);
            }
        });
        diag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,diagnosis.class);
                startActivity(intent);
            }
        });
        outloo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Outlook.class);
                startActivity(intent);
            }
        });
        prevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Prevention.class);
                startActivity(intent);
            }
        });
        symp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Symptoms.class);
                startActivity(intent);
            }
        });
        treat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,treatment.class);
                startActivity(intent);
            }
        });
    }
}
