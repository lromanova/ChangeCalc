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
        Intent intentNotes;
        int id = item.getItemId();

        switch (id){
            case  R.id.action_open_notes:
                intentNotes = new Intent(MainActivity.this, NoteActivity.class);
                startActivity(intentNotes);
                break;
            case R.id.action_calculator:
                intentNotes = new Intent(MainActivity.this, RelativeCalc.class);
                startActivity(intentNotes);
                break;
            case R.id.action_finish:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}