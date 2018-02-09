package com.mangrummicik.blackjack;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*To display info about the authors and the app*/

public class AuthorAppInfo extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);
        Button b = findViewById(R.id.menuButton);
        b.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId() == R.id.menuButton){
            finish();
        }
    }
}
