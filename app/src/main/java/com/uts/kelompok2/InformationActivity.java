package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.uts.kelompok2.extra.MESSAGE";
    TextView username_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        username_get = findViewById(R.id.userGet);
        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        username_get.setTypeface(customFont);
        String hasil = getIntent().getStringExtra(EXTRA_MESSAGE);
        username_get.setText(hasil);
    }
}
