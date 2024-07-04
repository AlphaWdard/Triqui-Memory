package com.example.parcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class game extends AppCompatActivity {
    ListView list;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Bundle bundle = getIntent().getExtras(); String P1=bundle.getString("mensaje");
        String txtP1= P1;
        list = (ListView) findViewById(R.id.ls); String[] values = new String[]{"Memory","Triqui","Creditos"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,
                values);
        list.setAdapter(adapter); list.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                                                                   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                                       int posicion = position;
                                                                       String itemValue = (String) list.getItemAtPosition(position);
                                                                       switch (posicion) {
                                                                           case 0:
                                                                               intent = new Intent(getApplicationContext(), memory.class);
                                                                               break;
                                                                           case 1:
                                                                               intent = new Intent(getApplicationContext(), triqui.class);
                                                                               break;
                                                                           case 2:
                                                                               intent = new Intent(getApplicationContext(), creditos.class);
                                                                               break;

                                                                       }
                                                                       startActivity(intent);
                                                                   }
                                                               }
        );









    }
}