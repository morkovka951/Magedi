package com.example.i5.magedi;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        textView3 = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();
        String phone = intent.getStringExtra("phone");
        textView3.setText(phone);
    }
}
