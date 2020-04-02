package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonClear;
    Button buttonSubmit;
    EditText editText;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonSubmit = (Button)findViewById(R.id.buttonSubmit);
        editText = (EditText) findViewById(R.id.editText);
        textView3 = (TextView) findViewById(R.id.textView3);

        /* THERE ARE 2 WAYS TO SET ACTION
         *  TO A BUTTON, THIS IS THE FIRST ONE.
        */
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                textView3.setText(getText(R.string.default_text));
            }
        });

     }

     public void confirmar(View view){
        textView3.setText(editText.getText());

     }
}
