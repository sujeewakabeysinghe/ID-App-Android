package com.example.idapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.n1);
        btn1=findViewById(R.id.btn1);
        tv1=findViewById(R.id.tv1);
        tv1.setVisibility(View.GONE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1=n1.getText().toString().trim();
                String dob=num1.substring(0,6);
                int gen=Integer.parseInt(Character.toString(num1.charAt(6)));
                int nat=Integer.parseInt(Character.toString(num1.charAt(10)));
                String idgen;
                String idnat;
                String view;

                if(gen<5){
                    idgen=getString(R.string.female);
                }
                else{
                    idgen=getString(R.string.male);
                }

                if(nat==0){
                    idnat=getString(R.string.visitor);
                }
                else{
                    idnat=getString(R.string.citizen);
                }

                view=getString(R.string.dob)+dob+getString(R.string.new_line)+
                        getString(R.string.nat)+idnat+getString(R.string.new_line)+
                        getString(R.string.gen)+idgen;

                tv1.setText(view);
                tv1.setVisibility(View.VISIBLE);

            }
        });

    }
}
