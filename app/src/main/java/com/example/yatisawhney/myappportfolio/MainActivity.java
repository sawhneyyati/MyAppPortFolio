package com.example.yatisawhney.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPopularMovies = (Button)findViewById(R.id.buttonPopularMovies);
        Button buttonStockHawk = (Button)findViewById(R.id.buttonStockHawk);
        Button buttonBuildItBigger = (Button)findViewById(R.id.buttonBuildItBigger);
        Button buttonMakeYourAppMaterial = (Button)findViewById(R.id.buttonMakeYourAppMaterial);
        Button buttonGoUbiquitous = (Button)findViewById(R.id.buttonGoUbiquitous);
        Button buttonCapstone = (Button)findViewById(R.id.buttonCapstone);

        final Context context = getApplicationContext();
        final Toast toast;
        final int duration = Toast.LENGTH_SHORT;

        // button click event handling
        assert buttonPopularMovies != null;
        buttonPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.launchPopularMovies, duration).show();
            }
        });

        assert buttonStockHawk != null;
        buttonStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.launchStawkHawk, duration).show();
            }
        });

        assert buttonBuildItBigger != null;
        buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.launchBuildItBigger, duration).show();
            }
        });

        assert buttonMakeYourAppMaterial!=null;
        buttonMakeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.launchMakeYourMaterial, duration).show();
            }
        });



        assert buttonGoUbiquitous != null;
        buttonGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.launchGoUbiquitous, duration).show();
            }
        });



        assert buttonCapstone!=null;
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, R.string.launchCapstone, duration).show();
            }
        });






    }
}
