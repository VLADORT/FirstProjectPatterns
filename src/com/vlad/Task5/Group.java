package com.vlad.Task5;

import java.util.ArrayList;
import java.util.List;

public class Group {

    public List<Creature> group = new ArrayList<>();

    void add(Creature creature) {
        creature.setStrategy(new FlyStrategy());
        group.add(creature);
    }

}
