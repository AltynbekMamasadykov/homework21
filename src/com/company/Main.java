package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Day[] days = Day.values();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day");
        String dayName = scanner.nextLine();

        for (Day day:days) {
            if(day.name().equalsIgnoreCase(dayName)){
                System.out.println(day);
            }
        }





    }
}
