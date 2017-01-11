package com.example.enclaveit.floatingactionbutton;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControlsForNullOfPointer();
    }

    private void addControlsForNullOfPointer() {
        fab = (FloatingActionButton)this.findViewById(R.id.fab);

        toolbar = (Toolbar)this.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_navigation);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Test OnClick Event",Toast.LENGTH_LONG).show();
            }
        });
        this.setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar,menu);
        return true;
    }
}
