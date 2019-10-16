package ua.myCompany.homework.homework13.json.from;

public class Faculty {
    private String name;
    private int code;

    public Faculty(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
