package exercise.B4;

import java.util.ArrayList;
import java.util.List;

public class Family {
    int numberPerson;
    int number;
    List<Person> personList;

    public Family(int numberPerson, int number) {
        this.numberPerson = numberPerson;
        this.number = number;
        this.personList = new ArrayList<>();
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Family{" +
                "numberPerson=" + numberPerson +
                ", number=" + number +
                ", personList=" + personList +
                '}' + "\n";
    }
}
