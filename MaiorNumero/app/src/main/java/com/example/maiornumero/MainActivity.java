package com.example.maiornumero;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    public void maior(View view){
        EditText txtn1 = (EditText) findViewById(R.id.edtN1);
        EditText txtn2 = (EditText) findViewById(R.id.edtN2);
        TextView txtres = (TextView) findViewById(R.id.txtResultado);

        int  n1 = Integer.parseInt(txtn1.getText().toString());
        int  n2 = Integer.parseInt(txtn2.getText().toString());


        if(n1==n2){
            txtres.setText("Os numeros são iguais");
        }else if(n1>n2){
            txtres.setText("O numero " + n1 + " é o maior!");
        }else {
            txtres.setText("O numero " + n2 + " é o maior!");
        }
    }
}
