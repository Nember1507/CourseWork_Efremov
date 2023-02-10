package com.example.coursework;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AddActivity extends AppCompatActivity {
    private EditText edroom;
    private CardView cardview;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        edroom = findViewById(R.id.edRoom);

    }

    public void startNewActivity(View v) {
        switch(v.getId())
        {
            case R.id.cardKitchen:
                a = 0; return;
            case R.id.cardBedroom:
                a = 1; return;
            case R.id.cardBathroom:
                a = 3; return;
            case R.id.cardOffice:
                a = 4; return;
            case R.id.cardTV:
                a = 5; return;
            case R.id.cardLivingRoom:
                a = 6; return;
            case R.id.cardGarage:
                a = 7; return;
            case R.id.cardToilet:
                a = 8; return;
            case R.id.cardKid:
                a = 9; return;
            default:
                throw new RuntimeException("Unknow button ID");
        }
    }

    public void createNewCard(View view) {
        edroom.getText();
        if (a==1){

        }
    }
}