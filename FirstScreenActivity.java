package urdurda.test;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class FirstScreenActivity extends AppCompatActivity {

    EditText inputName;
    EditText inputDate;
    EditText inputHola;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);

        inputName = (EditText) findViewById(R.id.name);
        inputDate = (EditText) findViewById(R.id.date);
        inputHola = (EditText) findViewById(R.id.hola);

        Button btnAfram = (Button) findViewById(R.id.btnAfram);

        //Listening to button event
        btnAfram.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent secondScreen = new Intent(getApplicationContext(), SecondScreenActivity.class);

                //Sending data to another Activity
                secondScreen.putExtra("name", inputName.getText().toString());
                secondScreen.putExtra("date", inputDate.getText().toString());
                secondScreen.putExtra("hola", inputHola.getText().toString());

                startActivity(secondScreen);
            }


            });



        }

    @Override
    protected void onSaveInstanceState(Bundle state){
        super.onSaveInstanceState(state);
        state.putSerializable("name", name);


    }


    }















