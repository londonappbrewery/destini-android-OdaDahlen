package com.londonappbrewery.destini;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mbuttontop;
    Button mbuttonbottom;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        mbuttontop = (Button) findViewById(R.id.buttonTop);
        mbuttonbottom = (Button) findViewById(R.id.buttonBottom);

        mbuttontop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTextViewTop();
            }
        });

        mbuttonbottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTextViewBottom();

            }
        });

    }

        private void updateTextViewTop(){
        if(mStoryIndex == 1 | mStoryIndex == 2) {
            mStory.setText(R.string.T3_Story);
            mbuttontop.setText(R.string.T3_Ans1);
            mbuttonbottom.setText(R.string.T3_Ans2);
            mStoryIndex = 3;
        } else if (mStoryIndex == 3) {
            mStory.setText(R.string.T6_End);
            mbuttontop.setVisibility(View.GONE);
            mbuttonbottom.setVisibility(View.GONE);
            mStoryIndex = 6;
        }
    }

    private void updateTextViewBottom(){
        if(mStoryIndex == 1) {
            mStory.setText(R.string.T2_Story);
            mbuttontop.setText(R.string.T2_Ans1);
            mbuttonbottom.setText(R.string.T2_Ans2);
            mStoryIndex = 2;
        } else if(mStoryIndex == 2){
            mStory.setText(R.string.T4_End);
            mbuttontop.setVisibility(View.GONE);
            mbuttonbottom.setVisibility(View.GONE);
            mStoryIndex = 4;
        } else if(mStoryIndex == 3){
            mStory.setText(R.string.T5_End);
            mbuttontop.setVisibility(View.GONE);
            mbuttonbottom.setVisibility(View.GONE);
        }
    }

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:



}
