package com.example.groceryapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your body here";
                String shareSub = "Your Subject here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent, "Share using"));
            }
        });

        Intent intent = getIntent();
        String text =  intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        String text2 =  intent.getStringExtra(MainActivity.EXTRA_TEXT2);
        int number2 = intent.getIntExtra(MainActivity.EXTRA_NUMBER2, 0);

        String text3 =  intent.getStringExtra(MainActivity.EXTRA_TEXT3);
        int number3 = intent.getIntExtra(MainActivity.EXTRA_NUMBER3, 0);

        int sum = intent.getIntExtra(MainActivity.EXTRA_NUMBER4, 0);


        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);

        TextView textView8 = (TextView)  findViewById(R.id.textView8);

        textView2.setText(text);
        textView3.setText("" + number);
        textView4.setText(text2);
        textView5.setText("" + number2);
        textView6.setText(text3);
        textView7.setText("" + number3);
        textView8.setText("" + sum);

    }
}
