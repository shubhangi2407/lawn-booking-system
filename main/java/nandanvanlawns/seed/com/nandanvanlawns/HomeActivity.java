package nandanvanlawns.seed.com.nandanvanlawns;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton bday,wedding,engagement,naming,reception,corporate,other;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

bday =(ImageButton)findViewById(R.id.bday);


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
        SharedPreferences sp = getSharedPreferences("event", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        if(v.getId()==R.id.bday) {
            editor.putString("bday",null);
        }
            Intent i = new Intent(this, SpaceActivity.class);
            startActivity(i);
    }
}

