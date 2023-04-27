package com.example.meutestebd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class MeuDAO {
    private SQLiteDatabase database;
    private MeuBancoDeDadosOpenHelper dbHelper;

    public MeuDAO(Context context){
        dbHelper = new MeuBancoDeDadosOpenHelper(context, null);
    }

    public void abrirConexao(){
        database = dbHelper.getWritableDatabase();
    }

    public void fecharConexao(){
        dbHelper.close();
    }

    public void inserir(int id, String nome, String email){
        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("nome", nome);
        values.put("email", email);
        database.insert("Pessoa", null, values);
    }

    public List<Pessoa> buscarTodos() {
        List<Pessoa> objetos = new ArrayList<Pessoa>();
        Cursor cursor = database.rawQuery("SELECT * FROM minha_tabela", null);
        if (cursor.moveToFirst()) {
            do {
                Pessoa objeto = new Pessoa();
                objeto.setId(cursor.getInt(0));
                objeto.setNome(cursor.getString(1));
                objeto.setEmail(cursor.getString(2));
                objetos.add(objeto);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return objetos;
    }

}
