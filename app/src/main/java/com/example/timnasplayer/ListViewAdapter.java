package com.example.timnasplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class ListViewAdapter extends ArrayAdapter<KantorItem> {

    private final List<KantorItem> kantorItemList;

    private Context context;

    public ListViewAdapter(List<KantorItem> kantorItemList, Context context) {
        super(context, R.layout.list_item, kantorItemList);
        this.kantorItemList = kantorItemList;
        this.context = context;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View listViewItem = inflater.inflate(R.layout.list_item, null, true);

        TextView textViewKantor = listViewItem.findViewById(R.id.textViewKantor);
        TextView textViewAlamat = listViewItem.findViewById(R.id.textViewAlamat);
        TextView textViewNomortlpn = listViewItem.findViewById(R.id.textViewNomortlpn);
        ImageView imgVIew = listViewItem.findViewById(R.id.Poster);


        KantorItem kantorItem = kantorItemList.get(position);

        textViewKantor.setText(kantorItem.getKantor());
        textViewAlamat.setText(kantorItem.getAlamat());
        textViewNomortlpn.setText(kantorItem.getNomortlpn());

        Glide.with(context).load(kantorItem.getPoster()).into(imgVIew);

        return listViewItem;
    }
}