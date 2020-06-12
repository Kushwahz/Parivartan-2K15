package com.govishal.vishalsingh.parivartan2k15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class
        SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button one= (Button) findViewById(R.id.button2);
        one.setOnClickListener(this);
        Button two= (Button) findViewById(R.id.button3);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button4);
        three.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button2:
                startActivity(new Intent(getApplicationContext(), ThirdActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(getApplicationContext(), FourthActivity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(getApplicationContext(), FifthActivity.class));
                break;
        }
    }
}
