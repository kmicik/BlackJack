package com.mangrummicik.blackjack;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton b = findViewById(R.id.play_button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), PlayGame.class);
                startActivity(intent);
            }
        });
        b = findViewById(R.id.about_button);
        b.setOnClickListener(this);
        b = findViewById(R.id.how_button);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToWebSite("https://en.wikipedia.org/wiki/Blackjack");
            }
        });
    }
    public void goToWebSite(String url){
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    public void onClick(View v){
        if(v.getId() == R.id.about_button) {
            Intent intent = new Intent(getApplicationContext(), AuthorAppInfo.class);
            startActivity(intent);
        }
    }
}
