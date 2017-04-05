package org.adroidtown.hello;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText Age;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        Name = (EditText)findViewById(R.id.enditText1);
        Age = (EditText)findViewById(R.id.editText2);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String outName = Name.getText().toString();
                String outAge = Age.getText().toString();
                Intent intent = new Intent(getApplicationContext(), sub1.class);
                intent.putExtra("Name",outName);
                intent.putExtra("Age",outAge);
                startActivity(intent);
            }
        });

    }
}




