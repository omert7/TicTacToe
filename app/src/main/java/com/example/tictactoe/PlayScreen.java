package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayScreen extends AppCompatActivity {

    private Button[][] buttons=new Button[3][3];
    private boolean Xturn=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);
       // ImageFilterButton imgf=findViewById(R.id.main_imb_11);
        /*imgf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}