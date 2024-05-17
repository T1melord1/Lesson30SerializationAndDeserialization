package org.example.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.example.Car;

import java.lang.reflect.Type;

public class CarDeserializer implements JsonDeserializer<Car> {
    @Override
    public Car deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Car car = new Car();
        String data = jsonElement.getAsString();
        String mark = data.substring(0, data.indexOf(" "));
        String carType = data.substring(data.indexOf(" ") + 1);
        car.setType(carType);
        car.setCarMark(mark);
        return car;
    }
}
