package ua.myCompany.lessons.lesson5.inner.classes;

public class Car {
    private static final String CODE = "100";
    private String name;
    private Engine engine;

    public Car(String name, int volume, int code) {
        this.name = name;
        this.engine =  new Engine(volume, code);
    }
    private void outerMethod(){
        System.out.println("Outer method");
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public Car setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public class Engine {
        public int volume;
        int code;

        public Engine(int volume, int code) {
            this.volume = volume;
            this.code = code;
        }
    }
}
