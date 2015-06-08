package com.fbarzin.portfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private Button spotifyStreamer;
    private Button scoresApp;
    private Button libraryApp;
    private Button buildItBigger;
    private Button xyzReader;
    private Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        spotifyStreamer = (Button) findViewById(R.id.spotifyStreamer);
        spotifyStreamer.setOnClickListener(this);

        scoresApp = (Button) findViewById(R.id.scoreApp);
        scoresApp.setOnClickListener(this);

        libraryApp = (Button) findViewById(R.id.libraryApp);
        libraryApp.setOnClickListener(this);

        buildItBigger = (Button) findViewById(R.id.buildItBigger);
        buildItBigger.setOnClickListener(this);

        xyzReader = (Button) findViewById(R.id.xyzReader);
        xyzReader.setOnClickListener(this);

        capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.spotifyStreamer:
                showToast("Spotify Streamer");
                break;
            case R.id.scoreApp:
                showToast("Scores App");
                break;
            case R.id.libraryApp:
                showToast("Library App");
                break;
            case R.id.buildItBigger:
                showToast("Build It Bigger");
                break;
            case R.id.xyzReader:
                showToast("XYZ Reader");
                break;
            case R.id.capstone:
                showToast("Capstone: My Own App");
                break;
        }

    }

    private void showToast(String message) {
        Toast.makeText(this, "This button will launch " + message, Toast.LENGTH_LONG).show();
    }
}
