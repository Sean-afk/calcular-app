package com.example.firstproject;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etFirstValue,etSecondValue;
    TextView tvAns;
    Button sub,add,mul,div;
    float firstValue,secondValue,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue=findViewById(R.id.etFirstValue);
        etSecondValue=findViewById(R.id.etSecondValue);

        add=findViewById(R.id.buttonAdd);
        sub=findViewById(R.id.buttonSub);
        mul=findViewById(R.id.buttonMul);
        div=findViewById(R.id.buttonDiv);
        tvAns=findViewById(R.id.tvAns);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonAdd:
                firstValue=Float.parseFloat(etFirstValue.getText().toString());
                secondValue=Float.parseFloat(etSecondValue.getText().toString());
                ans= firstValue+secondValue;
                tvAns.setText("Answer is = " +ans);
                break;

            case R.id.buttonSub:
                firstValue=Float.parseFloat(etFirstValue.getText().toString());
                secondValue=Float.parseFloat(etSecondValue.getText().toString());
                ans= firstValue-secondValue;
                tvAns.setText("Answer is = " +ans);
                break;

            case R.id.buttonMul:
                firstValue=Float.parseFloat(etFirstValue.getText().toString());
                secondValue=Float.parseFloat(etSecondValue.getText().toString());
                ans= firstValue*secondValue;
                tvAns.setText("Answer is = " +ans);
                break;

            case R.id.buttonDiv:
                firstValue=Float.parseFloat(etFirstValue.getText().toString());
                secondValue=Float.parseFloat(etSecondValue.getText().toString());
                ans= firstValue/secondValue;
                tvAns.setText("Answer is = " +ans);
                break;

            default:
                Toast.makeText( this,"You entered Invalid value",Toast.LENGTH_SHORT).show();
                break;



        }

    }
}