package com.linuxkyrios.trainingapp;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("Rozciąganie kończyn",
                    "5 pompek w staniu na rękach,\n10 przysiadów na ednej nodze,\n15 podciągnięć."),
            new Workout("Ogólna agonia",
                    "100 podciągnięć,\n100 pompek,\n100 brzuszków,\n100 przysiadów."),
            new Workout("Tylko dla mięczaków",
                    "5 podciągnięc,\n10 pompek,\n15 przysiadów."),
            new Workout("Siła i dystans",
                    "Bieg na 500 metrów,\n21 wydźwignięć ciężarka,\n21 podciągnięć."),
            new Workout("Apokalipsa",
                    "500 pompek,\n500 brzuszków,\n500 przysiadów,\n500 podciągnięć")
    };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
