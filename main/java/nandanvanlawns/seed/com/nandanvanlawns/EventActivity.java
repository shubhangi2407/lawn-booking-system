package nandanvanlawns.seed.com.nandanvanlawns;

import android.content.Context;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EventActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton bday,wedding,engagement,naming,reception,corporate,other;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);

        bday =(ImageButton)findViewById(R.id.bday);
        wedding =(ImageButton)findViewById(R.id.wedding);
        engagement =(ImageButton)findViewById(R.id.ring);
        naming =(ImageButton)findViewById(R.id.naming);
        reception =(ImageButton)findViewById(R.id.reception);
        corporate =(ImageButton)findViewById(R.id.corporate);
        other=(ImageButton)findViewById(R.id.other);

        bday.setOnClickListener(this);
        wedding.setOnClickListener(this);
        engagement.setOnClickListener(this);
        naming.setOnClickListener(this);
        reception.setOnClickListener(this);
        corporate.setOnClickListener(this);
        other.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
       Intent intent = new Intent(this,EventActivity.class);
        SharedPreferences sp = this.getSharedPreferances("event", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        if(v.getId()==R.id.bday) {
            editor.putString("bday",null);
        }
        if(v.getId()==R.id.wedding) {
            editor.putString("wedding", null);
        }
            if(v.getId()==R.id.ring) {
                editor.putString("ring", null);
            }
        if(v.getId()==R.id.reception) {
            editor.putString("reception", null);
        }
        if(v.getId()==R.id.corporate) {
            editor.putString("corporate", null);
        }
        if(v.getId()==R.id.naming) {
            editor.putString("naming", null);
        }
        if(v.getId()==R.id.other) {
            editor.putString("other", null);
        }

    }



}
