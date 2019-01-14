package com.example.anura.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,buttondot,
    buttonadd, buttonsub, buttonmul, buttondiv, buttonequal, buttonc;
    float firstValue, secondValue;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.edt1);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button4=findViewById(R.id.btn4);
        button5=findViewById(R.id.btn5);
        button6=findViewById(R.id.btn6);
        button7=findViewById(R.id.btn7);
        button8=findViewById(R.id.btn8);
        button9=findViewById(R.id.btn9);
        button0=findViewById(R.id.btn0);
        buttondot=findViewById(R.id.btndot);
        buttonadd=findViewById(R.id.btnadd);
        buttonsub=findViewById(R.id.btnsub);
        buttonmul=findViewById(R.id.btnmul);
        buttondiv=findViewById(R.id.btndiv);
        buttonequal=findViewById(R.id.btnequal);
        buttonc=findViewById(R.id.btnc);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else
                {
                    firstValue=Float.parseFloat(ed1.getText().toString());
                    add=true;
                    ed1.setText(null);
                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue=Float.parseFloat(ed1.getText().toString());
                sub=true;
                ed1.setText(null);
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue=Float.parseFloat(ed1.getText().toString());
                mul=true;
                ed1.setText(null);
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue=Float.parseFloat(ed1.getText().toString());
                div=true;
                ed1.setText(null);
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondValue=Float.parseFloat(ed1.getText().toString());
                if(add==true)
                {
                    ed1.setText(Float.toString(firstValue+secondValue));
                    add=false;
                }
                if(sub==true)
                {
                    ed1.setText(Float.toString(firstValue-secondValue));
                    sub=false;
                }
                if(mul==true)
                {
                    ed1.setText(Float.toString(firstValue*secondValue));
                    mul=false;
                }
                if(div==true)
                {
                    ed1.setText(Float.toString(firstValue/secondValue));
                    div=false;
                }
            }
        });
    }
}
