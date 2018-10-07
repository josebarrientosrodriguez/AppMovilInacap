package inacaptemuco.com.inacapone2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import operaciones.Salud;

public class ResultadoActivity extends AppCompatActivity {
    TextView txvResultadoIdeal;
    TextView txvResultadoPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        txvResultadoIdeal = (TextView) findViewById(R.id.txv_resultadoIdeal);
        txvResultadoPeso = (TextView) findViewById(R.id.txv_resultadoPeso);
        //Capturamos el objeto de la clase intento
        Intent intento = getIntent();
        Bundle datosRecibidos = intento.getExtras();
        // Capturamos los datos
        String nombreRecibido = datosRecibidos.getString("p_nombre");
        int edadRecibida = datosRecibidos.getInt("p_edad");
        int pesoRecibido = datosRecibidos.getInt ("p_peso");
        //Creamos objeto de la clase salud
        Salud salud = new Salud();
        //Mediante los setter asignamos la propiedades al objeto
        salud.setNombre(nombreRecibido);
        salud.setEdad(edadRecibida);
        //Calculamos el peso ideal utilizando el metodo de la clase salud
        int pesoIdeal = salud.calcularPesoIdeal();
        txvResultadoIdeal.setText ("Peso Ideal de "+ nombreRecibido + " es " + pesoIdeal);
        //Operacion para determinar Estado dePeso
        String nombreEstado;
                if (pesoRecibido == pesoIdeal){
                    nombreEstado = "Peso Ideal";
                }else{
                    if(pesoRecibido > pesoIdeal){
                        nombreEstado = "Sobrepeso";
                    }else{
                        nombreEstado = "Bajo peso";
                    }
                }
                txvResultadoPeso.setText("Por lo tanto esta "+nombreEstado);
    }
}
