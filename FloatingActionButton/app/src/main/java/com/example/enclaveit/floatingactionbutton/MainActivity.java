package com.example.enclaveit.floatingactionbutton;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControlsForNullOfPointer();
    }

    private void addControlsForNullOfPointer() {
        fab = (FloatingActionButton)this.findViewById(R.id.fab);
    }

    public void showMessageOfMail(View view){
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Test event on click on mobile",Toast.LENGTH_LONG).show();
            }
        });
    }
}
