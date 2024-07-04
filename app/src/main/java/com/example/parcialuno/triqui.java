package com.example.parcialuno;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class triqui extends AppCompatActivity implements View.OnClickListener{
    int[] matriz = new int[9];
    ImageView A, B, C, D, E, F, G, H, I;
    TextView player1, player2, empate;
    boolean ganar1, ganar2;
    private static int yo = 0, tu = 0, empates = 0;
    int jugador = 1;
    int estado=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triqui);
        A = (ImageView) findViewById(R.id.A);
        B = (ImageView) findViewById(R.id.B);
        C = (ImageView) findViewById(R.id.C);
        D = (ImageView) findViewById(R.id.D);
        E = (ImageView) findViewById(R.id.E);
        F = (ImageView) findViewById(R.id.F);
        G = (ImageView) findViewById(R.id.G);
        H = (ImageView) findViewById(R.id.H);
        I = (ImageView) findViewById(R.id.I);
        player1 = (TextView) findViewById(R.id.txtplayer1);
        player2 = (TextView) findViewById(R.id.txtplayer2);
        empate = (TextView) findViewById(R.id.txtempate);
        for (int i = 0; i <= 8; i++) {
            matriz[i] = 0;
        }
        A.setOnClickListener(this);
        B.setOnClickListener(this);
        C.setOnClickListener(this);
        D.setOnClickListener(this);
        E.setOnClickListener(this);
        F.setOnClickListener(this);
        G.setOnClickListener(this);
        H.setOnClickListener(this);
        I.setOnClickListener(this);
        borrar();
        actualizarmarcador();
    }

    @Override
    public void onClick(View v) {
        boolean tiro = false;
        switch (v.getId()) {

            case R.id.A:
                if (matriz[0] == 0 && jugador == 1) {
                    A.setImageResource(R.drawable.oval);
                    A.setEnabled(false);
                    matriz[0] = 1;
                    tiro = true;
                }


                if (matriz[0] == 0 && jugador == 2) {
                    A.setImageResource(R.drawable.x__1_);
                    A.setEnabled(false);
                    matriz[0] = 2;
                    tiro = true;
                }
                break;

            case R.id.B:
                if (matriz[1] == 0 && jugador == 1) {
                    B.setImageResource(R.drawable.oval);
                    B.setEnabled(false);
                    matriz[1] = 1;
                    tiro = true;
                }

                if (matriz[1] == 0 && jugador == 2) {
                    B.setImageResource(R.drawable.x__1_);
                    B.setEnabled(false);
                    matriz[1] = 2;
                    tiro = true;

                }
                break;
            case R.id.C:
                if (matriz[2] == 0 && jugador == 1) {
                    C.setImageResource(R.drawable.oval);
                    C.setEnabled(false);
                    matriz[2] = 1;
                    tiro = true;
                }

                if (matriz[2] == 0 && jugador == 2) {
                    C.setImageResource(R.drawable.x__1_);
                    C.setEnabled(false);
                    matriz[2] = 2;
                    tiro = true;

                }
                break;
            case R.id.D:
                if (matriz[3] == 0 && jugador == 1) {
                    D.setImageResource(R.drawable.oval);
                    D.setEnabled(false);
                    matriz[3] = 1;
                    tiro = true;
                }

                if (matriz[3] == 0 && jugador == 2) {
                    D.setImageResource(R.drawable.x__1_);
                    D.setEnabled(false);
                    matriz[3] = 2;
                    tiro = true;

                }
                break;
            case R.id.E:
                if (matriz[4] == 0 && jugador == 1) {
                    E.setImageResource(R.drawable.oval);
                    E.setEnabled(false);
                    matriz[4] = 1;
                    tiro = true;
                }

                if (matriz[4] == 0 && jugador == 2) {
                    E.setImageResource(R.drawable.x__1_);
                    E.setEnabled(false);
                    matriz[4] = 2;
                    tiro = true;

                }
                break;
            case R.id.F:
                if (matriz[5] == 0 && jugador == 1) {
                    F.setImageResource(R.drawable.oval);
                    F.setEnabled(false);
                    matriz[5] = 1;
                    tiro = true;
                }

                if (matriz[5] == 0 && jugador == 2) {
                    F.setImageResource(R.drawable.x__1_);
                    F.setEnabled(false);
                    matriz[5] = 2;
                    tiro = true;

                }
                break;
            case R.id.G:
                if (matriz[6] == 0 && jugador == 1) {
                    G.setImageResource(R.drawable.oval);
                    G.setEnabled(false);
                    matriz[6] = 1;
                    tiro = true;
                }

                if (matriz[6] == 0 && jugador == 2) {
                    G.setImageResource(R.drawable.x__1_);
                    G.setEnabled(false);
                    matriz[6] = 2;
                    tiro = true;

                }
                break;
            case R.id.H:
                if (matriz[7] == 0 && jugador == 1) {
                    H.setImageResource(R.drawable.oval);
                    H.setEnabled(false);
                    matriz[7] = 1;
                    tiro = true;
                }

                if (matriz[7] == 0 && jugador == 2) {
                    H.setImageResource(R.drawable.x__1_);
                    H.setEnabled(false);
                    matriz[7] = 2;
                    tiro = true;

                }
                break;
            case R.id.I:
                if (matriz[8] == 0 && jugador == 1) {
                    I.setImageResource(R.drawable.oval);
                    I.setEnabled(false);
                    matriz[8] = 1;
                    tiro = true;
                }

                if (matriz[8] == 0 && jugador == 2) {
                    I.setImageResource(R.drawable.x__1_);
                    I.setEnabled(false);
                    matriz[8] = 2;
                    tiro = true;

                }
                break;
        }
        if (tiro = true) {


            if (jugador == 1) {
                jugador = 2;
            } else {

                jugador = 1;
            }
            estado++;
            quiengana();
            validar();
        }


    }

    public void borrar() {
        A.setImageResource(R.drawable.circulo_negro);
        B.setImageResource(R.drawable.circulo_negro);
        C.setImageResource(R.drawable.circulo_negro);
        D.setImageResource(R.drawable.circulo_negro);
        E.setImageResource(R.drawable.circulo_negro);
        F.setImageResource(R.drawable.circulo_negro);
        G.setImageResource(R.drawable.circulo_negro);
        H.setImageResource(R.drawable.circulo_negro);
        I.setImageResource(R.drawable.circulo_negro);
        for (int i = 0; i <= 8; i++) {
            matriz[i] = 0;
        }
        ganar1 = false;
        ganar2 = false;

    }

    public void actualizarmarcador() {
        player1.setText("");
        player2.setText("");
        empate.setText("");
        String text1 = String.valueOf(yo);
        String text2 = String.valueOf(tu);
        String text3 = String.valueOf(empates);
        player1.setText(text1);
        player2.setText(text2);
        empate.setText(text3);
    }

    public void validar() {
        if (ganar1 == true) {

            Toast toast = Toast.makeText(this, "Ganador jugador 1", Toast.LENGTH_LONG);
            toast.show();
            yo++;
            reiniciar(this);
        }
        if (ganar2 == true) {

            Toast toast = Toast.makeText(this, "Ganador jugador 2", Toast.LENGTH_LONG);
            toast.show();
            tu++;
            reiniciar(this);
        }
        if (estado==9 && ganar1 == false && ganar2 == false){

            Toast toast = Toast.makeText(this, "empate", Toast.LENGTH_LONG);
            toast.show();
            empates++;
            reiniciar(this);
        }
    }

    public static void reiniciar(Activity actividad) {
        Intent intent = new Intent();
        intent.setClass(actividad, actividad.getClass());
        actividad.startActivity(intent);
        actividad.finish();
    }

    public void quiengana() {
//jugador 1
        if (matriz[0] == 1 && matriz[1] == 1 && matriz[2] == 1) {
            ganar1 = true;
        }
        if (matriz[3] == 1 && matriz[4] == 1 && matriz[5] == 1) {
            ganar1 = true;
        }
        if (matriz[6] == 1 && matriz[7] == 1 && matriz[8] == 1) {
            ganar1 = true;
        }
        if (matriz[0] == 1 && matriz[3] == 1 && matriz[6] == 1) {
            ganar1 = true;
        }
        if (matriz[1] == 1 && matriz[4] == 1 && matriz[7] == 1) {
            ganar1 = true;
        }
        if (matriz[2] == 1 && matriz[5] == 1 && matriz[8] == 1) {
            ganar1 = true;
        }
        if (matriz[2] == 1 && matriz[4] == 1 && matriz[6] == 1) {
            ganar1 = true;
        }
        if (matriz[0] == 1 && matriz[4] == 1 && matriz[8] == 1) {
            ganar1 = true;
        }
        //jugador 2
        if (matriz[0] == 2 && matriz[1] == 2 && matriz[2] == 2) {
            ganar2 = true;
        }
        if (matriz[0] == 2 && matriz[4] == 2 && matriz[5] == 2) {
            ganar2 = true;
        }
        if (matriz[6] == 2 && matriz[7] == 2 && matriz[8] == 2) {
            ganar2 = true;
        }
        if (matriz[0] == 2 && matriz[3] == 2 && matriz[6] == 2) {
            ganar2 = true;
        }
        if (matriz[1] == 2 && matriz[4] == 2 && matriz[7] == 2) {
            ganar2 = true;
        }
        if (matriz[2] == 2 && matriz[5] == 2 && matriz[8] == 2) {
            ganar2 = true;
        }
        if (matriz[2] == 2 && matriz[4] == 2 && matriz[6] == 2) {
            ganar2 = true;
        }
        if (matriz[0] == 2 && matriz[4] == 2 && matriz[8] == 2) {
            ganar2 = true;
        }

    }
}