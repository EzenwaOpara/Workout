package com.oparabenjamin.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        WorkoutDetailFragment frag = (WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);

        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag.setWorkoutId(workoutId);

//        CharSequence text = "Detail Activity onCreate";
//        int duration = Toast.LENGTH_SHORT;
//        Toast toast =  Toast.makeText(this, text, duration);
//        toast.show();
    }
}
