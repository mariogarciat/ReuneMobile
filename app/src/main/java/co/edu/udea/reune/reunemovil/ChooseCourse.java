package co.edu.udea.reune.reunemovil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ChooseCourse extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private EditText inputKeyWord;
    private Spinner inputAcUnit;
    private String acUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_course);

        inputKeyWord = (EditText) findViewById(R.id.key_word);
        inputAcUnit = (Spinner) findViewById(R.id.spinner);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


 /*       List<String> spinnerArray =  new ArrayList<String>();

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
        sItems.setAdapter(adapter);*/

    }



    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        acUnit = parent.getItemAtPosition(pos).toString();


    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }


    public void onConsultClick(View v){

        String keyWord = inputKeyWord.getText().toString();

        if(!keyWord.isEmpty()){
            Intent intent = new Intent(getApplicationContext(), CourseList.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(),"Ingrese palabra clave", Toast.LENGTH_SHORT).show();
        }

    }

    public void onSearchClick(View v){
        //String acUnit =  inputAcUnit
    }
}
