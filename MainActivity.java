package com.example.veerb.factpop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView factBox;
    Facts factHolder = new Facts();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        factBox =(TextView) findViewById(R.id.FactTextbox);

    }
    public void genFact(View view)
    {

  factBox.setText(factHolder.nextFact());



    }



}
