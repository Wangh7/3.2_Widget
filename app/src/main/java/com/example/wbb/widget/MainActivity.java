package com.example.wbb.widget;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        seekBar = (SeekBar) findViewById(R.id.seek_bar);
        button1.setOnClickListener(v->{
            button1.setTextColor(Color.BLUE);
            Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_SHORT).show();
            imageView.setImageResource(R.mipmap.ic_launcher_round);
            progressBar.setProgress(seekBar.getProgress());

            /*if(progressBar.getVisibility() == View.GONE)
                progressBar.setVisibility(View.VISIBLE);
            else
                progressBar.setVisibility(View.GONE);*/
        });
        button2.setOnClickListener(v->{
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("This is Dialog from Bistu");
            dialog.setMessage("noting is important");
            dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            dialog.setNegativeButton("no", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            dialog.show();
        });
        seekBar.setOnClickListener(v->{
            progressBar.setProgress(seekBar.getProgress());
        });
    }
}
