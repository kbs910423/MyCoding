package org.adroidtown.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static org.adroidtown.hello.R.id.button1;

public class sub1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        Intent passedIntent = getIntent();
        if(passedIntent!=null){
            String loginName = passedIntent.getStringExtra("Name");
            String loginAge = passedIntent.getStringExtra("Age");
            Toast.makeText(getApplicationContext(),"Student info: " + loginName+"," +loginAge,Toast.LENGTH_LONG).show();
        }
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }

}
