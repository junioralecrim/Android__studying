package com.example.meutestebd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

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
}
