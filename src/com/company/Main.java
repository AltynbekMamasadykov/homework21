package com.company;

public class Main {

    public static void main(String[] args) {


    // solution with foreach

	Кундор[] кундор  = Кундор.values();
        for (Кундор кун: кундор) {
            System.out.println(кун.name()+" "+кун);
        }

        System.out.println("---------------------");

    // switch case solution

    Dni dni = Dni.ВОСКРЕСЕНИЕ;
        switch(dni){
            case ПОНЕДЕЛЬНИК -> System.out.println(Dni.ПОНЕДЕЛЬНИК.name()+" Java");
            case ВТОРНИК -> System.out.println(Dni.ВТОРНИК.name()+" English");
            case СРЕДА -> System.out.println(Dni.СРЕДА.name()+" Soft Skills");
            case ЧЕТВЕРГ -> System.out.println(Dni.ЧЕТВЕРГ.name()+" Again Java");
            case ПЯТНИЦА -> System.out.println(Dni.ПЯТНИЦА.name()+" Practice");
            case СУББОТА -> System.out.println(Dni.СУББОТА.name()+" Homework");
            case ВОСКРЕСЕНИЕ -> System.out.println(Dni.ВОСКРЕСЕНИЕ.name()+" Relax");
        }




    }
}
