package kr.hs.emirim.s2019w34.mirimframetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearPark, linearExo, linearHama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearPark = findViewById(R.id.linear_park);
        linearExo = findViewById(R.id.linear_exo);
        linearHama = findViewById(R.id.linear_hama);

        Button btnPark = findViewById(R.id.btn_park);
        Button btnExo = findViewById(R.id.btn_exo);
        Button btnHama = findViewById(R.id.btn_hama);

        btnPark.setOnClickListener(btnListener);
        btnExo.setOnClickListener(btnListener);
        btnHama.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearPark.setVisibility(View.INVISIBLE);
            linearExo.setVisibility(View.INVISIBLE);
            linearHama.setVisibility(View.INVISIBLE);
            switch (v.getId()){
                case R.id.btn_park:
                    linearPark.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_exo:
                    linearExo.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_hama:
                    linearHama.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}