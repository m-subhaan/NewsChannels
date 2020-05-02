package com.example.newschannels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] awards = {"Pakistani Channels", "Indian Channels", "American Channels"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView awards_list = (ListView) findViewById(R.id.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item_view, awards);
        awards_list.setAdapter(adapter);

        awards_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent subtpeIntent = new Intent(MainActivity.this, second.class);
                subtpeIntent.putExtra("position", i);
                startActivity(subtpeIntent);
            }
        });

    }
}

