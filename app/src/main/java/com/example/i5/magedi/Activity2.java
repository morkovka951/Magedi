package com.example.i5.magedi;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Spinner;

        import com.hbb20.CountryCodePicker;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    CountryCodePicker ccp;
    EditText editText2;
    Button btnActiv2;

    String stpin;
    String numb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        editText2 = (EditText) findViewById(R.id.editText2);
        btnActiv2 = (Button) findViewById(R.id.btnActiv2);
        btnActiv2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnActiv2:
                Intent intent = new Intent(this, Activity4.class);
                startActivity(intent);
        }
    }
}
