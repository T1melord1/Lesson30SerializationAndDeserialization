package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes", "sedan", 1234);
        Car lada = new Car("Lada", "sedan", 123);

        Human father = new Human("Валерий", 55, "М", mercedes);
        Human son = new Human("Михаил", 19, "M", lada);

        Family family = new Family();
        family.addHuman(father);
        family.addHuman(son);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(family);
        System.out.println(json);
    }
}