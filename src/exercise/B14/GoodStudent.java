package exercise.B14;

public class GoodStudent extends Student {
    double gpa;
    String bestRewardName;

    public GoodStudent(double gpa, String bestRewardName) {
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, int gradeLevel, double gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public GoodStudent(Student student) {
        super(student.fullName, student.doB, student.sex, student.phoneNumber, student.universityName, student.gradeLevel);
        if (student instanceof GoodStudent) {
            this.gpa = ((GoodStudent) student).gpa;
            this.bestRewardName = ((GoodStudent) student).bestRewardName;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public String ShowMyInfor() {
        return "GoodStudent{" +
                "gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
}
