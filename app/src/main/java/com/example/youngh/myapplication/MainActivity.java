package com.example.youngh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ImageButton bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_relative_layout);
        initialView();
//        Toast.makeText(this,"onCreat",Toast.LENGTH_LONG).show();


    }

    private void initialView() {
        bt1 = (ImageButton) findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Button1 was clicked",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void newMethod(View v){
        Toast.makeText(v.getContext(),"Button2 was clicked",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, ClassTestActivity.class);
        startActivity(intent);
    }

}
