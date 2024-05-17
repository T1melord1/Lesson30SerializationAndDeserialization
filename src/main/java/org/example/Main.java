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

        Family family2 = gson.fromJson(json, Family.class);
        System.out.println(family2);
    }
//{
//  "humans": [
//    {
//      "humanName": "Валерий", //todo изменить на name
//      "age": 55,
//      "gender": "М",
//      "car": {
//        "carMark": "Mercedes", //todo change on mark
//        "type": "sedan",
//        "way": 1234 //todo delete
//      }
//    },
//    {
//      "humanName": "Михаил",
//      "age": 19,
//      "gender": "M", //todo delete
//      "car": {
//        "carMark": "Lada",
//        "type": "sedan",
//        "way": 123
//      }
//    }
//  ]
//}
}