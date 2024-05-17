package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.deserializers.CarDeserializer;
import org.example.deserializers.HumanDeserialiser;
import org.example.serializators.CarSerializer;
import org.example.serializators.HumanSerializer;

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
                .registerTypeAdapter(Car.class, new CarSerializer())
                .registerTypeAdapter(Human.class, new HumanSerializer())
                .registerTypeAdapter(Car.class, new CarDeserializer())
                .registerTypeAdapter(Human.class, new HumanDeserialiser())
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
//      "car": {                    //todo store as string
//        "carMark": "Mercedes", //todo change on mark
//        "type": "sedan",
//        "way": 1234 //todo delete
//      }
//    },
//    {
//      "humanName": "Михаил",
//      "age": 19,
//      "gender": "M", //todo delete
//      "car": {        //todo store as string
//        "carMark": "Lada",
//        "type": "sedan",
//        "way": 123
//      }
//    }
//  ]
//}
}