package com.example.a84353.testlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.startSecondActivity);
    }
    public void btnClick(View view){
        Log.i("debug","btn onClick in Main");
        Intent itn=new Intent(MainActivity.this,SecondActivity.class);
        Log.i("debug","text onClick in Main");
        TextView tv=findViewById(R.id.editText);
        Toast.makeText(MainActivity.this, ""+tv.getText(), Toast.LENGTH_SHORT).show();
    }

}
