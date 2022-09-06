package br.fmu.projetoaula2n;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private EditText editTextResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber1 = findViewById( R.id.editTextNumber1 );
        editTextNumber2 = findViewById( R.id.editTextNumber2 );
        editTextResultado = findViewById( R.id.editTextResultado );
    }

    public void somar(View view) {
        int numero1 = Integer.parseInt( editTextNumber1.getText().toString() );
        int numero2 = Integer.parseInt( editTextNumber2.getText().toString() );
        int soma = numero1 + numero2;
        editTextResultado.setText(Integer.toString(soma));
    }
}