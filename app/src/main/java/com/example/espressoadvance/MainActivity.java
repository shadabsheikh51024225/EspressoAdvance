package com.example.espressoadvance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find fruit list view
        final ListView listView = (ListView) findViewById(R.id.listView);

        // Initialize fruit data
        String[] fruits = new String[]{
                "Apple",
                "Banana",
                "Cherry",
                "Dates",
                "Elderberry",
                "Fig",
                "Grapes",
                "Grapefruit",
                "Guava",
                "Jack fruit",
                "Lemon",
                "Mango",
                "Orange",
                "Papaya",
                "Pears",
                "Peaches",
                "Pineapple",
                "Plums",
                "Raspberry",
                "Strawberry",
                "Watermelon"
        };

        // Create array list of fruits
        final ArrayList<String> fruitList = new ArrayList<String>();
        for (int i = 0; i < fruits.length; ++i) {
            fruitList.add(fruits[i]);
        }

        // Create Array adapter
        final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.item, fruitList);

        // Set adapter in list view
        listView.setAdapter(adapter);
    }
    }

