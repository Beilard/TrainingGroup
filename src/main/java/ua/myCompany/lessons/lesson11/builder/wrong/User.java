package ua.myCompany.lessons.lesson11.builder.wrong;

public class User {
    private final String name;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
    }

    public String getName() {
        return name;
    }

    public static class UserBuilder{
        private String name;

        public UserBuilder(){}

        public User builder() {
            return new User(this);
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }
    }
}
