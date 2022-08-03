package exercise.B2;

public class Paper extends Document {
    int day;

    public Paper(int day) {
        this.day = day;
    }

    public Paper(String id, String nxb, int number, int day) {
        super(id, nxb, number);
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "day=" + day +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                '}';
    }
}
