package com.example.newschannels;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Item> {
    public CustomAdapter(Context context, int textViewResourceId){
        super(context,textViewResourceId);
    }
    public CustomAdapter(Context context, int resource, List<Item> items){
        super(context,resource,items);
    }
    public View getView(int position,View convertView, ViewGroup parent){
        View v= convertView;
        if(v==null)
        {
            LayoutInflater vi;
            vi= LayoutInflater.from(getContext());
            v=vi.inflate(R.layout.row_item,null);
        }
        Item p= getItem(position);

        if(p!=null) {
            TextView t1 = (TextView) v.findViewById(R.id.textView);
            ImageView i1 = (ImageView) v.findViewById(R.id.imageView);

            if (t1 != null) {
                t1.setText(p.getName());
            }
            if(i1!=null)
            {
                i1.setImageResource(p.getImage());
            }
        }
        return v;
    }
}
