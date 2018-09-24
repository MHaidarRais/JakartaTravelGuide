package com.rais.haidar.jakartatravelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class detailActivity extends AppCompatActivity {

    TextView txtDetailNamaWisata;
    ImageView imgSnapshot;

    private static  String BASE_URL = "https://maps.googleapis.com/maps/api/staticmap?center=";
    private static String END_URL = "&zoom=15&size=1000x500&maptype=hybrid&markers=color:red%7C";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtDetailNamaWisata = findViewById(R.id.detailTempatWisata);
        imgSnapshot = findViewById(R.id.snapshotMaps);
        String NAMALOKASI = getIntent().getStringExtra("NamaLokasi");
        final Double Latitudenya = getIntent().getDoubleExtra("Latitudenya",0);
        final Double Longitudenya = getIntent().getDoubleExtra("Longitudenya",0);

        txtDetailNamaWisata.setText(NAMALOKASI);


        Glide.with(this)
                .load(BASE_URL+Latitudenya+""+Longitudenya +END_URL+Latitudenya+""+Longitudenya)
                .fitCenter()
                .into(imgSnapshot);

        imgSnapshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(detailActivity.this)
                        .load(BASE_URL+Latitudenya+","+Longitudenya +END_URL+Latitudenya+","+Longitudenya)
                        .fitCenter()
                        .into(imgSnapshot);
            }
        });



    }
}
