package com.mangrummicik.blackjack;

/*Activity that will run the app: shuffle up, deal, blackjack check, ect.*/

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class PlayGame extends Activity implements View.OnClickListener{
    private static int deck [] = {R.drawable.ace_clubs, R.drawable.ace_diamonds, R.drawable.ace_hearts, R.drawable.ace_spades,
            R.drawable.clubs_2, R.drawable.clubs_3, R.drawable.clubs_4, R.drawable.clubs_5,
            R.drawable.clubs_6, R.drawable.clubs_7, R.drawable.clubs_8, R.drawable.clubs_9,
            R.drawable.clubs_10, R.drawable.jack_clubs, R.drawable.king_clubs, R.drawable.queen_clubs,
            R.drawable.diamonds_2, R.drawable.diamonds_3, R.drawable.diamonds_4, R.drawable.diamonds_5,
            R.drawable.diamonds_6, R.drawable.diamonds_7, R.drawable.diamonds_8, R.drawable.diamonds_9,
            R.drawable.diamonds_10, R.drawable.jack_diamonds, R.drawable.king_diamonds, R.drawable.queen_diamonds,
            R.drawable.spades_2, R.drawable.spades_3, R.drawable.spades_4, R.drawable.spades_5,
            R.drawable.spades_6, R.drawable.spades_7, R.drawable.spades_8, R.drawable.spades_9,
            R.drawable.spades_10, R.drawable.jack_spades, R.drawable.king_spades, R.drawable.queen_spades,
            R.drawable.hearts_2, R.drawable.hearts_3, R.drawable.hearts_4, R.drawable.hearts_5,
            R.drawable.hearts_6, R.drawable.hearts_7, R.drawable.hearts_8, R.drawable.hearts_9,
            R.drawable.hearts_10, R.drawable.jack_hearts, R.drawable.king_hearts, R.drawable.queen_hearts
            };
    Random r = new Random();
    int deckSize = 52;
    int rand1 = r.nextInt(52);
    int rand2 = r.nextInt(52);
    int hit = 0;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_game);
        ImageView dealer = findViewById(R.id.dealer2);
        ImageView player = findViewById(R.id.player1);

        shuffle(deck);
        shuffle(deck);
        shuffle(deck);
        shuffle(deck);

        player.setImageResource(deck[deckSize-1]);
        deckSize--;
        dealer.setImageResource(getResources().getIdentifier(String.valueOf(deck[deckSize-1]), "drawable", getPackageName()));
        deckSize--;
        player = findViewById(R.id.player2);
        player.setImageResource(getResources().getIdentifier(String.valueOf(deck[deckSize-1]), "drawable", getPackageName()));

        Button b = findViewById(R.id.hit_button);
        b.setOnClickListener(this);

        b = findViewById(R.id.stay_button);
        b.setOnClickListener(this);
    }

    public void onClick(View v){
        ImageView player;
        //int hit = 0;
            if (v.getId() == R.id.hit_button) {
                hit ++;
            }
            if (hit == 1){
                deckSize--;
                player = findViewById(R.id.player3);
                player.setVisibility(View.VISIBLE);
                player.setImageResource(getResources().getIdentifier(String.valueOf(deck[deckSize-1]), "drawable", getPackageName()));
            }
            if (hit == 2){
                deckSize--;
                player = findViewById(R.id.player4);
                player.setVisibility(View.VISIBLE);
                player.setImageResource(getResources().getIdentifier(String.valueOf(deck[deckSize-1]), "drawable", getPackageName()));
            }
            if (hit == 3){
                deckSize--;
                player = findViewById(R.id.player5);
                player.setVisibility(View.VISIBLE);
                player.setImageResource(getResources().getIdentifier(String.valueOf(deck[deckSize-1]), "drawable", getPackageName()));
            }
            if (hit == 4){
                deckSize--;
                player = findViewById(R.id.player6);
                player.setVisibility(View.VISIBLE);
                player.setImageResource(getResources().getIdentifier(String.valueOf(deck[deckSize-1]), "drawable", getPackageName()));
            }
            if (hit == 5){
                deckSize--;
                player = findViewById(R.id.player7);
                player.setVisibility(View.VISIBLE);
                player.setImageResource(getResources().getIdentifier(String.valueOf(deck[deckSize-1]), "drawable", getPackageName()));
            }
    }

    public void shuffle(int shuffled[]){
        for(int j = 0; j < 1000000; j++) {
                int temp = shuffled[rand1];
                shuffled[rand1] = shuffled[rand2];
                shuffled[rand2] = temp;
                rand1 = r.nextInt(52);
                rand2 = r.nextInt(52);
        }
        deck = shuffled;
    }
}
