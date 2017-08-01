package com.noor.myrecipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btnRecipe1,btnRecipe2,btnRecipe3,btnRecipe4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnRecipe1=(Button)findViewById(R.id.btnRecipe1);
        btnRecipe2=(Button)findViewById(R.id.btnRecipe2);
        btnRecipe3=(Button)findViewById(R.id.btnRecipe3);
        btnRecipe4=(Button)findViewById(R.id.btnRecipe4);

        btnRecipe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Recipe1Activity.class);
                startActivity(intent);
            }
        });


        btnRecipe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Recipe2Activity.class);
                startActivity(intent);
            }
        });

        btnRecipe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Recipe3Activity.class);
                startActivity(intent);
            }
        });

        btnRecipe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Recipe4Activity.class);
                startActivity(intent);
            }
        });


    }
}
