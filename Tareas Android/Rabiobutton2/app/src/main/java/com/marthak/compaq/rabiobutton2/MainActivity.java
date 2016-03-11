package com.marthak.compaq.rabiobutton2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;




public class MainActivity extends Activity {

    RadioButton Amarillo;
    RadioButton Azul;
    RadioButton Rojo;
    ImageView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      initialUISetup();

    }




    public void initialUISetup()
    {
        Resultado = (ImageView)findViewById(R.id.Colores);
        Amarillo = (RadioButton)findViewById(R.id.Amarillo);
        Azul = (RadioButton)findViewById(R.id.Azul);
        Rojo =  (RadioButton)findViewById(R.id.Rojo);

        Amarillo.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        Azul.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        Rojo.setOnCheckedChangeListener(new myCheckBoxChangeClicker());


    }

    class myCheckBoxChangeClicker implements RadioButton.OnCheckedChangeListener{


        public void onCheckedChange (CompoundButton buttonView, boolean isChecked){

    }

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


            if(Amarillo.isChecked()&&!Azul.isChecked()&&!Rojo.isChecked()){
                Resultado.setBackgroundColor(android.graphics.Color.rgb(245, 215, 110));
            }

            if(!Amarillo.isChecked()&&Azul.isChecked()&&!Rojo.isChecked()){
                Resultado.setBackgroundColor(android.graphics.Color.rgb(65, 131, 215));
            }
            if(!Amarillo.isChecked()&&!Azul.isChecked()&&Rojo.isChecked()){
                Resultado.setBackgroundColor(Color.rgb(242,38,19));
            }
        }



    }

}
