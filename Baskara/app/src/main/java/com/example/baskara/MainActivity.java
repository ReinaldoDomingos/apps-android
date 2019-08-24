package com.example.baskara;

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

        public void fechar(View view){
            System.exit(0);
        }

        public void calcular(View view){

        EditText edtA = (EditText) findViewById(R.id.edtA);
        EditText edtB = (EditText) findViewById(R.id.edtB);
        EditText edtC = (EditText) findViewById(R.id.edtC);
        TextView txtRes = (TextView) findViewById(R.id.txtRes);

        double a = Double.parseDouble(edtA.getText().toString());
        double b = Double.parseDouble(edtB.getText().toString());
        double c = Double.parseDouble(edtC.getText().toString());
        double delta = Math.pow(b,2)-(4*a*c);
        double x1 = (- b + Math.sqrt(delta))/(2*a);
        double x2 = (- b - Math.sqrt(delta))/(2*a);

        txtRes.setText("As raizes da equação são " + x1 + " e " + x2);
    }
}
