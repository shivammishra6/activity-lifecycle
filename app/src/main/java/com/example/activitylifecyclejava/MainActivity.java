package com.example.activitylifecyclejava;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d("shivam", "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("shivam", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("shivam", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("shivam", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("shivam", "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("shivam", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shivam", "onDestroy: ");
    }

    public void send(View view) {
        Intent i =new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}