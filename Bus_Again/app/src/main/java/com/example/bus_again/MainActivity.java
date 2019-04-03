package com.example.bus_again;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mBtnStart = findViewById(R.id.button_start1);

        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "欢迎使用";
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, BusSearch.class);
                startActivity(intent);
            }
        });
    }
}
