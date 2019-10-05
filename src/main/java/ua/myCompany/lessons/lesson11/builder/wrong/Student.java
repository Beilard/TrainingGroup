package ua.myCompany.lessons.lesson11.builder.wrong;

public class Student extends User {
    private final String email;

    public Student(StudentBuilder studentBuilder) {
        super(studentBuilder);
        this.email = studentBuilder.email;
    }

    public String getEmail() {
        return email;
    }

    public static class StudentBuilder extends UserBuilder {
        private String email;

        public StudentBuilder() {
        }

        @Override
        public User builder() {
            return new Student(this);
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
    }
}
