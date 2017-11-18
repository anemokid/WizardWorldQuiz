package c4q.nyc.wizardingworldharrypotter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SortingQuizActivity extends AppCompatActivity {

    private TextView question_tv; // holds the current question being outputed
    private CheckedTextView choice1_ctv;
    private CheckedTextView choice2_ctv;
    private CheckedTextView choice3_ctv;
    private CheckedTextView choice4_ctv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_quiz);

        createObjects();
        //textView.setText("You're in the Sorting Quiz Activity. ");
    }

    // declare objects + initialize their values:
    public void createObjects(){

        question_tv = (TextView)findViewById(R.id.question);
        choice1_ctv = (CheckedTextView)findViewById(R.id.choice1_ctv);
        choice2_ctv = (CheckedTextView)findViewById(R.id.choice2_ctv);
        choice3_ctv = (CheckedTextView)findViewById(R.id.choice3_ctv);
        choice4_ctv = (CheckedTextView)findViewById(R.id.choice4_ctv);

        //setText:
        // possibleAnswer_1.isChecked()
    }
}
