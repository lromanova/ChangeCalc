package com.sitaara.appbarver1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class FrameCalc extends AppCompatActivity {
    private Button btnTurn;
    private FrameLayout flEngineer;
    private FrameLayout flCommon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_calc);
        InitViews();
    }

    private void InitViews() {
        flEngineer = findViewById(R.id.flEngineer);
        flCommon = findViewById(R.id.flCommon);

        flEngineer.setVisibility(View.GONE);
        flCommon.setVisibility(View.VISIBLE);

        btnTurn = findViewById(R.id.btnTurn);
        btnTurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flEngineer.getVisibility() == View.VISIBLE) {
                    flEngineer.setVisibility(View.GONE);
                    flCommon.setVisibility(View.VISIBLE);

                } else {
                    flEngineer.setVisibility(View.VISIBLE);
                    flCommon.setVisibility(View.GONE);

                }
            }
        });


    }

}