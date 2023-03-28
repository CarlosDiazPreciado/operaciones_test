package com.example.misoperaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Finobacci extends AppCompatActivity implements View.OnClickListener {
    EditText tex1;
    TextView tv2;
    Button bt1, bt2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finobacci);
        tex1 = (EditText) findViewById(R.id.txt3);
        tv2 = (TextView) findViewById(R.id.vista2);

        bt1 = (Button) findViewById(R.id.boton4);
        bt1.setOnClickListener(this);

        bt2 = (Button) findViewById(R.id.btmenu2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Devolver = new Intent(Finobacci.this, MainActivity.class);
                startActivity(Devolver);
            }
        });
    }


    @Override
    public void onClick(View view) {
        int n1, n2, n3, n4, resultado;
        n1 = Integer.parseInt(tex1.getText().toString());
        n2 = 0;
        n3 = 1;
        for (int i = 0; i < n1; i++) {
            /*System.out.println(n2);*/
            n4 = n2 + n3;
            n2 = n3;
            n3 = n4;


            tv2.setText(String.valueOf(n2));
        }
    }



    }
