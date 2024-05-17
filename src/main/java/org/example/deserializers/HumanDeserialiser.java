package org.example.deserializers;

import com.google.gson.*;
import org.example.Car;
import org.example.Human;

import java.lang.reflect.Type;

public class HumanDeserialiser  implements JsonDeserializer<Human> {
    @Override
    public Human deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject humanJson = jsonElement.getAsJsonObject();
        Human human = new Human();

        human.setHumanName(humanJson.get("name").getAsString());
        human.setAge(humanJson.get("age").getAsInt());
        human.setCar(jsonDeserializationContext.deserialize(humanJson.get("car"), Car.class));

        return human;
    }
}
