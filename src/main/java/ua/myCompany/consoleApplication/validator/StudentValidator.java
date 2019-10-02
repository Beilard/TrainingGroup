package ua.myCompany.consoleApplication.validator;

import ua.myCompany.consoleApplication.domain.Student;
import ua.myCompany.consoleApplication.excpetions.InvalidEmailFormatException;
import ua.myCompany.consoleApplication.excpetions.WrongClassProvidedException;

import java.util.Objects;

//void methods, mock with mockito
public class StudentValidator {
    public boolean validate(Student student) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (!student.getEmail().matches(regex)) {
            throw new InvalidEmailFormatException("Email format not supported");
        }

        if (Objects.isNull(student)) {
            throw new NullPointerException();
        }

        if (student.getClass() != Student.class) {
            throw new WrongClassProvidedException("Wrong class provided");
        }
        return true;
        //not null, validate if it is not user, mapping, exception if something will go wrong
    }
}
