package com.anagualter.appportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyApp = (Button) findViewById(R.id.spotify_streamer);
        Button scoresApp = (Button) findViewById(R.id.scores_app);
        Button libraryApp = (Button) findViewById(R.id.library_app);
        Button biggerApp = (Button) findViewById(R.id.buildbigger_app);
        Button capstoneApp = (Button) findViewById(R.id.capstone);

        context = getApplicationContext();

        spotifyApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This will launch " + getResources().getString(R.string.spotify_streamer), Toast.LENGTH_SHORT).show();
            }
        });

        scoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This will launch " + getResources().getString(R.string.scores_app), Toast.LENGTH_SHORT).show();
            }
        });
        libraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This will launch " + getResources().getString(R.string.library_app), Toast.LENGTH_SHORT).show();
            }
        });
        biggerApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This will launch " + getResources().getString(R.string.buildbigger_app) , Toast.LENGTH_SHORT).show();
            }
        });
        capstoneApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This will launch " + getResources().getString(R.string.capstone), Toast.LENGTH_SHORT).show();
            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
