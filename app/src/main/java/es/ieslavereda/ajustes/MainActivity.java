package es.ieslavereda.ajustes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.configuracion:
                Intent intent = new Intent(this, PreferencesActivity.class);
                startActivity(intent);
                return true;
            case R.id.exit:
                Toast.makeText(this, "Te vas?", Toast.LENGTH_SHORT).show();
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void showPreferences(View view){
        Toast.makeText(this, "Unidad seleccionada " + GestionPreferencias.getInstance().getUnidad(this), Toast.LENGTH_SHORT).show();
    }
}