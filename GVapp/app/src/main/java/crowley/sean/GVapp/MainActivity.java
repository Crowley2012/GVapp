package crowley.sean.GVapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MYMESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "OnCreate");
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGVSU(View view){
        Log.i(TAG, "Open GVSU");
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        view.startAnimation(animScale);
        Intent intent = new Intent(this, GVSU.class);
        startActivity(intent);
    }

    public void openRapidConnect(View view) {
        Log.i(TAG, "Open Rapid Connect");
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        view.startAnimation(animScale);
        Intent intent = new Intent(this, RapidConnect.class);
        startActivity(intent);
    }

    public void openMail(View view) {
        Log.i(TAG, "Open Mail");
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        view.startAnimation(animScale);
        Intent intent = new Intent(this, Mail.class);
        startActivity(intent);
    }

    public void openBlackBoard(View view) {
        Log.i(TAG, "Open Blackboard");
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        view.startAnimation(animScale);
        Intent intent = new Intent(this, Blackboard.class);
        startActivity(intent);
    }

    public void openLibrary(View view) {
        Log.i(TAG, "Open Library");
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        view.startAnimation(animScale);
        Intent intent = new Intent(this, Library.class);
        startActivity(intent);
    }

    public void openPeopleFinder(View view) {
        Log.i(TAG, "Open PeopleFinder");
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        view.startAnimation(animScale);
        Intent intent = new Intent(this, PeopleFinder.class);
        startActivity(intent);
    }

    public void openMyBanner(View view) {
        Log.i(TAG, "Open MyBanner");
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        view.startAnimation(animScale);
        Intent intent = new Intent(this, MyBanner.class);
        startActivity(intent);
    }

    public void openSettings(View view) {
        Log.i(TAG, "Open Settings");
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        view.startAnimation(animScale);
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
