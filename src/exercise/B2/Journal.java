package exercise.B2;

public class Journal extends Document {
    int releaseNum;
    int month;

    public Journal(int releaseNum, int month) {
        this.releaseNum = releaseNum;
        this.month = month;
    }

    public Journal(String id, String nxb, int number, int releaseNum, int month) {
        super(id, nxb, number);
        this.releaseNum = releaseNum;
        this.month = month;
    }

    public int getReleaseNum() {
        return releaseNum;
    }

    public void setReleaseNum(int releaseNum) {
        this.releaseNum = releaseNum;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "releaseNum=" + releaseNum +
                ", month='" + month + '\'' +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                '}';
    }
}
