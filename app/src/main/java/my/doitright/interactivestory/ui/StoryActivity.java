package my.doitright.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import my.doitright.interactivestory.R;
import my.doitright.interactivestory.model.Page;
import my.doitright.interactivestory.model.Story;

public class StoryActivity extends AppCompatActivity {

    //get the name of the class
    public static final String TAG = StoryActivity.class.getSimpleName();

    private Story mStory = new Story();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        //Use ctrl+q to read documentation
        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if (name == null) {
            name = "Friend";
        }
        Log.d(TAG, name);
    }

    private void loadPage(){

    }
}
