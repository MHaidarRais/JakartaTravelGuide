package com.rais.haidar.jakartatravelguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcView;
    String[] NamaLokasi = {
            "Marunda Beach"
            ,"The Escape Hunt Experience Jakarta"
            ,"Taman Wisata Alam Mangrove, Angke Kapuk"
            ,"Ancol"
            ,"Kandank Jurank Doank"
            ,"Ragunan Zoo"
            ,"Wisata Kota Tua Jakarta"
            ,"Honey Bee Park of Scouting"
            ,"Unit Pengelola Kawasan Perkampungan Budaya Betawi Setu Babakan"
            ,"TMII Fresh Water Aquarium Parks"
            ,"National Monument"
            ,"Jakarta Aquarium"
            ,"Archipelago Conservation Park"
            ,"Cibugary Farm - Wisata Edukasi Cibugary"
            ,"Dunia Fantasi"
            ,"Istiqlal Mosque, Jakarta"
            ,"Pramuka Island"
            ,"Wayang Museum"
            ,"Sea World Indonesia"
            ,"Museum Bank Indonesia"
            ,"Ocean Dream Samudra"
            ,"Museum of Fine Arts and Ceramics"
            ,"Atlantis Water Adventure"
            ,"National Gallery of Indonesia"
            ,"St. Mary of the Assumption Cathedral, Jakarta"
            ,"Merdeka Palace"
    };
    Double[] Latitudenya = {
            -6.0954644
            ,-6.2555033
            ,-6.105334
            ,-6.1260052
            ,-6.2959256
            ,-6.3114206
            ,-6.1349289
            ,-6.3667088
            ,-6.3383086
            ,-6.3058101
            ,-6.1753924
            ,-6.1750193
            ,-6.3004827
            ,-6.356969
            ,-6.1260052
            ,-6.17017
            ,-5.7456185
            ,-6.1349597
            ,-6.1257784
            ,-6.137127
            ,-6.1260052
            ,-6.1342199
            ,-6.12419
            ,-6.1784594
            ,-6.169225
            ,-6.1701865
    };
    Double[] Longitudenya = {
            106.9602136
            ,106.8100704
            ,106.7333953
            ,106.8290216
            ,106.7243478
            ,106.8137378
            ,106.8115147
            ,106.8936326
            ,106.8231335
            ,106.8926022
            ,106.8249641
            ,106.7878399
            ,106.8992914
            ,106.9042043
            ,106.8290216
            ,106.8292013
            ,106.6094047
            ,106.810169
            ,106.840644
            ,106.8108163
            ,106.8290216
            ,106.8122277
            ,106.8369453
            ,106.8307066
            ,106.8308743
            ,106.8219857
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcView = findViewById(R.id.rcView);

        RecyclerDaftarAdapter adapter = new RecyclerDaftarAdapter(this,NamaLokasi,Latitudenya,Longitudenya,this);

        rcView.setAdapter(adapter);
        rcView.setLayoutManager(new LinearLayoutManager(this));


    }

    private class RecyclerDaftarAdapter extends RecyclerView.Adapter<RecyclerDaftarAdapter.MyViewHolder> {
        Activity mainActivity1;
        String[] NamaLokasi;
        Double[] Latitudenya;
        Double[] Longitudenya;
        Context context;
        public RecyclerDaftarAdapter(Context context, String[] namaLokasi, Double[] latitudenya, Double[] longitudenya, MainActivity mainActivity1) {
            this.context = context;
            this.NamaLokasi = namaLokasi;
            this.Latitudenya = latitudenya;
            this.Longitudenya = longitudenya;
            this.mainActivity1 = mainActivity1;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {

            holder.txtNamaWisata.setText(NamaLokasi[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,detailActivity.class);
                    intent.putExtra("NamaLokasi",NamaLokasi[position]);
                    intent.putExtra("Latitudenya",Latitudenya[position]);
                    intent.putExtra("Longitudenya",Longitudenya[position]);
                    context.startActivity(intent);
                }
            });


        }


        @Override
        public int getItemCount() {
            return NamaLokasi.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView txtNamaWisata;
            public MyViewHolder(View itemView) {
                super(itemView);
                txtNamaWisata = itemView.findViewById(R.id.txtNamaWisata);
            }
        }
    }
}
