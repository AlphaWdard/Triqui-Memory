package com.example.parcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class memory extends AppCompatActivity {

   private ImageButton but1,but2,but3;
    private ImageButton but4,but5,but6,but7,but8,but9;
   private  Button st;
   private TextView pl,j1,j2,txt;
   int p1,p2;
    private List<String> in1 = new ArrayList<String>();
    private List<String> in2 = new ArrayList<String>();
    private boolean a;
    private int x=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        txt = (TextView) findViewById(R.id.txt);
        j1 = (TextView) findViewById(R.id.txtp1);
        j2= (TextView) findViewById(R.id.txtp2);
        st = (Button) findViewById(R.id.Start);
        but1 = (ImageButton) findViewById(R.id.btn1);
        but2 = (ImageButton) findViewById(R.id.btn2);
        but3 = (ImageButton) findViewById(R.id.btn3);
        but4 = (ImageButton) findViewById(R.id.btn4);
        but5 = (ImageButton) findViewById(R.id.btn5);
        but6 = (ImageButton) findViewById(R.id.btn6);
        but7 = (ImageButton) findViewById(R.id.btn7);
        but8 = (ImageButton) findViewById(R.id.btn8);
        but9 = (ImageButton) findViewById(R.id.btn9);


        but1.setEnabled(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        but4.setEnabled(false);
        but5.setEnabled(false);
        but6.setEnabled(false);
        but7.setEnabled(false);
        but8.setEnabled(false);
        but9.setEnabled(false);
        pl = (TextView) findViewById(R.id.player);
        pl.setText("PRESIONA START");


    }
    public void Start(View view) {
                    a=true;
                    pl.setText("");
                    but1.setEnabled(true);
                    but2.setEnabled(true);
                    but3.setEnabled(true);
                    but4.setEnabled(true);
                    but5.setEnabled(true);
                    but6.setEnabled(true);
                    but7.setEnabled(true);
                    but8.setEnabled(true);
                    but9.setEnabled(true);
    }

    public void lose() {
        j1.setText(String.valueOf("Jugador 1 =  "+ p2));
        j2.setText(String.valueOf("Jugador 2 =  "+p1));
        but1.setEnabled(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        but4.setEnabled(false);
        but5.setEnabled(false);
        but6.setEnabled(false);
        but7.setEnabled(false);
        but8.setEnabled(false);
        but9.setEnabled(false);

    }
    public void win(){
        String gano ="" ;
        if(x%2==0){
            p1++;
            gano = "GANADOR Jugador 2";
        }else{
            p2++;
            gano = "GANADOR jugador 1";
        }
        pl.setText("PRESIONA START");
        lose();
        st.setText("Reiniciar");
        in1.clear();
        in2.clear();

    }


    protected void agregar(String n){
        String turn;
        in1.add(n);
        a = false;
        in2.clear();
        x++;
        if(x%2==0){
            turn =  "Jugador 1";
        }else{
            turn =  "Jugador 2";
        }

        pl.setText(turn);
    }
    protected boolean pasar(){
        for (int i=0; i< in2.size(); i++){
            if(!in2.get(i).equals(in1.get(i))){
                return false;
            }
        }
        return true;
    }
    protected void validar(String n){
        in2.add(n);
        if(a){
            agregar(n);
        }else if(pasar()) {
            if (in2.size() == in1.size()) {
                a=true;
                pl.setText("Agrega Un Nuevo Valor a la Secuencia");
            }
        } else {
            win();
        }
    }


    public void ver(View view){

                but1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        validar("a");

                    }
                });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar("b");

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar("c");
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar("d");
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar("e");
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar("f");

            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validar("g");

            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar("h");

            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar("i");
            }
        });

    }


}