package com.example.bianca_sota.proprietario.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bianca_sota.proprietario.R;
import com.example.bianca_sota.proprietario.model.Proprietario;
import com.orm.SugarRecord;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        /*Proprietario proprietario = new Proprietario("Bianca", "Rua", "123", "10");
        proprietario.save();
        //SugarRecord.save(proprietario);
        Toast.makeText(this,"Proprietario Cadastrado",Toast.LENGTH_LONG).show();*/
    }

    public void chamaTelaProprietario(View v) {
        Intent intent = new Intent(Intro.this, TelaMain.class);
        startActivity(intent);
    }
    private Context getContext(){
        return this;
    }
}
