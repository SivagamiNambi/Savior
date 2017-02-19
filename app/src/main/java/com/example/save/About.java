package com.example.save;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sivagami on 18/2/17.
 */

public class About extends AppCompatActivity{
    TextView tv;
    //Button b;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        tv=(TextView)findViewById(R.id.content);
        tv.setText("Savior is your one stop solution during a crisis." +"\n"+
                    "When disaster strikes,fear not, for we will always assist you in every way we can!");
        /*b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(About.this,MainActivity.class);
                startActivity(i);
            }

        });*/
    }
}
