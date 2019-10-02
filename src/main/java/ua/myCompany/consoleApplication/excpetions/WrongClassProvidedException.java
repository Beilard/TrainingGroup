package ua.myCompany.consoleApplication.excpetions;

public class WrongClassProvidedException extends RuntimeException {
    public WrongClassProvidedException(String message) {
        super(message);
    }
}
