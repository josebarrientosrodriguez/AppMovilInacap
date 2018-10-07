package inacaptemuco.com.inacapone2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Creamos objetos de componentes a utilizar
    EditText edtEdad;
    EditText edtNombre;
    EditText edtPeso;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Asociamos los objetos de la clase con los elementos de la interfaz
        setContentView(R.layout.activity_main);
        edtNombre = (EditText) findViewById(R.id.edt_nombre);
        edtEdad = (EditText) findViewById(R.id.edt_edad);
        edtPeso = (EditText) findViewById(R.id.edt_pesoActual);
        btnCalcular = (Button) findViewById(R.id.btn_calcular);
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Capturamos los valores obtenidos
        String nombreIngresado = edtNombre.getText().toString();
        int edadIngresada = Integer.parseInt(edtEdad.getText().toString());
        int pesoIngresado = Integer.parseInt(edtPeso.getText().toString());
        //Establecemos un intento para abrir el nuevo activity y especificamos los datos a enviar
        Intent intento = new Intent(MainActivity.this,ResultadoActivity.class);
        intento.putExtra("p_nombre", nombreIngresado);
        intento.putExtra("p_edad", edadIngresada);
        intento.putExtra("p_peso", pesoIngresado);
        startActivity(intento);
    }
}
