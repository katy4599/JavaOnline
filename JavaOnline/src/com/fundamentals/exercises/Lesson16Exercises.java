package com.fundamentals.exercises;

import com.fundamentals.lessons.Lesson16;

public class Lesson16Exercises {

    public enum movieGenres {
        COMEDY, SCIENCE_FICTION, ROMANTIC_COMEDY
    }

    public void myFavoriteGenre(Lesson16Exercises.movieGenres genres) {
        String message = "My favorite movie is ";
        switch (genres) {
            case COMEDY:
                message += "Waterboy";
                break;
            case SCIENCE_FICTION:
                message += "Star Trek";
                break;
            case ROMANTIC_COMEDY:
                message += "Notting Hill";
                break;
        }
        System.out.println(message);
    }
}
