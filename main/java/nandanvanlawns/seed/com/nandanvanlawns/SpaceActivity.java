package nandanvanlawns.seed.com.nandanvanlawns;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class SpaceActivity extends AppCompatActivity implements OnClickListener {
    ImageButton nandanvan, saraswati;
    Button next, close;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.space);
        nandanvan = (ImageButton) findViewById(R.id.nandanvan);
        saraswati = (ImageButton) findViewById(R.id.saraswati);

        nandanvan.setOnClickListener(this);
        saraswati.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        sp = getSharedPreferences("space", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        if (v.getId() == R.id.nandanvan) {
            editor.putString("nandanvan", null);
            final Dialog custdlg = new Dialog(this);
            custdlg.setContentView(R.layout.showdetails);
            custdlg.setTitle("details");

            Button next = (Button) custdlg.findViewById(R.id.next);
            next.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(this, DateActivity.class);
                    startActivity(i);
                 custdlg.dismiss();
                }
            });
            Button close = (Button) custdlg.findViewById(R.id.close);
            next.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                   custdlg.dismiss();
                }
            });
          custdlg.show();
        }
        if (v.getId() == R.id.saraswati) {
            editor.putString("saraswati", null);
        }


    }

}