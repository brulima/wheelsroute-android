package com.example.jc_va_000.projeto_am;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by jc_va_000 on 04/05/2015.
 */
public class ActivityTelaInicial extends ActionBarActivity {

    private LatLng location = new LatLng(-30.035662, -51.235472);

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();

        map.addMarker(new MarkerOptions().position(location).title("Algum nome aqui"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 20));
        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

    }
    public void chamarActivityTelaMenu(View view) {
        Intent toActivity2 = new Intent(this, ActivityTelaMenu.class);
        startActivity(toActivity2);
    }
}