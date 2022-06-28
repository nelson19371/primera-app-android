package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView idTxtv_1,idTxtv_2;
    Button IdBtn_1,IdBtn_2, IdBtn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        se declaran variables de tipo textView

        idTxtv_1 = (TextView) findViewById(R.id.idTxtv_1);
        idTxtv_2 = (TextView) findViewById(R.id.idTxtv_2);

//        se declaran variables de tipo Button

        IdBtn_1 = (Button) findViewById(R.id.IdBtn_1);
        IdBtn_2 = (Button) findViewById(R.id.IdBtn_2);
        IdBtn_3 = (Button) findViewById(R.id.IdBtn_3);





        IdBtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getBaseContext(),"Se a presionado el boton 1", Toast.LENGTH_SHORT).show();
                idTxtv_1.setText("Hola Mundo1");
            }
        });

        IdBtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getBaseContext(),"Se a presionado el boton 2", Toast.LENGTH_SHORT).show();
                idTxtv_2.setText("Hola Mundo2");

            }
        });

        IdBtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String StrTexto_1 = idTxtv_1.getText().toString();
                String StrTexto_2 = idTxtv_2.getText().toString();

                Toast.makeText(getBaseContext(), StrTexto_1 +"@"+ StrTexto_2, Toast.LENGTH_SHORT).show();

                idTxtv_1.setText(" ");
                idTxtv_2.setText(" ");


            }
        });


//        Hola soy un comentario


    }
}