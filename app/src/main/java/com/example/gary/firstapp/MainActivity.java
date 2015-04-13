package com.example.gary.firstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText SideOne, SideTwo, Area, HypLength;
    Button Calculate;

    double Two = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SideOne = (EditText) findViewById(R.id.SideOne);
        SideTwo = (EditText) findViewById(R.id.SideTwo);
        Area = (EditText) findViewById(R.id.Area);
        HypLength = (EditText) findViewById(R.id.HypLength);



        Calculate = (Button) findViewById(R.id.Calculatebutton);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Processing",Toast.LENGTH_SHORT).show();

                SideTwo.getText();
                SideOne.getText();
                HypLength.setText(Double.parseDouble(SideOne.getText().toString())*Double.parseDouble(SideOne.getText().toString())+(Double.parseDouble(SideTwo.getText().toString())*Double.parseDouble(SideTwo.getText().toString())+""));
                HypLength.getText();

                Area.setText(Double.parseDouble(SideOne.getText().toString())*(Double.parseDouble(SideTwo.getText().toString())/Two)+"");


            }
        });

        SideOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
