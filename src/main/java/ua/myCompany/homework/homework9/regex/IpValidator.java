package ua.myCompany.homework.homework9.regex;

public class IpValidator {
    public static boolean ipv4Validator(String ip4) {
        String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";

        return ip4.matches(PATTERN);
    }

    public static boolean ipv6Validator(String ip6) {
        return true;
    }
}
