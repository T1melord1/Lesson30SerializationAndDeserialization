package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Human {

    @SerializedName("name")
    private String humanName;
    private int age;
   transient private String gender;
    private Car car;
}
