package com.example.listview_33;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListAdapter extends ArrayAdapter {
    private Context context;
    private String[] namabuah;
    private int[] gambarbuah;

    //klik kanan = generate = constructor

    public CustomListAdapter(Context context1, String[] namabuah, int[] gambarbuah) {
        super(context1, R.layout.item_buah, namabuah);
        this.context = context1;
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
    }

    //getView

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        //atur layout item
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.item_buah,parent,false);

        TextView tvNamaBuah = view.findViewById(R.id.tv_item_nama);
        ImageView ivGambarBuah = view.findViewById(R.id.iv_item_gambar);

        tvNamaBuah.setText(namabuah[position]);
        ivGambarBuah.setImageResource(gambarbuah[position]);
        return view;
    }
}
