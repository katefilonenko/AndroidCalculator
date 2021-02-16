package com.example.first;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;

import org.mariuszgromada.math.mxparser.Expression;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText tv1;
    EditText tv2;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button bdel;
    Button multiply;
    Button minus;
    Button plus;
    Button division;
    Button equal;
    Button point;
    Button procent;
    Button cancel;
    Button root;
    Button cos;
    Button sin;
    Button ln;
    Button lg;
    Button tan;
    Button pi;
    Button exp;
    Button open;
    Button close;
    Button power;

    String text = "";

    ArrayList<String> resultList = new ArrayList<>();
    ArrayList<String> exampleList = new ArrayList<>();

    View.OnClickListener buttonWork;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("key", text);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        text = savedInstanceState.getString("key", text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.history_id:
                Intent intentHistory = new Intent(this, HistoryActivity.class);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("resultKey", resultList);
                bundle.putStringArrayList("exampleKey", exampleList);
                intentHistory.putExtras(bundle);
                startActivity(intentHistory, bundle);
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bdel = findViewById(R.id.del);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        plus = findViewById(R.id.plus);
        division = findViewById(R.id.division);
        equal = findViewById(R.id.equal);
        point = findViewById(R.id.point);
        procent = findViewById(R.id.procent);
        cancel = findViewById(R.id.cancel);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        cos = findViewById(R.id.cos);
        sin = findViewById(R.id.sin);
        tan = findViewById(R.id.tan);
        ln = findViewById(R.id.ln);
        lg = findViewById(R.id.lg);
        root = findViewById(R.id.root);
        pi = findViewById(R.id.pi);
        exp = findViewById(R.id.exp);
        power = findViewById(R.id.power);
        open = findViewById(R.id.open);
        close = findViewById(R.id.close);


        buttonWork = new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.b0:
                        tv1.setText(text + "0");
                        text = tv1.getText().toString();
                        break;
                    case R.id.b1:
                        tv1.setText(text + "1");
                        text = tv1.getText().toString();
                        break;
                    case R.id.b2:
                        tv1.setText(text + "2");
                        text = tv1.getText().toString();
                        break;
                    case R.id.b3:
                        tv1.setText(text + "3");
                        text = tv1.getText().toString();
                        break;
                    case R.id.b4:
                        tv1.setText(text + "4");
                        text = tv1.getText().toString();
                        break;
                    case R.id.b5:
                        tv1.setText(text + "5");
                        text = tv1.getText().toString();
                        break;
                    case R.id.b6:
                        tv1.setText(text + "6");
                        text = tv1.getText().toString();
                        break;
                    case R.id.b7:
                        tv1.setText(text + "7");
                        text = tv1.getText().toString();
                        break;
                    case R.id.b8:
                        tv1.setText(text + "8");
                        text = tv1.getText().toString();
                        break;
                    case R.id.b9:
                        tv1.setText(text + "9");
                        text = tv1.getText().toString();
                        break;
                    case R.id.minus:
                        //if(tv1.getText())
                        //System.out.println(tv1.getText().toString().indexOf('-'));
                        //System.out.println(tv1.getText().toString().lastIndexOf('-'));
                        //System.out.println(tv1.getText().toString().length());
                        if((tv1.getText().toString().lastIndexOf('-')!=(tv1.getText().toString().length()-1))||tv1.getText().toString().lastIndexOf('-')==-1) {
                            if ((tv1.getText().toString().lastIndexOf('+') != (tv1.getText().toString().length() - 1))||tv1.getText().toString().lastIndexOf('-')==-1) {
                                if ((tv1.getText().toString().lastIndexOf('*') != (tv1.getText().toString().length() - 1))||tv1.getText().toString().lastIndexOf('-')==-1) {
                                    if ((tv1.getText().toString().lastIndexOf('/') != (tv1.getText().toString().length() - 1))||tv1.getText().toString().lastIndexOf('-')==-1) {
                                        if ((tv1.getText().toString().lastIndexOf('.') != (tv1.getText().toString().length() - 1))||tv1.getText().toString().lastIndexOf('-')==-1) {
                                            if ((tv1.getText().toString().lastIndexOf('%') != (tv1.getText().toString().length() - 1))||tv1.getText().toString().lastIndexOf('-')==-1) {
                                                tv1.setText(text + "-");
                                                text = tv1.getText().toString();
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        break;
                    case R.id.plus:
                        if(tv1.getText().toString().lastIndexOf('-')!=(tv1.getText().toString().length()-1)) {
                            if (tv1.getText().toString().lastIndexOf('+') != (tv1.getText().toString().length() - 1)) {
                                if (tv1.getText().toString().lastIndexOf('*') != (tv1.getText().toString().length() - 1)) {
                                    if (tv1.getText().toString().lastIndexOf('/') != (tv1.getText().toString().length() - 1)) {
                                        if (tv1.getText().toString().lastIndexOf('.') != (tv1.getText().toString().length() - 1)) {
                                            if (tv1.getText().toString().lastIndexOf('%') != (tv1.getText().toString().length() - 1)) {
                                                tv1.setText(text + "+");
                                                text = tv1.getText().toString();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case R.id.multiply:
                        if(tv1.getText().toString().lastIndexOf('-')!=(tv1.getText().toString().length()-1)) {
                            if (tv1.getText().toString().lastIndexOf('+') != (tv1.getText().toString().length() - 1)) {
                                if (tv1.getText().toString().lastIndexOf('*') != (tv1.getText().toString().length() - 1)) {
                                    if (tv1.getText().toString().lastIndexOf('/') != (tv1.getText().toString().length() - 1)) {
                                        if (tv1.getText().toString().lastIndexOf('.') != (tv1.getText().toString().length() - 1)) {
                                            if (tv1.getText().toString().lastIndexOf('%') != (tv1.getText().toString().length() - 1)) {
                                                tv1.setText(text + "*");
                                                text = tv1.getText().toString();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case R.id.division:
                        if(tv1.getText().toString().lastIndexOf('-')!=(tv1.getText().toString().length()-1)) {
                            if (tv1.getText().toString().lastIndexOf('+') != (tv1.getText().toString().length() - 1)) {
                                if (tv1.getText().toString().lastIndexOf('*') != (tv1.getText().toString().length() - 1)) {
                                    if (tv1.getText().toString().lastIndexOf('/') != (tv1.getText().toString().length() - 1)) {
                                        if (tv1.getText().toString().lastIndexOf('.') != (tv1.getText().toString().length() - 1)) {
                                            if (tv1.getText().toString().lastIndexOf('%') != (tv1.getText().toString().length() - 1)) {
                                                tv1.setText(text + "/");
                                                text = tv1.getText().toString();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case R.id.point:
                        if(tv1.getText().toString().lastIndexOf('-')!=(tv1.getText().toString().length()-1)) {
                            if (tv1.getText().toString().lastIndexOf('+') != (tv1.getText().toString().length() - 1)) {
                                if (tv1.getText().toString().lastIndexOf('*') != (tv1.getText().toString().length() - 1)) {
                                    if (tv1.getText().toString().lastIndexOf('/') != (tv1.getText().toString().length() - 1)) {
                                        if (tv1.getText().toString().lastIndexOf('.') != (tv1.getText().toString().length() - 1)) {
                                            if (tv1.getText().toString().lastIndexOf('%') != (tv1.getText().toString().length() - 1)) {
                                                tv1.setText(text + ".");
                                                text = tv1.getText().toString();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case R.id.procent:
                        if(tv1.getText().toString().lastIndexOf('-')!=(tv1.getText().toString().length()-1)) {
                            if (tv1.getText().toString().lastIndexOf('+') != (tv1.getText().toString().length() - 1)) {
                                if (tv1.getText().toString().lastIndexOf('*') != (tv1.getText().toString().length() - 1)) {
                                    if (tv1.getText().toString().lastIndexOf('/') != (tv1.getText().toString().length() - 1)) {
                                        if (tv1.getText().toString().lastIndexOf('.') != (tv1.getText().toString().length() - 1)) {
                                            if (tv1.getText().toString().lastIndexOf('%') != (tv1.getText().toString().length() - 1)) {
                                                tv1.setText(text + "%");
                                                text = tv1.getText().toString();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case R.id.cancel:
                        if(tv1.length() != 0) {
                            tv1.setText(text.substring(0, text.length() - 1));
                            text = tv1.getText().toString();
                        }
                        break;
                    case R.id.equal:
                        if(text == ""){

                        }else
                            try {
                                Expression e = new Expression(text);
                                tv2.setText(e.calculate()+"");
                                resultList.add(tv2.getText().toString());
                                exampleList.add(text);
                                break;
                            } catch (Exception ex) {
                                tv2.setText("Неверное выражение");
                                System.out.println(ex.getMessage());
                            }

                    case R.id.del:
                        tv1.setText("");
                        tv2.setText("");
                        text = tv1.getText().toString();
                        text = tv2.getText().toString();
                        break;
                    case R.id.cos:
                        tv1.setText(text + "cos(");
                        text = tv1.getText().toString();
                        break;
                    case R.id.sin:
                        tv1.setText(text + "sin(");
                        text = tv1.getText().toString();
                        break;
                    case R.id.tan:
                        tv1.setText(text + "tan(");
                        text = tv1.getText().toString();
                        break;
                    case R.id.root:
                        tv1.setText(text + "sqrt(");
                        text = tv1.getText().toString();
                        break;
                    case R.id.ln:
                        tv1.setText(text + "ln(");
                        text = tv1.getText().toString();
                        break;
                    case R.id.lg:
                        tv1.setText(text + "log10(");
                        text = tv1.getText().toString();
                        break;
                    case R.id.pi:
                        tv1.setText(text + "pi");
                        text = tv1.getText().toString();
                        break;
                    case R.id.exp:
                        tv1.setText(text + "exp(");
                        text = tv1.getText().toString();
                        break;
                    case R.id.power:
                        tv1.setText(text + "^");
                        text = tv1.getText().toString();
                        break;
                    case R.id.open:
                        tv1.setText(text + "(");
                        text = tv1.getText().toString();
                        break;
                    case R.id.close:
                        tv1.setText(text + ")");
                        text = tv1.getText().toString();
                        break;
                }

            }
        };

        b1.setOnClickListener(buttonWork);
        b2.setOnClickListener(buttonWork);
        b3.setOnClickListener(buttonWork);
        b4.setOnClickListener(buttonWork);
        b5.setOnClickListener(buttonWork);
        b6.setOnClickListener(buttonWork);
        b7.setOnClickListener(buttonWork);
        b8.setOnClickListener(buttonWork);
        b9.setOnClickListener(buttonWork);
        b0.setOnClickListener(buttonWork);
        multiply.setOnClickListener(buttonWork);
        minus.setOnClickListener(buttonWork);
        plus.setOnClickListener(buttonWork);
        division.setOnClickListener(buttonWork);
        equal.setOnClickListener(buttonWork);
        bdel.setOnClickListener(buttonWork);
        point.setOnClickListener(buttonWork);
        procent.setOnClickListener(buttonWork);
        cancel.setOnClickListener(buttonWork);



        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            cos.setOnClickListener(buttonWork);
            sin.setOnClickListener(buttonWork);
            tan.setOnClickListener(buttonWork);
            root.setOnClickListener(buttonWork);
            lg.setOnClickListener(buttonWork);
            ln.setOnClickListener(buttonWork);
            power.setOnClickListener(buttonWork);
            open.setOnClickListener(buttonWork);
            close.setOnClickListener(buttonWork);
            pi.setOnClickListener(buttonWork);
            exp.setOnClickListener(buttonWork);
        }
    }

}
