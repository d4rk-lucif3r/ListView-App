package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
      ListView Lt;
      String[] items;
      String[] prices;
      String[] desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res =getResources();
        Lt =(ListView) findViewById(R.id.List);
        items =res.getStringArray(R.array.items);
prices=res.getStringArray(R.array.prices);
desc=res.getStringArray(R.array.desc);

ItemAdapter itemAdapter =new ItemAdapter(this, items,prices,desc);
Lt.setAdapter(itemAdapter);
Lt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent showDetailActivity = new Intent(getApplicationContext(),DetailActivity.class);
        showDetailActivity.putExtra("com.example.listapp.ITEM_INDEX", position);
       startActivity(showDetailActivity);


    }
});
    }
}
