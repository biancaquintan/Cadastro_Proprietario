package com.example.bianca_sota.proprietario.model;

import com.orm.SugarApp;
import com.orm.SugarRecord;
import android.database.sqlite.*;
import java.util.Date;


public class Proprietario extends SugarRecord {
    String nome;
    String endereco;
    String telefone;
    String data; 

    public Proprietario(String nome, String endereco, String telefone, String data) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.data = data;
    }

    public Proprietario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
