package com.example.i5.magedi;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import com.hbb20.CountryCodePicker;

public class Activity2 extends AppCompatActivity {

    CountryCodePicker ccp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        int e = ccp.getSelectedCountryCodeAsInt();

    }

}
