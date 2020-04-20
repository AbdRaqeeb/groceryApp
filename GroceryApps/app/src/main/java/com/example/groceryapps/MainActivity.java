package com.example.groceryapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.groceryapps.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.groceryapps.EXTRA_NUMBER";
    public static final String EXTRA_TEXT2 = "com.example.groceryapps.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3 = "com.example.groceryapps.EXTRA_TEXT3";;
    public static final String EXTRA_NUMBER2 = "com.example.groceryapps.EXTRA_NUMBER2";
    public static final String EXTRA_NUMBER3 = "com.example.groceryapps.EXTRA_NUMBER3";
    public static final String EXTRA_NUMBER4 = "com.example.groceryapps.EXTRA_NUMBER4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  openActivity2();
            }
        });
    }
    public void openActivity2(){
        EditText editText1 = (EditText) findViewById(R.id.edit_text1);
        String text = editText1.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.edit_text3);
        String text2 = editText3.getText().toString();

        EditText editText5 = (EditText) findViewById(R.id.edit_text5);
        String text3 = editText5.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.edit_text2);
        int number = Integer.parseInt(editText2.getText().toString());

        EditText editText4 = (EditText) findViewById(R.id.edit_text4);
        int number2 = Integer.parseInt(editText4.getText().toString());

        EditText editText6 = (EditText) findViewById(R.id.edit_text6);
        int number3 = Integer.parseInt(editText6.getText().toString());

        int sum = number+number2 +number3;

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_TEXT2, text2);
        intent.putExtra(EXTRA_TEXT3, text3);
        intent.putExtra(EXTRA_NUMBER, number);
        intent.putExtra(EXTRA_NUMBER2, number2);
        intent.putExtra(EXTRA_NUMBER3, number3);
        intent.putExtra(EXTRA_NUMBER4, sum);
        startActivity(intent);
    }
}
