package com.example.asg3calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnc,btnequal;
    Button btnsub,btndiv,btnplus,btnmult;
    EditText txtnum,txtshow;
    AlertDialog.Builder builder;

    float mValueOne, mValueTwo;

    boolean addition, subtract, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(this);

        btn0 = (Button) findViewById(R.id.btn0);
                btn1 = (Button) findViewById(R.id.btn1);
                btn2 = (Button) findViewById(R.id.btn2);
                btn3 = (Button) findViewById(R.id.btn3);
                btn4 = (Button) findViewById(R.id.btn4);
                btn5 = (Button) findViewById(R.id.btn5);
                btn6 = (Button) findViewById(R.id.btn6);
                btn7 = (Button) findViewById(R.id.btn7);
                btn8 = (Button) findViewById(R.id.btn8);
                btn9 = (Button) findViewById(R.id.btn9);
                //  button10 = (Button) findViewById(R.id.button10);
                btnplus = (Button) findViewById(R.id.btnplus);
                btnsub = (Button) findViewById(R.id.btnsub);
                btnmult = (Button) findViewById(R.id.btnmult);
                btndiv = (Button) findViewById(R.id.btndiv);
                btnc = (Button) findViewById(R.id.btnc);
                btnequal = (Button) findViewById(R.id.btnequal);
                txtnum = (EditText) findViewById(R.id.txtnum);
                 txtshow = (EditText) findViewById(R.id.txtshow);



        btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtnum.append( "1");
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtnum.append( "2");
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtnum.append( "3");
                    }
                });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtnum.append( "4");
                    }
                });

                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtnum.append( "5");
                    }
                });

                btn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtnum.append( "6");
                    }
                });

                btn7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtnum.append( "7");
                    }
                });

                btn8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtnum.append( "8");
                    }
                });

                btn9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtnum.append( "9");
                    }
                });

                btn0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       if(!txtnum.equals(""))
                        txtnum.append( "0");
                    }
                });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum.setText("");
                txtshow.setText("");

            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String str=txtnum.getText().toString();
                txtshow.append(str);
                txtnum.setText("");
                txtshow.append("+");
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=txtnum.getText().toString();
                txtshow.append(str);
                txtnum.setText("");
                txtshow.append("/");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=txtnum.getText().toString();
                txtshow.append(str);
                txtnum.setText("");
                txtshow.append("/");
            }
        });

        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=txtnum.getText().toString();
                txtshow.append(str);
                txtnum.setText("");
                txtshow.append("*");
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=txtnum.getText().toString();
                txtshow.append(str);
                txtnum.setText("");
                txtshow.append("-");
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num="";
                String operator="";
                String str=txtshow.getText().toString();
                for(char c:str.toCharArray()){
//                    System.out.println("character="+c);
                    if(Character.isDigit(c))
                         num+=c;
                    else
                        operator+=c;

                }

                if(operator.equals("+"))
                {
                    int num1=Integer.parseInt(txtnum.getText().toString());
                    int num2=Integer.parseInt(num);
                    int result=num2+num1;
                    System.out.println("Addition="+result);
                    builder.setTitle("Addition of Number : ");
                    String demo1=Integer.toString(result);
                    builder.setMessage(demo1);
                    AlertDialog alert = builder.create();
                    //Setting the title manually
                    alert.show();
                    txtnum.setText("");
                    txtshow.setText("");

                }
                else if(operator.equals("-"))
                {
                    int num1=Integer.parseInt(txtnum.getText().toString());
                    int num2=Integer.parseInt(num);
                    int result=num2-num1;
//                    System.out.println("Addition="+result);
                    builder.setTitle("Substraction of Number : ");
                    String demo1=Integer.toString(result);
                    builder.setMessage(demo1);
                    AlertDialog alert = builder.create();
                    //Setting the title manually
                    alert.show();
                    txtnum.setText("");
                    txtshow.setText("");

                }
                else if(operator.equals("/"))
                {
                    float num1=Float.parseFloat(txtnum.getText().toString());
                    float num2=Float.parseFloat(num);
                    float result=num2/num1;
//                    System.out.println("Addition="+result);
                    builder.setTitle("Division of Number : ");
                    String demo1=Float.toString(result);
                    builder.setMessage(demo1);
                    AlertDialog alert = builder.create();
                    //Setting the title manually
                    alert.show();
                    txtnum.setText("");
                    txtshow.setText("");

                }
                else
                if(operator.equals("*"))
                {
                    int num1=Integer.parseInt(txtnum.getText().toString());
                    int num2=Integer.parseInt(num);
                    int result=num2*num1;
                    builder.setTitle("Multiplication of Number : ");
                    String demo1=Integer.toString(result);
                    builder.setMessage(demo1);
                    AlertDialog alert = builder.create();
                    //Setting the title manually
                    alert.show();
                    txtnum.setText("");
                    txtshow.setText("");
                }
               else
                   {
                    builder.setTitle("Error : ");
                    String demo1="Invalid Operation...!";
                    builder.setMessage(demo1);
                    AlertDialog alert = builder.create();
                    //Setting the title manually
                    alert.show();
                    txtnum.setText("");
                    txtshow.setText("");

                }



            }
        });



    }
        }