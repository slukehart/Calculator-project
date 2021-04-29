package com.example.newcalculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button clear;
    private Button clearEverything;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button sign;
    private Button decicmal;
    private Button equals;
    private TextView input;
    private double number1;
    private double number2;
    private double resultNumber;
    private int operator;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.zero));
                } else {
                    current += getResources().getString(R.string.zero);
                    input.setText(current);
                }
            }
        });

        one = findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.one))) {
                    input.setText(getResources().getString(R.string.one));
                } else {
                    current += getResources().getString(R.string.one);
                    input.setText(current);
                }
            }
        });
        two = findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.two))) {
                    input.setText(getResources().getString(R.string.two));
                } else {
                    current += getResources().getString(R.string.two);
                    input.setText(current);
                }
            }
        });

        three = findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.three))) {
                    input.setText(getResources().getString(R.string.three));
                } else {
                    current += getResources().getString(R.string.three);
                    input.setText(current);
                }
            }
        });

        four = findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.four))) {
                    input.setText(getResources().getString(R.string.four));
                } else {
                    current += getResources().getString(R.string.four);
                    input.setText(current);
                }
            }
        });

        five = findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.five))) {
                    input.setText(getResources().getString(R.string.five));
                } else {
                    current += getResources().getString(R.string.five);
                    input.setText(current);
                }
            }
        });

        six = findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.six))) {
                    input.setText(getResources().getString(R.string.six));
                } else {
                    current += getResources().getString(R.string.six);
                    input.setText(current);
                }
            }
        });

        seven = findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.seven))) {
                    input.setText(getResources().getString(R.string.seven));
                } else {
                    current += getResources().getString(R.string.zero);
                    input.setText(current);
                }
            }
        });

        eight = findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.eight))) {
                    input.setText(getResources().getString(R.string.eight));
                } else {
                    current += getResources().getString(R.string.eight);
                    input.setText(current);
                }
            }
        });

        nine = findViewById(R.id.zero);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.nine))) {
                    input.setText(getResources().getString(R.string.nine));
                } else {
                    current += getResources().getString(R.string.nine);
                    input.setText(current);
                }
            }
        });

        sign = findViewById(R.id.negativePositive);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int setSign = Integer.parseInt(input.getText().toString());
                setSign *= -1;
                input.setText(Integer.toString(setSign));
            }
        });

        decicmal = findViewById(R.id.decimal);
        decicmal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dec = input.getText().toString();
                if (!dec.contains(".")) {
                    dec += ".";
                    input.setText(dec);
                }
            }
        });

        add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(input.getText().toString());
                input.setText("");
                operator = R.string.add;

            }
        });

        subtract = findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(input.getText().toString());
                input.setText("0");
                operator = R.string.subtract;
            }
        });

        multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(input.getText().toString());
                input.setText("0");
                operator = R.string.multiply;
            }
        });

        divide = findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Double.parseDouble(input.getText().toString());
                input.setText("0");
                operator = R.string.divide;

            }
        });



        clearEverything = findViewById(R.id.clearEverything);
        clearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(getResources().getString(R.string.zero));
            }
        });

        equals = findViewById(R.id.equals);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input.getText().toString().equals("")) {
                    number2 = Float.parseFloat(input.getText().toString());
                }

                if (input == null) {
                    //do nothing
                }

                else if (input.equals("add") && number2 != 0) {
                    number1 += number2;

                    input = null;
                    number1 = 0;
                    number2 = 0;


                }

                else if (input.equals("subtract") && number2 != 0) {
                    number1 -= number2;

                    input = null;
                    number1 = 0;
                    number2 = 0;


                }


            }
        });



    }
}