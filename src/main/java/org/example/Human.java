package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Human {
    private String humanName;
    private int age;
    private String gender;
    private Car car;
}
