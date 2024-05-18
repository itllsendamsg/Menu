package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textViewOne = (TextView) findViewById(R.id.menu_item_1);
        Log.i("MainActivity.java", "textViewOne Log : Finds first menu item TextView and prints the text to the logs");

        // Find second menu item TextView and print the text to the logs
        TextView textViewTwo = (TextView) findViewById(R.id.menu_item_2);
        Log.i("MainActivity.java", "textViewTwo Log : Finds second menu item TextView and prints the text to the logs");

        // Find third menu item TextView and print the text to the logs
        TextView textViewThree = (TextView) findViewById(R.id.menu_item_3);
        Log.i("MainActivity.java", "textViewThree Log : Finds third menu item TextView and prints the text to the logs");
    }
}