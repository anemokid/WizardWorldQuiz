package c4q.nyc.wizardingworldharrypotter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TriviaQuizActivity extends AppCompatActivity {

    private TextView practice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia_quiz);

        practice = (TextView)findViewById(R.id.trivia_p);
        practice.setText("You are now in TriviaActivity");


    }
}
