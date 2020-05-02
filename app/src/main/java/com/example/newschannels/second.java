package com.example.newschannels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        int indexString= intent.getExtras().getInt("position");
        int index=indexString;

        if(index==0) {

            ListView lv = (ListView) findViewById(R.id.list_view2);
            ArrayList<Item> itemList = new ArrayList<>();

            itemList.add(new Item("GEO News", R.drawable.geo));
            itemList.add(new Item("Dunya News", R.drawable.dunya));
            itemList.add(new Item("Express News", R.drawable.express));

            CustomAdapter cstAdpter = new CustomAdapter(this, 0, itemList);
            lv.setAdapter(cstAdpter);


            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent subtpeIntent = new Intent(second.this, third.class);
                    subtpeIntent.putExtra("firstindex", 0);
                    subtpeIntent.putExtra("secondindex", i);
                    startActivity(subtpeIntent);
                }
            });
        }


        if(index==1) {

            ListView lv = (ListView) findViewById(R.id.list_view2);
            ArrayList<Item> itemList = new ArrayList<>();

            itemList.add(new Item("ABP Sanjha", R.drawable.abp));
            itemList.add(new Item("Shop CJ", R.drawable.shop));
            itemList.add(new Item("E 24", R.drawable.e));

            CustomAdapter cstAdpter = new CustomAdapter(this, 0, itemList);
            lv.setAdapter(cstAdpter);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent subtpeIntent = new Intent(second.this, third.class);
                    subtpeIntent.putExtra("firstindex", 1);
                    subtpeIntent.putExtra("secondindex", i);
                    startActivity(subtpeIntent);
                }
            });
        }

        if(index==2) {

            ListView lv = (ListView) findViewById(R.id.list_view2);
            ArrayList<Item> itemList = new ArrayList<>();

            itemList.add(new Item("MSNBC", R.drawable.msnbc));
            itemList.add(new Item("CNN", R.drawable.cnn));


            CustomAdapter cstAdpter = new CustomAdapter(this, 0, itemList);
            lv.setAdapter(cstAdpter);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent subtpeIntent = new Intent(second.this, third.class);
                    subtpeIntent.putExtra("firstindex", 2);
                    subtpeIntent.putExtra("secondindex", i);
                    startActivity(subtpeIntent);
                }
            });
        }
    }
}
