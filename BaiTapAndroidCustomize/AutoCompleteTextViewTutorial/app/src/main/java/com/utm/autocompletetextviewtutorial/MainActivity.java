package com.utm.autocompletetextviewtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        String[] countries = getResources().getStringArray(R.array.countries);
        CountryAdapter countryAdapter = new CountryAdapter(this, R.layout.layout_custom, getListCountries());
        autoCompleteTextView.setAdapter(countryAdapter);

    }


    private List<Country> getListCountries() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("Tajikistan"));
        list.add(new Country("Tanzania"));
        list.add(new Country("Texas"));
        list.add(new Country("Thailand"));
        list.add(new Country("Leste"));

        return list;
    }
}