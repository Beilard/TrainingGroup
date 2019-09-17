package ua.myCompany.lessons.lesson1.contract;

public class TrainingGroup {
    private int studentCount;
    private String name;

    public TrainingGroup(int studentCount, String name) {
        this.studentCount = studentCount;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TrainingGroup that = (TrainingGroup) obj;
        return studentCount == that.studentCount && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int out = 11;
        out += name.hashCode();
        out += studentCount;
        return out;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getName() {
        return name;
    }

}
