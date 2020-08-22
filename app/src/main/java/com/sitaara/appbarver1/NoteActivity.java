package com.sitaara.appbarver1;

import androidx.appcompat.app.AppCompatActivity;


import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class NoteActivity extends AppCompatActivity {
    private Button btnSave;
    private EditText txtNote;
    private SharedPreferences sharedPref;
    private static String NOTE_TEXT = "note_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        initViews();

        getDateFromSharedPref();
    }

    private void initViews() {
        txtNote = findViewById(R.id.txtNote);
        btnSave = findViewById(R.id.btnSave);
        sharedPref = getSharedPreferences("MyNote", MODE_PRIVATE);



        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor myEditor = sharedPref.edit();
                String noteTxt = txtNote.getText().toString();
                myEditor.putString(NOTE_TEXT, noteTxt);
                myEditor.apply();
                Toast.makeText(NoteActivity.this, R.string.toast_message, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void getDateFromSharedPref(){
        String noteText = sharedPref.getString(NOTE_TEXT, "");
        txtNote.setText(noteText);
    }
}