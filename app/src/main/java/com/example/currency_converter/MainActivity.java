package com.example.currency_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro, pond, dollar, yen, diar, bitcoin, rubel, ausdollar, candollar;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pond = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen=findViewById(R.id.yen);
        diar=findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel=findViewById(R.id.rubel);
        ausdollar=findViewById(R.id.ausdollar);
        candollar=findViewById(R.id.candollar);
        //TODO:

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);



        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.012;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 82;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 1.66;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });
        diar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.0037;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.000000545;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.92;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.018;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();

                if (TextUtils.isEmpty(z)){
                    editText.setError("empty user input");
                }else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.0166;
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

                    //textView.setText("" + k);
                }
            }
        });





    }
}