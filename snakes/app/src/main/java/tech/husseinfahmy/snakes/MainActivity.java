package tech.husseinfahmy.snakes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button startButton = (Button) findViewById(R.id.startButton);

        startButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(v.getContext(), GameActivity.class);
                        startActivity(intent);
                    }
                }

        );
    }
}
