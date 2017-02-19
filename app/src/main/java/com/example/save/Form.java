package com.example.save;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONObject;

public class Form extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        e1=(EditText)findViewById(R.id.ename) ;
        e2=(EditText)findViewById(R.id.ephone) ;
        e3 =(EditText)findViewById(R.id.email) ;
        e4=(EditText)findViewById(R.id.emat) ;
      /*  String name=e1.getText().toString();
        String phone=e2.getText().toString();
        String mail=e3.getText().toString();
        String mat=e4.getText().toString();*/
        //String[ ] arr={name,phone,mail,mat};

       // final String jsonObject = new Gson().toJson(arr);
       // System.out.print(jsonObject);

        but=(Button)findViewById(R.id.button);
       but.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent =new Intent(Form.this,MainActivity.class);
               startActivity(intent);

           }
       });
    }
}
