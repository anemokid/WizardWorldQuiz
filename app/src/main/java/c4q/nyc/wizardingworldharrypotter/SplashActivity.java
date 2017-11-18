package c4q.nyc.wizardingworldharrypotter;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    // initialize imageview:
    public ImageButton splash_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //sets the splash image view to the Harry Potter widget:
        splash_iv = (ImageButton)findViewById(R.id.splash_imageview);
        splash_iv.setImageResource(R.drawable.wizardingworld);
        onSplashPageClick(splash_iv);
    }

    /**
     * onSplashPageClick() : opens a new activity on click.
     * @param view
     */
    public void onSplashPageClick(View view){
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }


}
