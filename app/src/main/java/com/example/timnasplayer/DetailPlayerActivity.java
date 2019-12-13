package com.example.timnasplayer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailPlayerActivity extends AppCompatActivity {

    public static String EXTRA_PLAYER = "extra_player";
    TextView exAlamat, exKantor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_player);

        exKantor = findViewById(R.id.exKantor);
        exAlamat = findViewById(R.id.exAlamat);


        KantorItem kantorItem =  getIntent().getParcelableExtra(EXTRA_PLAYER);

        String kantor = kantorItem.getKantor();
        String alamat = kantorItem.getAlamat();
        exKantor.setText(kantor);
        exAlamat.setText(alamat);


    }
}
