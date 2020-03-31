package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {
 LayoutInflater mInflator;
    String[] items;
    String[] prices;
    String[] desc;
    public ItemAdapter(Context c, String[] i,String[] p,String[] d)
    {
        items=i;
        prices=p;
        desc=d;
        mInflator=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= mInflator.inflate(R.layout.my_list_detail,null);
        TextView nameTextView=(TextView) v.findViewById(R.id.nameTextView);
        TextView descTextView=(TextView) v.findViewById(R.id.descTextView);
        TextView priceTextView=(TextView) v.findViewById(R.id.priceTextView);

        String name =items[position];
        String des= desc[position];
        String cost = prices[position];

        nameTextView.setText(name);
        descTextView.setText(des);
        priceTextView.setText(cost);

        return v;
    }
}
