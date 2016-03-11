package com.example.darcysolarte.coloresmezclados;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.view.View;

import android.widget.Toast;


public class MainActivity extends Activity {
    CheckBox Azul;
    CheckBox Amarillo;
    CheckBox Rojo;
    ImageView Colores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialUISetup();
    }

    public void initialUISetup() {


        Colores = (ImageView) findViewById(R.id.colores);
        Azul = (CheckBox) findViewById(R.id.azul);
        Amarillo = (CheckBox) findViewById(R.id.amarillo);
        Rojo = (CheckBox) findViewById(R.id.rojo);

        Azul.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        Amarillo.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        Rojo.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
    }

    class myCheckBoxChangeClicker implements CheckBox.OnCheckedChangeListener {

        @Override


        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


            if(Azul.isChecked()&&Amarillo.isChecked()&&!Rojo.isChecked()){
                Colores.setBackgroundColor(Color.rgb(000,255,000));
                }
            if(Azul.isChecked()&&!Amarillo.isChecked()&&!Rojo.isChecked()){
                Colores.setBackgroundColor(Color.rgb(65, 131, 215));
            }

             if (Azul.isChecked()&&Rojo.isChecked()&&!Amarillo.isChecked()){
                Colores.setBackgroundColor(Color.rgb(255,000,255));
            }

            if(Amarillo.isChecked()&&Rojo.isChecked()&&!Azul.isChecked()){
                Colores.setBackgroundColor(Color.rgb(248,148,6));
            }
            if(Amarillo.isChecked()&&!Rojo.isChecked()&&!Azul.isChecked()){
                Colores.setBackgroundColor(Color.rgb(247, 202, 24));
            }

            if(Amarillo.isChecked()&&Rojo.isChecked()&&Azul.isChecked()){
                Colores.setBackgroundColor(Color.rgb(150, 40, 27));
            }
            if(Rojo.isChecked()&&!Amarillo.isChecked()&&!Azul.isChecked()){
                Colores.setBackgroundColor(Color.rgb(207, 0, 15));
            }



            }
 /*Segundo Ejercicio
            if (isChecked) {
                if ((buttonView==Azul) && (buttonView==Amarillo)) {
                    Colores.setBackgroundColor(Color.rgb(000,255,000));
                }

                else if ((buttonView==Azul) && (buttonView==Rojo)) {
                    Colores.setBackgroundColor(Color.rgb(255,000,255));
                }

                else if ((buttonView==Amarillo) && (buttonView==Rojo)) {
                    Colores.setBackgroundColor(Color.rgb(255,90,00));
                }
                */
            }

        }


