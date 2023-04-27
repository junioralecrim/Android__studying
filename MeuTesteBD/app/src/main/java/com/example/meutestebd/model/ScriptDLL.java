package com.example.meutestebd.model;

public class ScriptDLL {


    static StringBuilder sql = new StringBuilder();

    public static String criarTabelaPessoa(){
        sql.append("CREATE TABLE Pessoa (");
        sql.append(" id INTEGER PRIMARY KEY NOT NULL,");
        sql.append(" nome TEXT(255) NOT NULL,");
        sql.append(" email TEXT(255) NOT NULL");
        sql.append(");");

        return sql.toString();
    }

    public static String excluirTabela(String nomeTabela){
        sql.append("DROP TABLE IF EXISTS " + nomeTabela);
        return sql.toString();
    }
}
