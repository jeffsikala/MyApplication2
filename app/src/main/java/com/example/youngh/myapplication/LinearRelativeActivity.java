package com.example.youngh.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.youngh.myapplication.adapter.LRListViewAdapter;

/**
 * Created by YoungH on 12/25/16.
 */

public class LinearRelativeActivity extends Activity {
    private ImageButton bt1;
    private ImageButton bt2;
    private ListView listView;

    private LRListViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_relative_layout);
        initialView();
        setListener();
    }

    private void initialView() {
        bt1 = (ImageButton)findViewById(R.id.lrl_bt1);
        listView = (ListView)findViewById(R.id.lr_list_view);

        if (mAdapter==null){
            mAdapter = new LRListViewAdapter(this);
        }
        listView.setAdapter(mAdapter);
    }

    private void setListener() {
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Button1 was clicked",Toast.LENGTH_LONG).show();
            }
        });
    }

    /** Called when the user clicks the Send button */
    public void onClick(View view) {
        // Do something in response to button
        Toast.makeText(view.getContext(),"Button2 was clicked",Toast.LENGTH_LONG).show();
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
