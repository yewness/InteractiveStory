package my.doitright.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import my.doitright.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    //declare the variables
    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the id from the layout to assign as m-variables
        mNameField = (EditText)findViewById(R.id.nameEditText);
        mStartButton = (Button)findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //name from editable string to regular string
                String name = mNameField.getText().toString();
                //this to refer View.OnClickListener (attribute)
                startStory(name);

                //Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
                //Intent intent = new Intent(MainActivity.this, StoryActivity.class); -> method in a method
                //startActivity(intent);
            }
        });
    }

    private void startStory(String name) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNameField.setText("John Doe");
    }
}
