package com.example.bus_again;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BusSearch extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_search);
        Button mBtnSearch = findViewById(R.id.button_search);
        final EditText editText = findViewById(R.id.searchBox);

        mBtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString();
                String text = "查询完毕";
                String text1 = "当前线路尚未开通";
                switch (number) {
                    case "33":
                        Toast.makeText(BusSearch.this, text, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(BusSearch.this, BusMessage.class);
                        startActivity(intent);
                        break;
                    case "321":
                        Toast.makeText(BusSearch.this, text, Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(BusSearch.this, Bus_321.class);
                        startActivity(intent1);
                        break;
                    default:
                        Toast.makeText(BusSearch.this, text1, Toast.LENGTH_SHORT).show();
                }
                editText.setText("");
            }
        });
    }
}