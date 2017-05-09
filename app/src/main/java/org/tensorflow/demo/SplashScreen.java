package org.tensorflow.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.doctoror.particlesdrawable.ParticlesDrawable;

/**
 * Created by ashish on 9/5/17.
 */

public class SplashScreen extends Activity {
    public static int SPLASH =3000;
    private final ParticlesDrawable mDrawable = new ParticlesDrawable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_learning);
        findViewById(R.id.view).setBackground(mDrawable);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreen.this, ClassifierActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH);
    }
    @Override
    protected void onStart() {
        super.onStart();
        mDrawable.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mDrawable.stop();
    }
    }

