package com.example.mpe_hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button switchToSecondActivity;
    Button openGroupMembers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchToSecondActivity = findViewById(R.id.activity_main_button);
        switchToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }

        });

        openGroupMembers = findViewById(R.id.group_member_button);
        openGroupMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GroupMemberFragment().show(
                        getSupportFragmentManager(), GroupMemberFragment.TAG);
            }
        });
    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, SecondActivity.class);
        startActivity(switchActivityIntent);
    }

    private void openGroupMembers() {

    }
}