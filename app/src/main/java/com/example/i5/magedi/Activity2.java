package com.example.i5.magedi;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Spinner;

        import com.hbb20.CountryCodePicker;

public class Activity2 extends AppCompatActivity {

    Spinner spinner;
    EditText editText2;
    Button btnActiv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        spinner = (Spinner) findViewById(R.id.spinner);
        editText2 = (EditText) findViewById(R.id.editText2);
        btnActiv2 = (Button) findViewById(R.id.btnActiv2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

}
