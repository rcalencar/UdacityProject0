package com.example.rodrigoalencar.project0;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            CharSequence text = "Settings...";
            shortDurationToast(text);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void shortDurationToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessageSpotifyStreamer(View view) {
        shortDurationToast("Spotify Streamer");
    }

    public void sendMessageSuperDuo(View view) {
        shortDurationToast("Super Duo");
    }

    public void sendMessageBuildItBigger(View view) {
        shortDurationToast("Build It Bigger");
    }

    public void sendMessageXYZReader(View view) {
        shortDurationToast("XYZ Reader");
    }

    public void sendMessageCapstone(View view) {
        shortDurationToast("Capstone");
    }
}
