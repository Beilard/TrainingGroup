package ua.myCompany.consoleApplication.domain;

public class Department {
    private final Long id;
    private final String name;

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
