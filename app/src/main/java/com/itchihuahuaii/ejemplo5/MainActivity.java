package com.itchihuahuaii.ejemplo5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edit;
    Button btnF,btnR,btnK;
    TextView lbres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        edit=(EditText)findViewById(R.id.editText);
        btnF=(Button)findViewById(R.id.buttonf);
        btnK=(Button)findViewById(R.id.buttonk);
        btnR=(Button)findViewById(R.id.buttonr);
        btnF.setOnClickListener(this);
        btnK.setOnClickListener(this);
        btnR.setOnClickListener(this);
        lbres=(TextView)findViewById(R.id.lbres);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Que onda que pex", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick(View v){
        if(v.getId()==R.id.buttonf){
            float cent = Float.parseFloat(edit.getText().toString());
            float temp = 32 + (9 * cent/5);
            lbres.setText(temp + " Grados" +" F°");
        }if(v.getId()==R.id.buttonk){
            double kel = Double.parseDouble(edit.getText().toString());
            double temp = kel + 273;
            lbres.setText(temp + " Grados" +" K°");
        }if(v.getId()==R.id.buttonr){
            double ran = Double.parseDouble(edit.getText().toString());
            double temp = 32 + (9 * ran/5);
            double temp1 = temp + 460;
            lbres.setText(temp1 + " Grados"+" R°");
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
