package matinal.example.com.material09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class Material09 extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material09);

        toolbar = findViewById(R.id.barra1);
        toolbar.setTitle("El RAPTO DE LAS SABINAS");
        toolbar.setSubtitle("Jacques-Louis David");
    }
}
