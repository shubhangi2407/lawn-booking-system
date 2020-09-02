package nandanvanlawns.seed.com.nandanvanlawns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DateActivity extends AppCompatActivity implements View.OnClickListener{
    Button datebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date);
        datebtn =(Button)findViewById(R.id.datebtn);
        datebtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,RegistrationActivity.class);
        startActivity(i);
    }
}
