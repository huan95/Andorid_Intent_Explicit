package com.example.intent_explicit;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMain = (Button) findViewById(R.id.buttonScreen1);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        Log.d("AAA","onCreate Main1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA","onStart Main1");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA","onRestart Main1");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA","onResume Main1");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA","onPause Main1");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA","onStop Main1");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA","onDestroy Main1");

    }
}
