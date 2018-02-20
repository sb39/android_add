package com.example.admin_srijeet.my_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumber;
        final EditText secondNumber;
        Button b;



        firstNumber = (EditText)findViewById(R.id.a);
        secondNumber = (EditText)findViewById(R.id.b);
        b = (Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1, num2, sum;
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                sum = num1 + num2;
                String res;
                res= String.valueOf(sum);
                Toast.makeText(getApplicationContext(), ""+res, Toast.LENGTH_LONG).show();
            }
        });

    }
}
