package ua.myCompany.consoleApplication.validator;

import ua.myCompany.consoleApplication.domain.Student;
import ua.myCompany.consoleApplication.excpetions.InvalidEmailFormatException;
import ua.myCompany.consoleApplication.excpetions.WrongClassProvidedException;

import java.util.Objects;

//void methods, mock with mockito
public class StudentValidator {
    private static final String REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    public boolean validate(Student student) {
         //private constant; password check
        if (!student.getEmail().matches(REGEX)) {
            throw new InvalidEmailFormatException("Email format not supported");
        }

        if (Objects.isNull(student)) {
            throw new NullPointerException();
        }

        if (student.getClass() != Student.class) {
            throw new WrongClassProvidedException("Wrong class provided");
        }
        return true;
    }
}
