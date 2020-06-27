package com.ferratone.joquempo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectStone(View view) {

        selectedOption(0);

    }

    public void selectPaper(View view) {

        selectedOption(1);

    }

    public void selectScissors(View view) {

        selectedOption(2);

    }

    public void selectedOption(int selectedOptionUser) {

        ImageView viewResult = findViewById(R.id.imageResult);
        TextView textResult = findViewById(R.id.textResult);
        ImageView imageResult = findViewById(R.id.imageRes);

        int valueSelect = new Random().nextInt(3);
        int[] option = {0, 1, 2};
        int optionRobot = option[valueSelect];

        switch (optionRobot) {

            case 0:
                viewResult.setImageResource(R.drawable.stone);
                break;

            case 1:
                viewResult.setImageResource(R.drawable.paper);
                break;

            case 2:
                viewResult.setImageResource(R.drawable.scissors);
                break;

        }


        if (
                (optionRobot == 2 && selectedOptionUser == 1) ||
                        (optionRobot == 1 && selectedOptionUser == 0) ||
                        (optionRobot == 1 && selectedOptionUser == 2)

        ) { /* robot has won */

            textResult.setText("Você perdeu.");
            imageResult.setImageResource(R.drawable.sad);


        } else if (

                (selectedOptionUser == 2 && optionRobot == 1) ||
                        (selectedOptionUser == 1 && optionRobot == 0) ||
                        (selectedOptionUser == 1 && optionRobot == 2)

        ) { /* user has won */

            textResult.setText("Você ganhou.");
            imageResult.setImageResource(R.drawable.happy);

        } else { /* user a tie */

            textResult.setText("Empate.");
            imageResult.setImageResource(R.drawable.atie);

        }
    }
}