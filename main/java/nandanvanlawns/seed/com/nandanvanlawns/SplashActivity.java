package nandanvanlawns.seed.com.nandanvanlawns;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

      /*  new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i=new Intent(this, EventActivity.class);
                startActivity(i);
                finish();
            }
        }, 2000);*/
    }
}
