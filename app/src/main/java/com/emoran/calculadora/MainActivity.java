package com.emoran.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    double numeroUno;
    double numeroDos;
    double resultado;
    String operador;




    public TextView txtResultado;
    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btnSumar;
    public Button btnRestar;
    public Button btnMultiplicar;
    public Button btnDividir;
    public Button btnIgual;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtResultado = (TextView) findViewById(R.id.resultado);
        btn0=(Button)findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btnSumar = (Button) findViewById(R.id.buttonPlus);
        btnRestar = (Button) findViewById(R.id.buttonRestar);
        btnMultiplicar = (Button) findViewById(R.id.buttonMultiplicar);
        btnDividir = (Button) findViewById(R.id.idbarra);
        btnIgual=(Button)findViewById(R.id.buttonIgual);





        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "1");
            }


        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "2");
            }


        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "3");
            }


        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "4");
            }


        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "5");
            }


        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "6");
            }


        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "7");
            }


        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "8");
            }


        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "9");
            }


        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                txtResultado.setText(txtResultado.getText() + "0");
            }


        });


        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               numeroUno=Double.parseDouble(txtResultado.getText().toString());
               operador="+";
               txtResultado.setText("");



            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroUno=Double.parseDouble(txtResultado.getText().toString());
                operador="-";
                txtResultado.setText("");



            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroUno=Double.parseDouble(txtResultado.getText().toString());
                operador="*";
                txtResultado.setText("");



            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroUno=Double.parseDouble(txtResultado.getText().toString());
                operador="/";
                txtResultado.setText("");



            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numeroDos=Double.parseDouble(txtResultado.getText().toString());
                if (operador.equals("+")){
                    resultado=numeroUno+numeroDos;
                }


                else if (operador.equals("-")){
                    numeroDos=Double.parseDouble(txtResultado.getText().toString());
                    resultado=numeroUno-numeroDos;
                }

                else if (operador.equals("*")){
                    numeroDos=Double.parseDouble(txtResultado.getText().toString());
                    resultado=numeroUno*numeroDos;
                }
                else if (operador.equals("/")){
                    numeroDos=Double.parseDouble(txtResultado.getText().toString());
                    resultado=numeroUno/numeroDos;

                }
                txtResultado.setText(resultado+"");

            }
        });









    }


}