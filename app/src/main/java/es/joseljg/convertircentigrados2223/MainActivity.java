package es.joseljg.convertircentigrados2223;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText edt_centigrados = null;
    private TextView txt_kelvin = null;
    private TextView txt_farenheit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_centigrados = (EditText) findViewById(R.id.edt_centigrados);
        txt_kelvin = (TextView) findViewById(R.id.txt_kelvin);
        txt_farenheit = (TextView) findViewById(R.id.txt_farenheit);
    }

    public void convertir_centigrados(View view) {
        double kelvin = 0.0;
        double farenheith = 0.0;

        String textoCaja = String.valueOf(edt_centigrados.getText());
        if(textoCaja.isEmpty())
        {
            edt_centigrados.setError("debes poner un valor en grados centigrados ");
            return;
        }
        double valorc = Double.valueOf(textoCaja);

        DecimalFormat df = new DecimalFormat("#.00");
        kelvin = valorc + 273.15;
        txt_kelvin.setText(String.valueOf(df.format(kelvin))+"ºK");

        farenheith = (valorc * 9/5) + 32.0;
        txt_farenheit.setText(String.valueOf(df.format(farenheith))+"ºF");
        //---------------------------------------------------

    }
}