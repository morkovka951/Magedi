package com.example.i5.magedi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMain = (Button) findViewById(R.id.btnMain);
        btnMain.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }
}
