package school;

import java.util.ArrayList;

public class School {
    private final ArrayList<Human> people = new ArrayList<>();

    public String getPeoplesInSchool() {
        StringBuilder result = new StringBuilder("В школе:\n");
        for (var human : people) {
            if (human.isInSchool())
                result.append(human.toString()).append("\n");
        }

        return result.toString();
    }

    public void add(Human human) {
        if (!people.contains(human)) people.add(human);

        human.goInSchool();
    }

    public void remove(Human human) {
        human.outFromSchool();
    }
}