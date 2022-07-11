package com.example.menduhdedemloto;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Arrays;
import android.widget.Button;
import android.widget.TextView;
import android.view.*;
import android.view.View.OnClickListener;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button sayisal_button, sans_top_button, super_lotto_button;
    TextView sayisal_txt, sans_topu_txt, super_loto_txt;
    TextView sayisal_sonuc_txt, sans_topu_sonuc_txt, super_loto_sonuc_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buttons
        sayisal_button = (Button) findViewById(R.id.sayisal_loto_btn);
        sans_top_button = (Button) findViewById(R.id.sans_topu_btn);
        super_lotto_button = (Button) findViewById(R.id.super_loto_btn);

        // text views
        sayisal_txt = (TextView) findViewById(R.id.sayisal_loto_txt);
        sans_topu_txt = (TextView) findViewById(R.id.sans_topu_txt);
        super_loto_txt = (TextView) findViewById(R.id.super_loto_txt);

        // text view sonuclar
        sayisal_sonuc_txt = (TextView) findViewById(R.id.sayisal_sonuc_txt);
        sans_topu_sonuc_txt = (TextView) findViewById(R.id.sans_topu_sonuc_txt);
        super_loto_sonuc_txt = (TextView) findViewById(R.id.super_loto_sonuc_txt);

        sans_top_button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // method
                // method
                final int min = 1;
                final int max = 34;
                int[] random_sans_topu = new int[5];
                int random_num;

                for (int i = 0; i < 5; i++) {
                    random_num = new Random().nextInt((max - min) + 1) + min;
                    for (int x = 0; x < i; x++) {
                        if (random_sans_topu[x] == random_num) // Here, code checks if same random number generated before.
                        {
                            random_num = (int) (Math.random() * 50);// If random number is same, another number generated.
                            x = -1; // restart the loop
                        }
                    }

                    random_sans_topu[i] = random_num;
                }
                Random rand = new Random();
                // Generate random integers in range 0 to 999
                int sansTopu_extra = new Random().nextInt((14 - 1) + 1) + 1;

                sans_topu_sonuc_txt.setText(Arrays.toString(random_sans_topu) + "+" + sansTopu_extra);

            }
        });

        sayisal_button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // method
                final int min = 1;
                final int max = 90;
                int[] random_sayisal_topu = new int[6];
                int random_num;  

                for (int i = 0; i < 6; i++) {
                    random_num = new Random().nextInt((max - min) + 1) + min;
                    for (int x = 0; x < i; x++) {
                        if (random_sayisal_topu[x] == random_num) // Here, code checks if same random number generated before.
                        {
                            random_num = (int) (Math.random() * 50);// If random number is same, another number generated.
                            x = -1; // restart the loop
                        }
                    }

                    random_sayisal_topu[i] = random_num;
                }
                sayisal_sonuc_txt.setText(Arrays.toString(random_sayisal_topu));
            }
        });

        super_lotto_button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // method
                // method
                final int min = 1;
                final int max = 60;
                int[] random_sayisal_topu = new int[6];
                int random_num;

                for (int i = 0; i < 6; i++) {
                    random_num = new Random().nextInt((max - min) + 1) + min;
                    for (int x = 0; x < i; x++) {
                        if (random_sayisal_topu[x] == random_num) // Here, code checks if same random number generated before.
                        {
                            random_num = (int) (Math.random() * 50);// If random number is same, another number generated.
                            x = -1; // restart the loop
                        }
                    }

                    random_sayisal_topu[i] = random_num;
                }
                super_loto_sonuc_txt.setText(Arrays.toString(random_sayisal_topu));
            }
        });



    }
}