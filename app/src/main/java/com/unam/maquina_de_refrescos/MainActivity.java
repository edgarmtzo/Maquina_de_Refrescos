package com.unam.maquina_de_refrescos;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;

    ImageView iagua, icoca, ipepsi, ifanta, isidral, isprite;
    Button enviar;
    EditText tagua, tcoca, tpepsi, tfanta, tsidral, tsprite;
    RatingBar estrellas;
    int nagua, ncoca, npepsi, nfanta, nsidral, nsprite;
    float rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nagua=0;
        ncoca=0;
        npepsi=0;
        nfanta=0;
        nsidral=0;
        nsprite=0;

        iagua=(ImageView) findViewById(R.id.iagua);
        icoca =(ImageView) findViewById(R.id.icoca);
        ipepsi=(ImageView) findViewById(R.id.ipepsi);
        ifanta=(ImageView) findViewById(R.id.ifanta);
        isidral=(ImageView) findViewById(R.id.isidral);
        isprite=(ImageView) findViewById(R.id.isprite);

        enviar=(Button) findViewById(R.id.enviar);

        tagua=(EditText) findViewById(R.id.tagua);
        tcoca=(EditText) findViewById(R.id.tcoca);
        tpepsi=(EditText) findViewById(R.id.tpepsi);
        tfanta=(EditText) findViewById(R.id.tfanta);
        tsidral=(EditText) findViewById(R.id.tsidral);
        tsprite=(EditText) findViewById(R.id.tsprite);

        estrellas=(RatingBar) findViewById(R.id.estrellas);

        iagua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagua++;
                String numberAsString = Integer.toString(nagua);
                tagua.setText(numberAsString);
            }
        });
        iagua.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nagua--;
                String numberAsString = Integer.toString(nagua);
                tagua.setText(numberAsString);
                return true;
            }
        });

        icoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncoca++;
                String numberAsString = Integer.toString(ncoca);
                tcoca.setText(numberAsString);
            }
        });
        icoca.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ncoca--;
                String numberAsString = Integer.toString(ncoca);
                tcoca.setText(numberAsString);
                return true;
            }
        });

        ipepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                npepsi++;
                String numberAsString = Integer.toString(npepsi);
                tpepsi.setText(numberAsString);
            }
        });
        ipepsi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                npepsi--;
                String numberAsString = Integer.toString(npepsi);
                tpepsi.setText(numberAsString);
                return true;
            }
        });

        ifanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nfanta++;
                String numberAsString = Integer.toString(nfanta);
                tfanta.setText(numberAsString);
            }
        });
        ifanta.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nfanta--;
                String numberAsString = Integer.toString(nfanta);
                tfanta.setText(numberAsString);
                return true;
            }
        });

        isidral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nsidral++;
                String numberAsString = Integer.toString(nsidral);
                tsidral.setText(numberAsString);
            }
        });
        isidral.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nsidral--;
                String numberAsString = Integer.toString(nsidral);
                tsidral.setText(numberAsString);
                return true;
            }
        });

        isprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nsprite++;
                String numberAsString = Integer.toString(nsprite);
                tsprite.setText(numberAsString);
            }
        });
        isprite.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                nsprite--;
                String numberAsString = Integer.toString(nsprite);
                tsprite.setText(numberAsString);
                return true;
            }
        });

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //rating=estrellas.getRating();
                //String numberAsString1= Float.toString(rating)
                String phone="5512366354";
                String text="Tu pedido fue de "+nagua+" aguas, "+ncoca+" cocas, "+npepsi+" pepsis, "+nfanta+" fantas, "+nsidral+" sidrales, "+nsprite+ " sprites. Rating: "+rating;
                SmsManager sms= SmsManager.getDefault();
                sms.sendTextMessage(phone, null, text , null, null);
            }
        });
    }
}
