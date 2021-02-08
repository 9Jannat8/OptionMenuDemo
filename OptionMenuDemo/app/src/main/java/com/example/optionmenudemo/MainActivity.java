package com.example.optionmenudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //age akta menu directory create korte hobe..then oi directory er under a akta layout create korte hobe
    //menu_layout.xml file er kaj totokkhn device a show korbe na jotokkhn na java file a ta access kora hocce

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {// menu_layout.xml file ta k java file a anar jonno a method used hoice

        MenuInflater menuInflater = getMenuInflater();//a line ta return super. .. a line er nice hote parbe na
        menuInflater.inflate(R.menu.menu_layout, menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {// menu item er sathe listener add kora hoy a method dara

        if(item.getItemId() == R.id.settingId) {
            Toast.makeText(MainActivity.this, "Setting is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId() == R.id.shareId) {
            Toast.makeText(MainActivity.this, "Share is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId() == R.id.feedbackId) {
            Toast.makeText(MainActivity.this, "FeedBack is selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId() == R.id.aboutusId) {
            Toast.makeText(MainActivity.this, "About Us is selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}