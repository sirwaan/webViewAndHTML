package com.sirwansoft.htmlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn_html;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_html=findViewById(R.id.btn_go_to_html_activity);
        btn_html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HTMLActivity.class));
            /*    Intent intent =new Intent(MainActivity.this,HTMLActivity.class);
                startActivity(intent);*/
            }
        });
    }
}
