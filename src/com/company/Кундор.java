package com.company;

public enum Кундор {
    ДУЙШОМБУ("жава окуйм"),
    ШЕЙШЕМБИ("англис тил окуйм"),
    ШАРШЕМБИ("софт скиллс окуйм"),
    БЕЙШЕМБИ("кайра жава окуйм"),
    ЖУМА("практика кылам"),
    ИШЕМБИ("тапшырма аткарам"),
    ЖЕКШЕМБИ("жатам жоон эле");

    private String emnekilam;

    Кундор() {
        //empty constructor
    }

    Кундор(String emnekilam) {
        this.emnekilam = emnekilam;
    }

    public String getEmnekilam() {
        return emnekilam;
    }

    public void setEmnekilam(String emnekilam) {
        this.emnekilam = emnekilam;
    }

    @Override
    public String toString() {
        return  emnekilam;
    }
}
