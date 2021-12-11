package com.eneskinik.kentsimgeleriuygulamasijava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eneskinik.kentsimgeleriuygulamasijava.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class KentSimgesiAdapter extends RecyclerView.Adapter<KentSimgesiAdapter.KentSimgesiHolder> {

    ArrayList<KentSimgesi> kentSimgesiArrayList;

    public KentSimgesiAdapter(ArrayList<KentSimgesi> kentSimgesiArrayList) {
        this.kentSimgesiArrayList = kentSimgesiArrayList;
    }

    @NonNull
    @Override // xml i bağlama işlemi burada yapılacak
    public KentSimgesiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new KentSimgesiHolder(recyclerRowBinding);
    }

    @Override // layout içerisinde hangi veriler gösterilecekse burda belirtilecek
    public void onBindViewHolder(@NonNull KentSimgesiAdapter.KentSimgesiHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.recyclerViewTextView.setText(kentSimgesiArrayList.get(position).isim);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),DetaylarActivty.class);
                intent.putExtra("Kent Simgesi",kentSimgesiArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override  // xml in kaç kez oluşturulacağını söyleyecek
    public int getItemCount() {
        return kentSimgesiArrayList.size();
    }
    //Yardımcı Sınıf, görünümleri tutacak olan sınıf
    public class KentSimgesiHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public KentSimgesiHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
