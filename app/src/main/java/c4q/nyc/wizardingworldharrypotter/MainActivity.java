package c4q.nyc.wizardingworldharrypotter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    //instantiate objects:
    private Button sortingQuiz_b;
    private Button characterQuiz_b; // [ tester class ]
    private Button patronusQuiz_b;
    private Button trivia_b;     // [ recycler view ]
    TextView sortingQuiz_tv;
    TextView characterQuiz_tv;
    TextView patronusQuiz_tv;
    TextView trivia_tv;
    TextView welcome_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createObjects();
        onButtonClick();
    }

    //declare objects + initialize their values :
    public void createObjects(){

        // button objects :
        sortingQuiz_b = (Button)findViewById(R.id.sortingQuiz_button);
        characterQuiz_b = (Button)findViewById(R.id.characterQuiz_button);
        patronusQuiz_b = (Button)findViewById(R.id.patronusQuiz_button);
        trivia_b = (Button)findViewById(R.id.trivia_button);

        // textview objects :
        sortingQuiz_tv = (TextView)findViewById(R.id.sortingQuiz_textview);
        characterQuiz_tv = (TextView)findViewById(R.id.characterQuiz_textview);
        patronusQuiz_tv = (TextView)findViewById(R.id.patronusQuiz_textview);
        trivia_tv = (TextView)findViewById(R.id.trivia_textview);
        welcome_tv = (TextView)findViewById(R.id.welcome_textview);

    }

    /**
     *    onButtonClick(): start new activities bases on user onClick
     *    - Sorting Quiz =
     */
    public void onButtonClick(){

        // sortingQuiz button onClick() leads to the Sorting Quiz Activity :
        sortingQuiz_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SortingQuizActivity.class );
                startActivity(intent);

            }
        });

        // characterQuiz button onClick leads to the Character Quiz Activity:
        characterQuiz_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //declare an intent : to pass the user to the characterQuizActivity:
                Intent intent = new Intent(MainActivity.this, CharacterQuizActivity.class);
                startActivity(intent);

            }
        });

        // patronusQuiz button onClick leads to the Patronus Quiz Activity:
        patronusQuiz_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //declare an intent : that passes the user to the patronusQuizActivity:
                Intent intent = new Intent(MainActivity.this, PatronusQuizActivity.class);
                startActivity(intent);
            }
        });

        // triviaQuiz button onClick leads to the Harry Potter Trivia [ Recycler View ] Activity:
        trivia_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //declare an intent: that passes the user to the TriviaQuizActivity:
                Intent intent = new Intent(MainActivity.this, TriviaQuizActivity.class);
                startActivity(intent);
            }
        });


    } //ends onClick()
} // ends MainActivity


/*

= = = = ON BUTTON CLICK METHODS : =====
public void onButtonClick(){
        sortingQuiz_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sortingQuiz_b.setText("shut up");
            }
        });

        patronusQuiz_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                patronusQuiz_b.setBackgroundColor(getResources().getColor(R.color.colorBloodRed));
            }
        });
    }

 */
