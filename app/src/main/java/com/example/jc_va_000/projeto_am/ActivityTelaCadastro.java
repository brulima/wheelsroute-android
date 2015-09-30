package com.example.jc_va_000.projeto_am;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jc_va_000 on 04/05/2015.
 */
public class ActivityTelaCadastro extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);


    }

    public void chamarActivityInicial2(View view) {
        Intent toActivity2 = new Intent(this, ActivityTelaInicial.class);
        startActivity(toActivity2);
    }
}
