package com.company;

public enum Day {
    MONDAY("Дуйшомбу жава окуйм"),
    TUESDAY("Шейшемби англис тил окуйм"),
    WEDNESDAY("Шаршемби софт скиллс окуйм"),
    THURSDAY("Бейшемби кайра жава окуйм"),
    FRIDAY("Жума Практика кылам"),
    SATURDAY("Ишемби тамшырма жасайм"),
    SUNDAY("Жекшемби жатам жон эле");

    private String emnekilam;

    Day() {
    }

    Day(String emnekilam) {
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
        return emnekilam;
    }
}
