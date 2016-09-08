package co.edu.udea.reune.reunemovil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ChooseCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_course);

        List<String> spinnerArray =  new ArrayList<String>();

        spinnerArray.add("---");
        spinnerArray.add("CORPORACIÓN ACADÉMICA PARA ESTUDIO DE PATOLOGÍAS TROPICALES");
        spinnerArray.add("CORPORACIÓN AMBIENTAL");
        spinnerArray.add("CORPORACIÓN DE CIENCIAS BÁSICAS BIOMÉDICAS");
        spinnerArray.add("DESARROLLO INSTITUCIONAL");
        spinnerArray.add("DIRECCION DE BIENESTAR UNIVERSIARIO");
        spinnerArray.add("DIRECCION DE GESTION Y RELACIONES INTERNACIONALES");
        spinnerArray.add("DIRECCION DE POSGRADOS");
        spinnerArray.add("DIRECCION DE REGIONALIZACION");
        spinnerArray.add("ESCUELA DE IDIOMAS");
        spinnerArray.add("ESCUELA DE MICROBIOLOGÍA");
        spinnerArray.add("ESCUELA DE NUTRICIÓN Y DIETÉTICA");
        spinnerArray.add("ESCUELA INTERAMERICANA DE BIBLIOTECOLOGÍA");
        spinnerArray.add("FACULTAD DE ARTES");
        spinnerArray.add("FACULTAD DE CIENCIAS AGRARIAS");
        spinnerArray.add("FACULTAD DE CIENCIAS ECONÓMICAS");
        spinnerArray.add("FACULTAD DE CIENCIAS EXACTAS Y NATURALES");
        spinnerArray.add("FACULTAD DE CIENCIAS FARMACÉUTICAS Y ALIMENTARIAS");
        spinnerArray.add("FACULTAD DE CIENCIAS SOCIALES Y HUMANAS");
        spinnerArray.add("FACULTAD DE COMUNICACIONES");
        spinnerArray.add("FACULTAD DE DERECHO Y CIENCIAS POLÍTICAS");
        spinnerArray.add("FACULTAD DE EDUCACIÓN");
        spinnerArray.add("FACULTAD DE ENFERMERÍA");
        spinnerArray.add("FACULTAD DE INGENIERÍA");
        spinnerArray.add("FACULTAD DE MEDICINA");
        spinnerArray.add("FACULTAD DE ODONTOLOGÍA");
        spinnerArray.add("FACULTAD NACIONAL DE SALUD PÚBLICA");
        spinnerArray.add("INSTITUTO DE ESTUDIOS POLÍTICOS");
        spinnerArray.add("INSTITUTO DE ESTUDIOS REGIONALES");
        spinnerArray.add("INSTITUTO DE FILOSOFÍA");
        spinnerArray.add("INSTITUTO UNIVERSITARIO DE EDUCACIÓN FÍSICA Y DEPORTES");
        spinnerArray.add("RECTORIA");
        spinnerArray.add("SECRETARIA GENERAL");
        spinnerArray.add("VICERRECTORIA ADMINISTRATIVA");
        spinnerArray.add("VICERRECTORIA DE DOCENCIA");
        spinnerArray.add("VICERRECTORIA DE EXTENSION");
        spinnerArray.add("VICERRECTORIA DE INVESTIGACION");







        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinner);
        sItems.setAdapter(adapter);

    }
}
