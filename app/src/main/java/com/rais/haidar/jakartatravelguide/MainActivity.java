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
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcView;

    String[] ListGambar = {
            "https://3.bp.blogspot.com/-ylLj1dVNh24/WRgLU9agX8I/AAAAAAAAZdo/z2cwvtP4ofo0b2dv4L_voPO5z93WYNVlQCLcB/s1600/pantai%2Bma1.jpg"
            ,"https://reddoorz.files.wordpress.com/2018/04/aea9a6b6309646405b6372505534d36a3babcfd2.jpeg"
            ,"https://1.bp.blogspot.com/-0peqSg1p-0A/WkhGfZHKUEI/AAAAAAAABPo/69ladPskEJEXMlFF9v8hBx3IFRYKo6PFgCLcBGAs/s1600/keliling-taman-wisata-alam-mangrove-pantai-indah-kapuk-pQQswT06yO-compressed.jpg"
            ,"http://cdn2.tstatic.net/jatim/foto/bank/images/taman-impian-jaya-ancol_20180228_132500.jpg"
            ,"http://tempatwisataindonesia.id/wp-content/uploads/2017/02/Sekolah-Alam-Kandank-Jurank-Doank-Tangerang.jpg"
            ,"https://www.menginspirasi.com/wp-content/uploads/2018/01/ragunan.jpg"
            ,"http://www.liburananak.com/images/media/wisata_kota_tua/liburananak_wisatakotatua%20(1).jpg"
            ,"http://1.bp.blogspot.com/-35WC1wxCVmk/UKBen-js9EI/AAAAAAAAARM/SJRLAEZJHoI/s1600/gambar+patung+lebah.jpg"
            ,"http://cdn2.tstatic.net/wartakota/foto/bank/images/20170118berita-video-pesona-budaya-betawi-di-setu-babakan_20170118_192544.jpg"
            ,"https://i.ytimg.com/vi/ryMU5hBMeKg/maxresdefault.jpg"
            ,"https://steemitimages.com/DQmPCFpdDtahdVke3Lfovb4UrwmdHBz56bbuzf9Jyf2tkfY/mona.jpg"
            ,"https://media.beritagar.id/2017-07/shutterstock-508380913_1500002884.jpg"
            ,"http://rajaampatbiodiversity.com/wp-content/uploads/2016/08/islas-indonesia-raja-ampat.jpg"
            ,"http://www.liburananak.com/images/holiday_spots/image_511e306896fec_Cibugary-Profile-2.jpg"
            ,"https://cdn04.tiket.photos/img/business/d/u/business-dunia-fantasi-ancol-jakarta-jakarta-utara-at-tiket-dot-com631.l.jpg"
            ,"http://jktgo.com/wp-content/uploads/2013/08/jakarta-indonesia-istiqlal-mosque-e1377499130796.jpg"
            ,"http://www.besttravelpictures.com/wp-content/uploads/2011/11/Pramuka-Island-Thousand-Islands.jpg"
            ,"http://jktgo.com/wp-content/uploads/2013/08/museum-wayang-3.jpg"
            ,"http://beritakabar.com/wp-content/uploads/2014/10/lorong-antasena.jpg"
            ,"https://media-cdn.tripadvisor.com/media/photo-s/02/77/72/16/museum-bank-of-indonesia.jpg"
            ,"http://panduanwisata.id/files/2014/09/IMG_8760.jpg"
            ,"https://thumbnails.trvl-media.com/1XhAFgECuAOf1l_f_jv_MWWgNO0=/768x432/images.trvl-media.com/media/content/shared/images/travelguides/destination/1704/Museum-Of-Fine-Arts-And-Ceramics-210473.jpg"
            ,"https://cdn.moneysmart.id/wp-content/uploads/2018/07/02170008/Atlantis-Water-Adventure-700x497.jpg"
            ,"http://jktgo.com/wp-content/uploads/2017/10/img-20171006-wa0019-1507367025.jpg"
            ,"https://media-cdn.tripadvisor.com/media/photo-s/0f/23/be/e6/photo0jpg.jpg"
            ,"http://cdn2.tstatic.net/jateng/foto/bank/images/istana-merdeka_20160715_233951.jpg"
    };

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

        RecyclerDaftarAdapter adapter = new RecyclerDaftarAdapter(this,NamaLokasi,Latitudenya,Longitudenya,ListGambar,this);

        rcView.setAdapter(adapter);
        rcView.setLayoutManager(new LinearLayoutManager(this));


    }

    private class RecyclerDaftarAdapter extends RecyclerView.Adapter<RecyclerDaftarAdapter.MyViewHolder> {
        Activity mainActivity1;
        String[] NamaLokasi;
        Double[] Latitudenya;
        Double[] Longitudenya;
        String[] Gambarnya;
        Context context;
        public RecyclerDaftarAdapter(Context context, String[] namaLokasi, Double[] latitudenya, Double[] longitudenya,String[] Gambarnya, MainActivity mainActivity1) {
            this.context = context;
            this.NamaLokasi = namaLokasi;
            this.Latitudenya = latitudenya;
            this.Longitudenya = longitudenya;
            this.mainActivity1 = mainActivity1;
            this.Gambarnya = Gambarnya;

        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {

            holder.txtNamaWisata.setText(NamaLokasi[position]);
            Glide.with(context)
                    .load(Gambarnya[position])
                    .fitCenter()
                    .into(holder.detailGambarlist);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,detailActivity.class);
                    intent.putExtra("NamaLokasi",NamaLokasi[position]);
                    intent.putExtra("Latitudenya",Latitudenya[position]);
                    intent.putExtra("Gambarnya",Gambarnya[position]);
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
            ImageView detailGambarlist;
            public MyViewHolder(View itemView) {
                super(itemView);
                txtNamaWisata = itemView.findViewById(R.id.txtNamaWisata);
                detailGambarlist = itemView.findViewById(R.id.detailGambarlist);
            }
        }
    }
}
