package exercise.B1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfficerManager {
    private List<Officer> list;

    public OfficerManager() {
        this.list = new ArrayList<>();
    }

    public void add(Officer canBo) {
        this.list.add(canBo);
    }

    public List<Officer> searchOfficerByName(String name) {
        return this.list.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListOfficer() {
        this.list.forEach(o -> System.out.println(o.toString()));
    }
}
