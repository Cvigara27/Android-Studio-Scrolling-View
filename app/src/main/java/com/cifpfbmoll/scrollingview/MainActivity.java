package com.cifpfbmoll.scrollingview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void editText(View v){
        View article = findViewById(R.id.article);
        article.setVisibility(View.GONE);

        View edit = findViewById(R.id.article_edit);
        edit.setVisibility(View.VISIBLE);

        View edit_button = findViewById(R.id.edit_button);
        edit_button.setVisibility(View.GONE);

        View change_button = findViewById(R.id.change_button);
        change_button.setVisibility(View.VISIBLE);
    }

    public void changeText(View v){
        TextView article =(TextView) findViewById(R.id.article);
        article.setVisibility(View.VISIBLE);

        EditText edit =(EditText) findViewById(R.id.article_edit);
        edit.setVisibility(View.GONE);

        String edition = edit.getText().toString();
        article.setText(edition);

        View edit_button = findViewById(R.id.edit_button);
        edit_button.setVisibility(View.VISIBLE);

        View change_button = findViewById(R.id.change_button);
        change_button.setVisibility(View.GONE);
    }
}