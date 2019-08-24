package com.example.consumoveiculo;

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

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void consumo(View view){

        EditText edtLitros = (EditText) findViewById(R.id.edtQtdLitros);
        EditText edtKm = (EditText) findViewById(R.id.edtQtdKm);
        TextView txtCons = (TextView) findViewById(R.id.txtConsumo);

        double el = Double.parseDouble(edtLitros.getText().toString());
        double ek = Double.parseDouble(edtKm.getText().toString());

        double cons = ek/el;

        txtCons.setText("Consumo: " + cons);
    }

    public void gasto(View view){

        EditText edtLitros = (EditText) findViewById(R.id.edtQtdLitros);
        EditText edtKm = (EditText) findViewById(R.id.edtQtdKm);
        EditText edtComb = (EditText) findViewById(R.id.edtValorCombustivel);
        TextView txtCons = (TextView) findViewById(R.id.txtConsumo);
        TextView txtValGasto = (TextView) findViewById(R.id.txtValorGasto);

        double el = Double.parseDouble(edtLitros.getText().toString());
        double ek = Double.parseDouble(edtKm.getText().toString());
        double ec = Double.parseDouble(edtComb.getText().toString());

        double cons = ek/el;
        double valGas = cons * ec;

        txtCons.setText("Consumo: " + cons);
        txtValGasto.setText("Valor gasto: " + valGas);
    }
}
