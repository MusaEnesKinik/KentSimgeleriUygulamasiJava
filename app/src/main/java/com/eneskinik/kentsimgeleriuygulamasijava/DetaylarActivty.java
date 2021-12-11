package com.eneskinik.kentsimgeleriuygulamasijava;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eneskinik.kentsimgeleriuygulamasijava.databinding.ActivityDetaylarActivtyBinding;

public class DetaylarActivty extends AppCompatActivity {

    private ActivityDetaylarActivtyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetaylarActivtyBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        //Casting
        KentSimgesi secilenKentSimgesi = (KentSimgesi) intent.getSerializableExtra("Kent Simgesi");

        binding.isimText.setText(secilenKentSimgesi.isim);
        binding.ulkelerText.setText(secilenKentSimgesi.ulke);
        binding.imageView.setImageResource(secilenKentSimgesi.resim);



    }
}