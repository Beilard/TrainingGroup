package ua.myCompany.homework.homework13.json.from;


import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        try (Reader reader = new FileReader("D:\\JsonTest\\JsonToStudent.json")) {

            Student student = gson.fromJson(reader, Student.class);

            System.out.println(student);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
