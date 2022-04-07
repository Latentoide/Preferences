package es.ieslavereda.ajustes;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

public class GestionPreferencias {

    private SharedPreferences preferencias;
    private static GestionPreferencias instance;

    public String getUnidad(Context context){
        inicializa(context);
        return preferencias.getString("unidades", "standard");
    }

    private void inicializa(Context context){
        if(preferencias == null)
            preferencias = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static GestionPreferencias getInstance() {
        if(instance == null){
            instance = new GestionPreferencias();
        }
        return instance;
    }

}
