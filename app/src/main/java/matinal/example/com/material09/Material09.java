package matinal.example.com.material09;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class Material09 extends AppCompatActivity {

    private Toolbar toolbar;
    private static final int DURACION = 300;
    private Boolean giro = false;
    private ImageView icono;
    private LinearLayout detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material09);

        toolbar = findViewById(R.id.barra1);
        icono = findViewById(R.id.imagen2);
        detalle = findViewById(R.id.linear3);

        toolbar.setTitle("El RAPTO DE LAS SABINAS");
        toolbar.setSubtitle("Jacques-Louis David");
        toolbar.inflateMenu(R.menu.menu);

        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    private void mensaje(int resid) {
        Toast.makeText(this, getText(resid), Toast.LENGTH_SHORT).show();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.opcion1:
                mensaje(R.string.cadena_opcion_1);
            default:
                return super.onOptionsItemSelected(item);

            case R.id.opcion2:
                mensaje(R.string.cadena_opcion_2);
                return super.onOptionsItemSelected(item);

            case R.id.opcion3:
                mensaje(R.string.cadena_opcion_3);
                return super.onOptionsItemSelected(item);

        }

    }

    private void rotado(Float angulo) {
        Animation animacion = new RotateAnimation(0.0f, angulo, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animacion.setFillAfter(true);
        animacion.setDuration(DURACION);
        icono.startAnimation(animacion);
    }

    public void tocado(View view) {

        icono.setImageResource(R.drawable.menos);
        rotado(-180.0f);
        giro = false;
        Dinamizador.contrae(detalle, DURACION);

        icono.setImageResource(R.drawable.mas);
        rotado(180.0f);
        giro = true;
        Dinamizador.expande(detalle, DURACION);

    }
}
