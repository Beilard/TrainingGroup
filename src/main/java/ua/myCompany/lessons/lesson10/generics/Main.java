package ua.myCompany.lessons.lesson10.generics;

public class Main {
    public static void main(String[] args) {
        Container container1 = new Container("String");
        Container container2 = new Container(1);

        Object strObject = container1.getObject();
        if (strObject instanceof  String) {
            String strObject2 = (String) strObject;
        }
        Object intObject = container2.getObject();

        if (intObject instanceof Number) {
            Integer integerObject = (Integer) intObject;
        }

        //difference between the following, documentation
        GenericContainer<String> genericContainer = new GenericContainer<>("String");
        String object = genericContainer.getObject();
        GenericContainer<Object> genericContainer1 = new GenericContainer<>();
        GenericContainer genericContainer2 = new GenericContainer<>();

        System.out.println(genericContainer.getClass() == genericContainer1.getClass());
    }
}
