package com.serhatakguc.sozlukdenemeeee;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AHarfi {
    ImageView resim;
    EditText arama;
public void a(){
        String kelimem = arama.getText().toString();
        if (kelimem.equalsIgnoreCase("abi")) {

            resim.setImageResource(R.drawable.abi);


        }
    }
}
