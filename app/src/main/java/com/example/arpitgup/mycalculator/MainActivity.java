package com.example.arpitgup.mycalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, eq;
    TextView view;
    int op1, op2;
    Operator operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initialize();

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    private void initialize(){

        view = (TextView) findViewById(R.id.result);
        view.setText("0");

        one = (Button) findViewById(R.id.btn_1);
        two = (Button) findViewById(R.id.btn_2);
        three = (Button) findViewById(R.id.btn_3);
        four = (Button) findViewById(R.id.btn_4);
        five = (Button) findViewById(R.id.btn_5);
        six = (Button) findViewById(R.id.btn_6);
        seven = (Button) findViewById(R.id.btn_7);
        eight = (Button) findViewById(R.id.btn_8);
        nine = (Button) findViewById(R.id.btn_9);
        zero = (Button) findViewById(R.id.btn_0);
        add = (Button) findViewById(R.id.btn_add);
        sub = (Button) findViewById(R.id.btn_sub);
        mul = (Button) findViewById(R.id.btn_mul);
        div = (Button) findViewById(R.id.btn_div);
        eq = (Button) findViewById(R.id.btn_eq);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        eq.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_0:
                view.append("0");

                break;

            case R.id.btn_1:
                view.append("1");

                break;

            case R.id.btn_2:
                view.append("2");

                break;

            case R.id.btn_3:
                view.append("3");

                break;

            case R.id.btn_4:
                view.append("4");

                break;

            case R.id.btn_5:
                view.append("5");

                break;

            case R.id.btn_6:
                view.append("6");

                break;

            case R.id.btn_7:
                view.append("7");

                break;

            case R.id.btn_8:
                view.append("8");

                break;

            case R.id.btn_9:
                view.append("9");

                break;

            case R.id.btn_add:

                operator = new Add();
                op1 = getOperand();
                view.setText("0");

                break;

            case R.id.btn_sub:

                operator = new Subtract();
                op1 = getOperand();
                view.setText("0");

                break;

            case R.id.btn_mul:

                operator = new Multiplication();
                op1 = getOperand();
                view.setText("0");

                break;

            case R.id.btn_div:

                operator = new Division();
                op1 = getOperand();
                view.setText("0");

                break;

            case R.id.btn_eq:

                op2 = getOperand();
                int result = operator.operate(op1, op2);
                view.setText(String.valueOf(result));

                break;

            case R.id.btn_dot:

                break;



        }

    }

    private int getOperand(){
        return Integer.parseInt(view.getText().toString());
    }
}
