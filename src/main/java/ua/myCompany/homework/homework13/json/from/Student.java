package ua.myCompany.homework.homework13.json.from;

public class Student {
    private String name;
    private String surname;
    private int group;
    private Faculty faculty;

    public Student(String name, String surname, int group, Faculty faculty) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGroup() {
        return group;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                ", faculty=" + faculty +
                '}';
    }
}
