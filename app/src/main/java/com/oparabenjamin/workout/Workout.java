package com.oparabenjamin.workout;

public class Workout {
    private String name;
    private String description;

    private static final Workout[] workouts = {
            new Workout("The Limb looser", "5 Handstand push-ups\n1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ips\n100 Squats"),
            new Workout("The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length", "500 meter run \n21 x 1.5 pood kettle swing\n21 Pull-ups")
    };

    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}