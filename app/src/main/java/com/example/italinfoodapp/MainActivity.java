package com.example.italinfoodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pizzaButton=findViewById(R.id.button);
        Button truffleButton=findViewById(R.id.button2);
        Button polentaButton=findViewById(R.id.button3);
        Button risittoButton=findViewById(R.id.button4);
        pizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pizzaPage=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(pizzaPage);
            }
        });
        truffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent truffleRecipe=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(truffleRecipe);
            }
        });
        polentaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent polentaRecipe=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(polentaRecipe);
            }
        });
        risittoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent risttoRecipe=new Intent(MainActivity.this,MainActivity5.class);
                startActivity(risttoRecipe);

            }
        });


    }
}