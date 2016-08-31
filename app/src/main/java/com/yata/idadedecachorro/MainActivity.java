package com.yata.idadedecachorro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botao;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.id_campo_idade_cachorro);
        botao = (Button) findViewById(R.id.id_btn_idade);
        resultado = (TextView) findViewById(R.id.id_idade_humano);

        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String textoDigitado = caixaTexto.getText().toString();

                if (textoDigitado.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Digite a idade do cachorro", Toast.LENGTH_LONG).show();
                } else {
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    resultado.setText("A idade do cacharro em anos humanos é " + resultadoFinal + " anos");
                }
            }
        });

    }
}
