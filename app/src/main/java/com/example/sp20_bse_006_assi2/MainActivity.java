package com.example.sp20_bse_006_assi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String code = "5678";
    private TextView text_code;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_0;
    private Button button_back;
    private Button button_open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        text_code = findViewById  (R.id.text_code);
        button_1 = findViewById   (R.id.button_1);
        button_2 = findViewById   (R.id.button_2);
        button_3 = findViewById   (R.id.button_3);
        button_4 = findViewById   (R.id.button_4);
        button_5 = findViewById   (R.id.button_5);
        button_6 = findViewById   (R.id.button_6);
        button_7 = findViewById   (R.id.button_7);
        button_8 = findViewById   (R.id.button_8);
        button_9 = findViewById   (R.id.button_9);
        button_0 = findViewById   (R.id.button_0);
        button_back = findViewById (R.id.button_back);
        button_open = findViewById (R.id.button_open);
    }

    private void setText (int r)
    {
        String prevText = text_code.getText().toString();
        if(prevText.length() >= 4){
            return;
        }
        text_code.setText (prevText + r);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                setText(1);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setText(2);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                setText(3);
            }
        });
        button_4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(4);
            }
        });
        button_5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(5);
            }
        });
        button_6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(6);
            }
        });
        button_7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(7);
            }
        });
        button_8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(8);
            }
        });
        button_9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(9);
            }
        });
        button_0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                setText(0);
            }
        });
        button_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String prevText = text_code.getText().toString();
                if(prevText.length() > 0){
                    text_code.setText(prevText.substring(0, prevText.length() - 1));
                }
            }
        });
        button_open.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String prevText = text_code.getText().toString();
                if(prevText.equals(code)){
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Wrong Key", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}