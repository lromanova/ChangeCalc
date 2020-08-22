package com.sitaara.appbarver1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, R.string.action_open, Toast.LENGTH_LONG).show();

            Intent intentNotes = new Intent(MainActivity.this, NoteActivity.class);
            startActivity(intentNotes);

            return true;
        }
        if (id == R.id.action_finish) {
            finish();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}