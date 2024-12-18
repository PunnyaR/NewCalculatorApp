package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {
    EditText et3,et4;
    Button bu3,bu4;
    String getNum1,getNum2,result;
    int num1,num2,diff;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        et3=(EditText) findViewById(R.id.n1);
        et4=(EditText) findViewById(R.id.n2);
        bu3=(Button) findViewById(R.id.subo);
        bu4=(Button) findViewById(R.id.bmenu);
        tv=(TextView) findViewById(R.id.pr);
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et3.getText().toString();
                getNum2=et4.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                diff=num1-num2;
                result=String.valueOf(diff);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob4=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob4);
            }
        });

    }
}