package Classes;

import android.database.sqlite.SQLiteOpenHelper;
package fr.tp.tp_2_database_sqlite;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import fr.tp.tp_2_database_sqlite.DatabaseSQLite;
import java.sql.DatabaseMetaData;



public class ConnexionSQLite extends SQLiteOpenHelper {



        public void ConexionSQLite(Context context, String name,
                              SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(DatabaseSQLite.TABLE_USER);
            // TP 2.2 db.execSQL(DatabaseMetaDataCREEATE_TABLE_Animaux);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int
                newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + DatabaseSQLite.TABLE_USER);
            //db.execSQL("DROP TABLE IF EXITS " +
            DatabaseMetaData.TABLE_ANIMAUX);
            onCreate(db);
        }
    }

