package ua.myCompany.homework.homework13.json.to;


import com.google.gson.*;


import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Student student = new Student("Ivan", "Popov", 1, new Faculty("CS", 1337));

        try (FileWriter writer = new FileWriter("D:\\JsonTest\\studentToJson.json")) {
            gson.toJson(student, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
