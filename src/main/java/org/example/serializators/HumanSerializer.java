package org.example.serializators;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.example.Human;

import java.lang.reflect.Type;

public class HumanSerializer implements JsonSerializer<Human> {
    @Override
    public JsonElement serialize(Human human, Type type, JsonSerializationContext context) {

        JsonObject humanObject = new JsonObject();
        humanObject.addProperty("name", human.getHumanName());
        humanObject.addProperty("age", human.getAge());
        humanObject.add("car", context.serialize(human.getCar()));
        return humanObject;
    }
}
