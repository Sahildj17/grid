package com.example.restaurant_app_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.restaurant_app_gridview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String name[]={"Dal Fry","Jeera Rice","Paneer Masala","Tawa Roti"};
        int icons[]={
                R.drawable.dal_fry,
                R.drawable.jeera_rice,
                R.drawable.paneer_masala,
                R.drawable.tawa_roti
        };
        GridAdapter gridAdapter=new GridAdapter(MainActivity.this, name,icons);
        binding.grid.setAdapter(gridAdapter);

        binding.grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked on : "+name[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}