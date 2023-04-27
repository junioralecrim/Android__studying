package com.example.meutestebd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MeuDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dao = new MeuDAO(this);
        dao.abrirConexao();
        dao.inserir(1, "João", "junior.alecrim");
        List<Pessoa> pessoaList = dao.buscarTodos();
        for (Pessoa pessoa : pessoaList) {
            Log.d("Pessoa", "ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getEmail());
        }
        dao.fecharConexao();
    }
}