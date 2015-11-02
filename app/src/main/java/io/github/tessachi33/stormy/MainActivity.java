package io.github.tessachi33.stormy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String apiKey = "f5cc6334f7b3eb4e50bc2b418375041f";
        double latitude = 37.8267;
        double longitude= -122.423;
        String forecastUrl = "https://api.forecast.io/forecast/"+ apiKey +"/" + latitude + "," +longitude;
    }
}
