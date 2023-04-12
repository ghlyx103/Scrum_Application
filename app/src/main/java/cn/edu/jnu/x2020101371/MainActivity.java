package cn.edu.jnu.x2020101371;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCaculate = this.findViewById(R.id.button);
        EditText editTextScore = this.findViewById(R.id.editText);
        TextView textViewScore = this.findViewById(R.id.textView);

        buttonCaculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String scores = editTextScore.getText().toString();
                String []arrayScore = scores.split(",");
                BowlingGame game = new BowlingGame();
                for(int i = 0; i < arrayScore.length; i ++)
                {
                    game.roll(Integer.parseInt(arrayScore[i]));
                }
                textViewScore.setText("total score is " + game.score());
            }
        });
    }
}