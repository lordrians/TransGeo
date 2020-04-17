package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.transgeo.R;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnPlusMin, btnKoma, btnEqual, btnTambah, btnKurang, btnKali, btnBagi, btnPersen, btnKurung, btnClear;
    ImageButton ivBackspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn0 = findViewById(R.id.btn_cal_0);
        btn1 = findViewById(R.id.btn_cal_1);
        btn2 = findViewById(R.id.btn_cal_2);
        btn3 = findViewById(R.id.btn_cal_3);
        btn4 = findViewById(R.id.btn_cal_4);
        btn5 = findViewById(R.id.btn_cal_5);
        btn6 = findViewById(R.id.btn_cal_6);
        btn7 = findViewById(R.id.btn_cal_7);
        btn8 = findViewById(R.id.btn_cal_8);
        btn9 = findViewById(R.id.btn_cal_9);


        btnPlusMin = findViewById(R.id.btn_cal_plusmin);
        btnKoma = findViewById(R.id.btn_cal_koma);
        btnEqual = findViewById(R.id.btn_cal_equal);
        btnTambah = findViewById(R.id.btn_cal_perjumlahan);
        btnKurang = findViewById(R.id.btn_cal_pengurangan);
        btnKali = findViewById(R.id.btn_cal_perkalian);
        btnBagi = findViewById(R.id.btn_cal_pembagian);
        btnPersen = findViewById(R.id.btn_cal_persen);
        btnKurung = findViewById(R.id.btn_cal_kurung);
        btnClear = findViewById(R.id.btn_cal_clear);

        ivBackspace = findViewById(R.id.iv_cal_backspace);


        btn0.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_cal_0:

                break;

            case R.id.btn_cal_1:

                break;

            case R.id.btn_cal_2:

                break;

            case R.id.btn_cal_3:

                break;

            case R.id.btn_cal_4:

                break;

            case R.id.btn_cal_5 :

                break;

            case R.id.btn_cal_6:

                break;

            case R.id.btn_cal_7:

                break;

            case R.id.btn_cal_8:

                break;

            case R.id.btn_cal_9:

                break;

            case R.id.btn_cal_plusmin:

                break;

            case R.id.btn_cal_koma:

                break;

            case R.id.btn_cal_equal:

                break;

            case R.id.btn_cal_perjumlahan:

                break;

            case R.id.btn_cal_pengurangan:

                break;

            case R.id.btn_cal_pembagian:

                break;

            case R.id.btn_cal_perkalian:

                break;

            case R.id.btn_cal_persen:

                break;

            case R.id.btn_cal_kurung:

                break;

            case R.id.btn_cal_clear:

                break;

            case R.id.iv_cal_backspace:

                break;


        }

    }
}
