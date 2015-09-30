package com.example.jc_va_000.projeto_am;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by jc_va_000 on 05/05/2015.
 */
public class ActivityTelaMenu extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);
    }

    public void chamarActivityCadastroRouties(View view) {
        Intent toActivity2 = new Intent(this, ActivityTelaCadastroRouties.class);
        startActivity(toActivity2);
    }

    public void chamarActivitySair(View view) {
        Intent toActivity2 = new Intent(this, MainActivity.class);
        startActivity(toActivity2);
    }

    public void chamarActivityFavoritos(View view) {
        Intent toActivity2 = new Intent(this, ActivityTelaFavoritos.class);
        startActivity(toActivity2);
    }

    public void chamarActivityRouties(View view) {
        Intent toActivity2 = new Intent(this, ActivityTelaRouties.class);
        startActivity(toActivity2);
    }

    public void chamarActivityInicial2(View view) {
        Intent toActivity2 = new Intent(this, ActivityTelaInicial.class);
        startActivity(toActivity2);
    }

}
