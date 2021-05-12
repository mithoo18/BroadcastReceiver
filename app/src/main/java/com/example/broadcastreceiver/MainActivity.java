package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit_msg = (EditText) findViewById(R.id.edit_msg);

        Button btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(edit_msg.getText().toString())){
                    Toast.makeText(MainActivity.this, "Enter a Message", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent= new Intent("com.example.action.MY_ACTION");
                    intent.putExtra("data",edit_msg.getText().toString());
                    sendBroadcast(intent);
                }
            }
        });

    }

}