package com.eneskinik.kentsimgeleriuygulamasijava;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.eneskinik.kentsimgeleriuygulamasijava.databinding.ActivityDetaylarActivtyBinding;
import com.eneskinik.kentsimgeleriuygulamasijava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<KentSimgesi> kentSimgesiArrayList;
    private ActivityMainBinding binding;
    //static KentSimgesi chosenKentSimgesi;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        kentSimgesiArrayList = new ArrayList<>();

        //Data (verileri girdiğimiz yer)

        KentSimgesi pisa = new KentSimgesi("Pisa Kulesi","İtalya",R.drawable.pisa);
        KentSimgesi eyfel = new KentSimgesi("Eyfel Kulesi", "Fransa",R.drawable.eyfel);
        KentSimgesi colosseum = new KentSimgesi("Kolezyum","İtalya",R.drawable.colesseum);
        KentSimgesi londraKoprusu = new KentSimgesi("Londra Köprüsü","İngiltere",R.drawable.londrakoprusu);
        KentSimgesi efes = new KentSimgesi("Efes Antik Kenti","Türkiye",R.drawable.efes);
        KentSimgesi galataKulesi = new KentSimgesi("Galata Kulesi", "Türkiye",R.drawable.galatakulesi);
        KentSimgesi periBacalari = new KentSimgesi("Peri Bacaları", "Türkiye",R.drawable.peribacalari);
        KentSimgesi yerebatanSarnici = new KentSimgesi("Yerebatan Sarnıcı","Türkiye",R.drawable.yerebatansarnici);
        KentSimgesi ayasofya = new KentSimgesi("Ayasofya Camii","Türkiye",R.drawable.ayasofya);
        KentSimgesi kizKulesi = new KentSimgesi("Kız Kulesi","Türkiye",R.drawable.kizkulesi);
        KentSimgesi sumelaManastiri = new KentSimgesi("Sümela Manastırı","Türkiye",R.drawable.sumelamanastiri);
        KentSimgesi truva = new KentSimgesi("Truva Atı", "Türkiye",R.drawable.truva);
        KentSimgesi balikligol = new KentSimgesi("Balıklı Göl", "Türkiye",R.drawable.balikligol);
        KentSimgesi anitkabir = new KentSimgesi("Anıtkabir","Türkiye",R.drawable.anitkabir);
        KentSimgesi halfeti = new KentSimgesi("Halfeti Batık Şehir","Türkiye",R.drawable.halfeti);
        KentSimgesi gobekliTepe = new KentSimgesi("Göbekli Tepe","Türkiye",R.drawable.gobeklitepe);

        kentSimgesiArrayList.add(pisa);
        kentSimgesiArrayList.add(eyfel);
        kentSimgesiArrayList.add(colosseum);
        kentSimgesiArrayList.add(londraKoprusu);
        kentSimgesiArrayList.add(efes);
        kentSimgesiArrayList.add(galataKulesi);
        kentSimgesiArrayList.add(periBacalari);
        kentSimgesiArrayList.add(yerebatanSarnici);
        kentSimgesiArrayList.add(ayasofya);
        kentSimgesiArrayList.add(kizKulesi);
        kentSimgesiArrayList.add(sumelaManastiri);
        kentSimgesiArrayList.add(truva);
        kentSimgesiArrayList.add(balikligol);
        kentSimgesiArrayList.add(anitkabir);
        kentSimgesiArrayList.add(halfeti);
        kentSimgesiArrayList.add(gobekliTepe);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        KentSimgesiAdapter kentSimgesiAdapter = new KentSimgesiAdapter(kentSimgesiArrayList);
        binding.recyclerView.setAdapter(kentSimgesiAdapter);


        /*
        //Adapter
        //ListView

        //mapping (kentSimgesiArrayList İçerisindeki pisa, eyefel, colosseum gibi bunları Pisa Kulesi, Eyfel Kulesi, Kolezyum bunlara dönüştürmek istiyorum)

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                kentSimgesiArrayList.stream().map(kentSimgesi -> kentSimgesi.isim).collect(Collectors.toList()));

        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(MainActivity.this,kentSimgesiArrayList.get(position).isim,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetaylarActivty.class);
                intent.putExtra("Kent Simgesi",kentSimgesiArrayList.get(position));
                startActivity(intent);

            }
        });
       */

    }
}