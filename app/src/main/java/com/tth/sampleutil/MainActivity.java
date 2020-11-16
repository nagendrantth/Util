package com.tth.sampleutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.tth.util.InternetConnection;
import com.tth.util.bottomNavigation.view.AdaptableBottomNavigationView;
import com.tth.util.bottomNavigation.view.ViewSwapper;

public class MainActivity extends AppCompatActivity {

    private AdaptableBottomNavigationView bottomNavigationView;
    private ViewSwapperAdapter viewSwapperAdapter;
    private ViewSwapper viewSwapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (AdaptableBottomNavigationView)
                findViewById(R.id.view_bottom_navigation);
        viewSwapper = (ViewSwapper) findViewById(R.id.view_swapper);
        viewSwapperAdapter = new ViewSwapperAdapter(getSupportFragmentManager());
        viewSwapper.setAdapter(viewSwapperAdapter);
        bottomNavigationView.setupWithViewSwapper(viewSwapper);

        if(new InternetConnection().isNetworkAvailable(getApplicationContext())){
            Toast.makeText(getApplicationContext(),"network available",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"please check your network",Toast.LENGTH_SHORT).show();
        }
    }
}