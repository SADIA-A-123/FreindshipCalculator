package com.example.freind;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity2 extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Randomnumber();

    }

    private void Randomnumber() {
        button=(Button) findViewById(R.id.btn);
        textView=(TextView) findViewById(R.id.text);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(editText.getText()))
                {
                    editText.setError("enter name");
                    editText.requestFocus();
                }
                else if (TextUtils.isEmpty(editText2.getText()))
                {
                    editText2.setError("enter name");
                    editText2.requestFocus();
                }

                else {


                    String name = editText.getText().toString();
                    String friend = editText2.getText().toString();

                    Random rnd = new Random();

                    int val = rnd.nextInt(100 - 1) + 1;
                    textView.setText(Integer.toString(val)+"%");

                }

            }




        });

    }
}
