package com.example.hp.sumofnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText no1,no2;
    private TextView firstno,secondno;
    private Button sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstno= (TextView) findViewById(R.id.firstno_);
        secondno= (TextView) findViewById(R.id.secondno_);
        sum= (Button) findViewById(R.id.btn);
        no1= (EditText) findViewById(R.id.no1);
        no2= (EditText) findViewById(R.id.no2);



        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int a=Integer.parseInt(no1.getText().toString());
                final int b=Integer.parseInt(no2.getText().toString());
                int c=a+b;
                Toast.makeText(MainActivity.this,"the sum is: "+(String.valueOf(c)),Toast.LENGTH_LONG).show();

            }
        });

    }
}
