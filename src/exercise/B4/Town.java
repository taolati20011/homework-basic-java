package exercise.B4;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Family> familyList;

    public Town() {
        this.familyList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Town{" +
                "familyList=" + familyList.toString() +
                '}';
    }
}
