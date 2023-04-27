package com.example.meutestebd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.meutestebd.model.ScriptDLL;

public class MeuBancoDeDadosOpenHelper extends SQLiteOpenHelper {

    private static final String mDatabaseName = "banco.db";
    private static final int mVersion = 1;

    public MeuBancoDeDadosOpenHelper(@Nullable Context context, @Nullable SQLiteDatabase.CursorFactory factory) {
        super(context, mDatabaseName, factory, mVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScriptDLL.criarTabelaPessoa()); //criando a tabela no banco de dados
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ScriptDLL.excluirTabela("Pessoa"));
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
