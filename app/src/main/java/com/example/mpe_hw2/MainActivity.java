package com.example.mpe_hw2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       findViewById(R.id.activity_main_button)
               .setOnClickListener(new View.OnClickListener() {
                   @Override
                    public void onClick(View view) {
                        Intent switchActivityIntent = new Intent(MainActivity.this,  SecondActivity.class);
                        switchActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(switchActivityIntent);
                    }
               });

       findViewById(R.id.group_member_button)
               .setOnClickListener(new View.OnClickListener() {
                   @Override
                    public void onClick(View view) {
                        new GroupMemberFragment().show(
                                getSupportFragmentManager(), GroupMemberFragment.TAG);
                    }
               });
    }
}