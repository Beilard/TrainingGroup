package ua.myCompany.lessons.lesson6.task4.domain;

public class PhoneNumber {
    private final String countryCode;
    private final String number;

    public PhoneNumber(String number) {
        countryCode = "+38";
        this.number = number;
    }

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;

    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getNumber() {
        return number;
    }
}
