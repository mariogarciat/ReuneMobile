package co.edu.udea.reune.reunemovil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText inputUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUserName = (EditText) findViewById(R.id.username);
    }

    public void onLoginClick(View v){

        String userName = inputUserName.getText().toString();

        if(!userName.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese usuario y/o contraseña",
                    Toast.LENGTH_SHORT).show();
        }else if (userName.equals("usuario1")){
            Intent intent = new Intent(this, ChooseCourse.class);
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Usuario incorrecto",
                    Toast.LENGTH_SHORT).show();
        }



    }
}
