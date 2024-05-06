package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Family {
    private List<Human> humans;

    public void addHuman(Human human) {
        if(humans == null) {
            humans = new ArrayList<>();
        }
        humans.add(human);
    }
}
