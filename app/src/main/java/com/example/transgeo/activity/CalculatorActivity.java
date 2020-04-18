package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
//
//import org.mozilla.javascript.Context;
//import org.mozilla.javascript.Evaluator;
//import org.mozilla.javascript.Scriptable;

import com.example.transgeo.R;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnPlusMin, btnKoma, btnEqual, btnTambah, btnKurang, btnKali, btnBagi, btnPersen, btnKurung, btnClear;
    ImageButton ivBackspace;
    TextView tvInput, tvOutput;
    String proses = "";
    Boolean cekKurung = false;

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

        tvInput = findViewById(R.id.tv_cal_input);
        tvOutput = findViewById(R.id.tv_cal_output);

        ivBackspace = findViewById(R.id.iv_cal_backspace);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnKoma.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKurung.setOnClickListener(this);
        btnPersen.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnPlusMin.setOnClickListener(this);

        ivBackspace.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_cal_0:
//                if (tvOutput.getText().toString().isEmpty()){
//                    proses = tvInput.getText().toString();
//                    tvInput.setText(proses + "0");
//                } else {
//                    clearInOut();
//                    proses = tvInput.getText().toString();
//                    tvInput.setText(proses + "0");
//                }
                appendOnExpresstion("0", true);

                break;

            case R.id.btn_cal_1:
                appendOnExpresstion("1", true);
                break;

            case R.id.btn_cal_2:
                appendOnExpresstion("2", true);

                break;

            case R.id.btn_cal_3:
                appendOnExpresstion("3", true);

                break;

            case R.id.btn_cal_4:
                appendOnExpresstion("4", true);

                break;

            case R.id.btn_cal_5 :
                appendOnExpresstion("5", true);

                break;

            case R.id.btn_cal_6:
                appendOnExpresstion("6", true);

                break;

            case R.id.btn_cal_7:
                appendOnExpresstion("7", true);

                break;

            case R.id.btn_cal_8:
                appendOnExpresstion("8", true);

                break;

            case R.id.btn_cal_9:
                appendOnExpresstion("9", true);

                break;

            case R.id.btn_cal_plusmin:

                break;

            case R.id.btn_cal_koma:
                appendOnExpresstion(".", true);
                break;


            case R.id.btn_cal_perjumlahan:
                appendOnExpresstion("+", false);
                break;

            case R.id.btn_cal_pengurangan:
                appendOnExpresstion("-", false);
                break;

            case R.id.btn_cal_pembagian:
                appendOnExpresstion("/", false);
                break;

            case R.id.btn_cal_perkalian:
                appendOnExpresstion("*", false);
                break;

            case R.id.btn_cal_persen:
                appendOnExpresstion("/100", false);
                break;

            case R.id.btn_cal_kurung:
                if (cekKurung){
//                    proses = tvInput.getText().toString();
//                    tvInput.setText(proses + ")");
                    appendOnExpresstion(")", false);
                    cekKurung = false;
                } else {
//                    proses = tvInput.getText().toString();
//                    tvInput.setText(proses + "(");
                    appendOnExpresstion("(", false);

                    cekKurung = true;
                }

                break;

            case R.id.btn_cal_clear:
                clearInOut();
                break;

            case R.id.iv_cal_backspace:
                proses = tvInput.getText().toString();
                if (!proses.isEmpty()){
                    tvInput.setText(proses.substring(0,proses.length()-1));
                } else {
                    tvInput.setText("");
                }
                break;

                case R.id.btn_cal_equal:
                    try {
                        Expression expressionBuilder = new ExpressionBuilder(tvInput.getText().toString()).build();
                        Long hasilLong ;
                        double result = expressionBuilder.evaluate();
                        hasilLong = (new Double(result).longValue());
                        if (result == hasilLong.doubleValue()){
                            tvOutput.setText(hasilLong.toString());
                        } else {
                            tvOutput.setText(String.valueOf(result));
                        }
                    } catch (Exception e){
                        Toast.makeText(getApplicationContext(), e.getMessage().toString(), Toast.LENGTH_SHORT).show();
                    }



//            case R.id.btn_cal_equal:
//                proses = tvInput.getText().toString();
//
//                proses = proses.replaceAll("x", "*");
//                proses = proses.replaceAll("%", "/100");
//
//                Context rhino = Context.enter();
//
//                rhino.setOptimizationLevel(-1);
//
//                String finalResult = "";
//
//                try {
//                    Scriptable scriptable = rhino.initStandardObjects();
//                    finalResult = rhino.evaluateString(scriptable, proses, "javascript", 1, null).toString();
//                }catch (Exception e){
//                    finalResult = "0";
//                }
//                tvOutput.setText(finalResult);
//
//                break;


        }

    }

    private void appendOnExpresstion(String string, Boolean canClear) {
        tvOutput = findViewById(R.id.tv_cal_output);
        tvInput = findViewById(R.id.tv_cal_input);

        if (!tvOutput.getText().equals("")){
            tvInput.setText("");
        }

        if (canClear){
            tvOutput.setText("");
            tvInput.append(string);
        } else {
            tvInput.append(tvOutput.getText());
            tvInput.append(string);
            tvOutput.setText("");
        }
    }

    private void clearInOut() {
        tvOutput.setText("");
        tvInput.setText("");
    }
}
