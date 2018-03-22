package com.example.dawid.zgadywanka;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv21, iv22, iv23, iv24, iv25, iv26, iv27, iv28;

    Integer[] tablicaKart = {1, 2, 3, 4, 5, 6, 7, 8, 21, 22, 23, 24, 25, 26, 27, 28};

    int obrazek1, obrazek2, obrazek3, obrazek4, obrazek5, obrazek6, obrazek7, obrazek8;
    int obrazek21, obrazek22, obrazek23, obrazek24, obrazek25, obrazek26, obrazek27, obrazek28;

    int prob, poczprob;
    String proby;
    int pierwszaKarta, drugaKarta;
    int wcisnietaPierwsza, wcisnietaDruga;
    int numerKarty=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            prob = extras.getInt("Proby");
            poczprob=prob;
        }else if (extras == null)
        {
            prob=40;
            poczprob=40;
        }

        tv = (TextView) findViewById(R.id.textView2);
        proby=String.valueOf(prob);
        tv.setText(proby);

        iv1 = (ImageView) findViewById(R.id.imageView);
        iv2 = (ImageView) findViewById(R.id.imageView1);
        iv3 = (ImageView) findViewById(R.id.imageView2);
        iv4 = (ImageView) findViewById(R.id.imageView3);
        iv5 = (ImageView) findViewById(R.id.imageView4);
        iv6 = (ImageView) findViewById(R.id.imageView5);
        iv7 = (ImageView) findViewById(R.id.imageView6);
        iv8 = (ImageView) findViewById(R.id.imageView7);
        iv21 = (ImageView) findViewById(R.id.imageView8);
        iv22 = (ImageView) findViewById(R.id.imageView9);
        iv23 = (ImageView) findViewById(R.id.imageView10);
        iv24 = (ImageView) findViewById(R.id.imageView11);
        iv25 = (ImageView) findViewById(R.id.imageView12);
        iv26 = (ImageView) findViewById(R.id.imageView13);
        iv27 = (ImageView) findViewById(R.id.imageView14);
        iv28 = (ImageView) findViewById(R.id.imageView15);

        iv1.setTag("0");
        iv2.setTag("1");
        iv3.setTag("2");
        iv4.setTag("3");
        iv5.setTag("4");
        iv6.setTag("5");
        iv7.setTag("6");
        iv8.setTag("7");
        iv21.setTag("8");
        iv22.setTag("9");
        iv23.setTag("10");
        iv24.setTag("11");
        iv25.setTag("12");
        iv26.setTag("13");
        iv27.setTag("14");
        iv28.setTag("15");

        wczytajKarty();

        Collections.shuffle(Arrays.asList(tablicaKart));

        iv1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv1, karat);
            }
        });

        iv2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv2, karat);
            }
        });

        iv3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv3, karat);
            }
        });

        iv4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv4, karat);
            }
        });

        iv5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv5, karat);
            }
        });

        iv6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv6, karat);
            }
        });

        iv7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv7, karat);
            }
        });

        iv8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv8, karat);
            }
        });

        iv21.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv21, karat);
            }
        });

        iv22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv22, karat);
            }
        });

        iv23.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv23, karat);
            }
        });

        iv24.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv24, karat);
            }
        });

        iv25.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv25, karat);
            }
        });

        iv26.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv26, karat);
            }
        });

        iv27.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv27, karat);
            }
        });

        iv28.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int karat = Integer.parseInt((String) view.getTag());
                robcos(iv28, karat);
            }
        });
    }

    private void robcos(ImageView iv, int karta){
        if(tablicaKart[karta]==1) {
            iv.setImageResource(obrazek1);
        }else if(tablicaKart[karta]==2){
            iv.setImageResource(obrazek2);
        }else if(tablicaKart[karta]==3){
            iv.setImageResource(obrazek3);
        }else if(tablicaKart[karta]==4){
            iv.setImageResource(obrazek4);
        }else if(tablicaKart[karta]==5){
            iv.setImageResource(obrazek5);
        }else if(tablicaKart[karta]==6){
            iv.setImageResource(obrazek6);
        }else if(tablicaKart[karta]==7){
            iv.setImageResource(obrazek7);
        }else if(tablicaKart[karta]==8){
            iv.setImageResource(obrazek8);
        }else if(tablicaKart[karta]==21){
            iv.setImageResource(obrazek21);
        }else if(tablicaKart[karta]==22){
            iv.setImageResource(obrazek22);
        }else if(tablicaKart[karta]==23){
            iv.setImageResource(obrazek23);
        }else if(tablicaKart[karta]==24){
            iv.setImageResource(obrazek24);
        }else if(tablicaKart[karta]==25){
            iv.setImageResource(obrazek25);
        }else if(tablicaKart[karta]==26){
            iv.setImageResource(obrazek26);
        }else if(tablicaKart[karta]==27){
            iv.setImageResource(obrazek27);
        }else if(tablicaKart[karta]==28) {
            iv.setImageResource(obrazek28);
        }

        if(numerKarty==1)
        {
            pierwszaKarta = tablicaKart[karta];
            if(pierwszaKarta>20){
                pierwszaKarta=pierwszaKarta-20;
            }
            numerKarty=2;
            wcisnietaPierwsza=karta;

            iv.setEnabled(false);
        }else if (numerKarty==2){
            drugaKarta=tablicaKart[karta];
            if(drugaKarta>20){
                drugaKarta=drugaKarta-20;
            }
            numerKarty=1;
            wcisnietaDruga=karta;

            iv1.setEnabled(false);
            iv2.setEnabled(false);
            iv3.setEnabled(false);
            iv4.setEnabled(false);
            iv5.setEnabled(false);
            iv6.setEnabled(false);
            iv7.setEnabled(false);
            iv8.setEnabled(false);
            iv21.setEnabled(false);
            iv22.setEnabled(false);
            iv23.setEnabled(false);
            iv24.setEnabled(false);
            iv25.setEnabled(false);
            iv26.setEnabled(false);
            iv27.setEnabled(false);
            iv28.setEnabled(false);


            new CountDownTimer(300, 100) {

                public void onTick(long millisUntilFinished) {

                }

                public void onFinish() {
                    sprawdz();
                }
            }.start();
        }
    }


    private void sprawdz()
    {
        if(pierwszaKarta==drugaKarta)
        {
            if(wcisnietaPierwsza == 0)
            {
                iv1.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 1) {
                iv2.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 2) {
                iv3.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 3) {
                iv4.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 4) {
                iv5.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 5) {
                iv6.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 6) {
                iv7.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 7) {
                iv8.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 8) {
                iv21.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 9) {
                iv22.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 10) {
                iv23.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 11) {
                iv24.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 12) {
                iv25.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 13) {
                iv26.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 14) {
                iv27.setVisibility(View.INVISIBLE);
            } else if(wcisnietaPierwsza == 15) {
                iv28.setVisibility(View.INVISIBLE);
            }


            if(wcisnietaDruga == 0)
            {
                iv1.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 1) {
                iv2.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 2) {
                iv3.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 3) {
                iv4.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 4) {
                iv5.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 5) {
                iv6.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 6) {
                iv7.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 7) {
                iv8.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 8) {
                iv21.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 9) {
                iv22.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 10) {
                iv23.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 11) {
                iv24.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 12) {
                iv25.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 13) {
                iv26.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 14) {
                iv27.setVisibility(View.INVISIBLE);
            } else if(wcisnietaDruga == 15) {
                iv28.setVisibility(View.INVISIBLE);
            }
        }else
        {
            prob--;
            proby=String.valueOf(prob);
            tv.setText(proby);

            iv1.setImageResource(R.drawable.obrazek0);
            iv2.setImageResource(R.drawable.obrazek0);
            iv3.setImageResource(R.drawable.obrazek0);
            iv4.setImageResource(R.drawable.obrazek0);
            iv5.setImageResource(R.drawable.obrazek0);
            iv6.setImageResource(R.drawable.obrazek0);
            iv7.setImageResource(R.drawable.obrazek0);
            iv8.setImageResource(R.drawable.obrazek0);
            iv21.setImageResource(R.drawable.obrazek0);
            iv22.setImageResource(R.drawable.obrazek0);
            iv23.setImageResource(R.drawable.obrazek0);
            iv24.setImageResource(R.drawable.obrazek0);
            iv25.setImageResource(R.drawable.obrazek0);
            iv26.setImageResource(R.drawable.obrazek0);
            iv27.setImageResource(R.drawable.obrazek0);
            iv28.setImageResource(R.drawable.obrazek0);
        }

        iv1.setEnabled(true);
        iv2.setEnabled(true);
        iv3.setEnabled(true);
        iv4.setEnabled(true);
        iv5.setEnabled(true);
        iv6.setEnabled(true);
        iv7.setEnabled(true);
        iv8.setEnabled(true);
        iv21.setEnabled(true);
        iv22.setEnabled(true);
        iv23.setEnabled(true);
        iv24.setEnabled(true);
        iv25.setEnabled(true);
        iv26.setEnabled(true);
        iv27.setEnabled(true);
        iv28.setEnabled(true);

        koniec();
        koniecpkt();
    }


    private void koniec()
    {
        if(iv1.getVisibility() == View.INVISIBLE &&
                iv2.getVisibility() == View.INVISIBLE &&
                iv3.getVisibility() == View.INVISIBLE &&
                iv4.getVisibility() == View.INVISIBLE &&
                iv5.getVisibility() == View.INVISIBLE &&
                iv6.getVisibility() == View.INVISIBLE &&
                iv7.getVisibility() == View.INVISIBLE &&
                iv8.getVisibility() == View.INVISIBLE &&
                iv21.getVisibility() == View.INVISIBLE &&
                iv22.getVisibility() == View.INVISIBLE &&
                iv23.getVisibility() == View.INVISIBLE &&
                iv24.getVisibility() == View.INVISIBLE &&
                iv25.getVisibility() == View.INVISIBLE &&
                iv26.getVisibility() == View.INVISIBLE &&
                iv27.getVisibility() == View.INVISIBLE &&
                iv28.getVisibility() == View.INVISIBLE )
        {
            AlertDialog.Builder aleBuilder = new AlertDialog.Builder(MainActivity.this);
            aleBuilder
                    .setMessage("GRATULACJE ukończyłeś poziom")
                    .setCancelable(false)
                    .setPositiveButton("Następna", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                            intent.putExtra("Proby", poczprob-5);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Wyjście", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = aleBuilder.create();
            aleBuilder.show();
        }
    }


    private void koniecpkt()
    {
        if(prob<=0)
        {
            AlertDialog.Builder aleBuilder = new AlertDialog.Builder(MainActivity.this);
            aleBuilder
                    .setMessage("Porażka. Wykorzystałeś wszystkie próby")
                    .setCancelable(false)
                    .setPositiveButton("Nowa Gra", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Wyjście", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = aleBuilder.create();
            aleBuilder.show();
        }
    }


    private void wczytajKarty(){
        obrazek1 = R.drawable.obrazek1;
        obrazek2 = R.drawable.obrazek2;
        obrazek3 = R.drawable.obrazek3;
        obrazek4 = R.drawable.obrazek4;
        obrazek5 = R.drawable.obrazek5;
        obrazek6 = R.drawable.obrazek6;
        obrazek7 = R.drawable.obrazek7;
        obrazek8 = R.drawable.obrazek8;
        obrazek21 = R.drawable.obrazek21;
        obrazek22 = R.drawable.obrazek22;
        obrazek23 = R.drawable.obrazek23;
        obrazek24 = R.drawable.obrazek24;
        obrazek25 = R.drawable.obrazek25;
        obrazek26 = R.drawable.obrazek26;
        obrazek27 = R.drawable.obrazek27;
        obrazek28 = R.drawable.obrazek28;
    }
}
