package com.example.jc_va_000.projeto_am;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by jc_va_000 on 07/05/2015.
 */
public class ActivityTelaCadastroRouties2 extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_routies2);


    }

    public void chamarActivityRoutie2(View view) {
        Intent toActivity2 = new Intent(this, ActivityTelaRouties.class);
        startActivity(toActivity2);
    }

    public void chamarActivityCadastroRouties(View view) {
        Intent toActivity2 = new Intent(this, ActivityTelaCadastroRouties.class);
        startActivity(toActivity2);
    }
}