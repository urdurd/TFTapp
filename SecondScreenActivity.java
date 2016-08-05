package urdurda.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondScreenActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        TextView txtName = (TextView) findViewById(R.id.txtName);
        TextView txtDate = (TextView) findViewById(R.id.txtDate);
        TextView txtHola = (TextView) findViewById(R.id.txtHola);
        Button btnBaka = (Button) findViewById(R.id.btnBaka);

        Intent i = getIntent();
        //Receiving the Data
        String name = i.getStringExtra("name");
        String date = i.getStringExtra("date");
        String hola = i.getStringExtra("hola");
        //Log.e("Second Screen", name + "." + date + "." + hola);

        //Displaying Received data
        txtName.setText(name);
        txtDate.setText(date);
        txtHola.setText(hola);

        //Binding Click event to Button
        btnBaka.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){


                Intent firstScreen = new Intent(getApplicationContext(), FirstScreenActivity.class);

                startActivity(firstScreen);
            }


        });


    }





}
