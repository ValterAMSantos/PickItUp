package com.example.pickitup;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.content.Context;

public class SQLite extends SQLiteOpenHelper implements AutoCloseable {

    private static final String DB_NAME = "PIU";
    private static final int VERSION = 1;


    private static String qrycreate="";
    private static String qryimport="select \n" +
            "st.ref, st.design, st.familia, st.stock, \n" +
            "st.epv1, st.epv2, st.epv3, st.epv4, st.epv5, \n" +
            "st.iva1incl,st.iva2incl,st.iva3incl,st.iva4incl,st.iva5incl,taxasiva.taxa,\n" +
            "st.local,st.unidade,st.uni2,st.imagem,st.url,st.peso,st.massaliq\n" +
            "from st left join taxasiva on st.tabiva=taxasiva.codigo\n" +
            "where st.stns=0 and st.inactivo=0";

    //Default Contructor
    public SQLite(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }
}
