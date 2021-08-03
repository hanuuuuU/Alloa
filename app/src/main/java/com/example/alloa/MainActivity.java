package com.example.alloa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imprint);

        ImageButton button = (ImageButton)findViewById(R.id.neckOpen);
        LinearLayout layout = (LinearLayout)findViewById(R.id.necklace);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(layout.getVisibility() == layout.GONE){
                    layout.setVisibility(layout.VISIBLE);
                    button.setImageResource(R.drawable.close);
                }
                else{
                    layout.setVisibility(layout.GONE);
                    button.setImageResource(R.drawable.open);
                }

            }
        });
    }


}