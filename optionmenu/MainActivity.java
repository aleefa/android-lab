package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent();
        if (item.getItemId() == R.id.x2) {

            intent.setClass(this, MainActivity2.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.x1) {
            intent.setClass(this, MainActivity3.class);
            startActivity(intent);
            return true;
        } else {
            return super.onOptionsItemSelected(item);

        }
    }}
