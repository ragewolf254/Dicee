package com.ragew.code.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);

        final ImageView leftDie = findViewById(R.id.leftDie);

        final ImageView rightDie = findViewById(R.id.rightDie);

        final int[] myDiceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Random randomNumber = new Random();
                int number = randomNumber.nextInt(6);
                leftDie.setImageResource(myDiceArray[number]);
                number = randomNumber.nextInt(6);
                rightDie.setImageResource(myDiceArray[number]);
            }
        });
    }
}
