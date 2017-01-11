package com.example.enclaveit.floatingactionbutton;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    private ListView listToDoTask;

    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControlsForNullOfPointer();

        if(createValueForTesting()){
                listToDoTask.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,list));
        };
    }

    private boolean createValueForTesting() {
        boolean valid = true;
        list = new ArrayList<String>();
        for(int index = 0;index < 100; index++){
            list.add("Recycle View");
        }
        return valid;
    }

    private void addControlsForNullOfPointer() {
        fab = (FloatingActionButton)this.findViewById(R.id.fab);
        listToDoTask = (ListView)this.findViewById(R.id.listToDo);
    }
}
