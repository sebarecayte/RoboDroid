package dais.unive.it.robot.ActivityApp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.IOException;


import dais.unive.it.robot.R;
import it.unive.dais.legodroid.lib.EV3;
import it.unive.dais.legodroid.lib.comm.BluetoothConnection;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main Activity";
    private static int TIME_OUT = 1000;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Start button that leads to MenuActivity
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        });
        //hello

        //TODO da attivare
        /*
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        try{
            EV3 ev3 = new EV3(new BluetoothConnection("EV3").connect());
            new Handler().postDelayed(() -> {
                Intent i = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(i);
                finish();
            }, TIME_OUT);
        }
        catch(IOException e ){
            Log.e(TAG, "fatal error: cannot connect to EV3");
            e.printStackTrace();
        }
        */

    }
}
//Toast visione messaggio su dispositivo.
/*
interfaccia asyncVChannel aggiunto isConnected, implementato in spooledAsyncChannel, richiamato in ev3
 */