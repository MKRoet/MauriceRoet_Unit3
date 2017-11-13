package com.example.gebruiker.mauriceroet_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StorypageActivity extends AppCompatActivity {

    // Retrieves the intent from the previous activity.
    // Shows the story that was created by the user input.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storypage);
        Intent intent = getIntent();
        Story story = (Story) intent.getSerializableExtra("story");
        TextView whole_story = findViewById(R.id.whole_story);
        String text = story.toString();
        whole_story.setText(text);
    }

    // Goes back to the first activity when the user clicks on the "MAKE ANOTHER STORY" button.
    public void GoToMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}