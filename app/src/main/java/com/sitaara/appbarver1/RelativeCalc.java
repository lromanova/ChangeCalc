package com.sitaara.appbarver1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class RelativeCalc extends AppCompatActivity {

    private TextView txtRes;
    private Button btnDot;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    private Button btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_calc);
        InitViews();
    }

    private void InitViews(){
        txtRes = findViewById(R.id.txtRes);
        btnDot = findViewById(R.id.btnDot);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btn0.setOnClickListener(CreateButtonListener());
        btn1.setOnClickListener(CreateButtonListener());
        btn2.setOnClickListener(CreateButtonListener());
        btn3.setOnClickListener(CreateButtonListener());
        btn4.setOnClickListener(CreateButtonListener());
        btn5.setOnClickListener(CreateButtonListener());
        btn6.setOnClickListener(CreateButtonListener());
        btn7.setOnClickListener(CreateButtonListener());
        btn8.setOnClickListener(CreateButtonListener());
        btn9.setOnClickListener(CreateButtonListener());
        btnDot.setOnClickListener(CreateButtonListener());

        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button)view;

                txtRes.setText("");

            }
        });

    }

    private View.OnClickListener CreateButtonListener (){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button)view;

                txtRes.setText(txtRes.getText() + btn.getText().toString());

            }
        };
    }

}