package ua.myCompany.lessons.lesson9.example3.service;

import java.security.MessageDigest;
import java.util.Arrays;

public class PasswordEncoder {
    public String encode (String password) {
        byte[] plainText = password.getBytes();
        byte[] encodedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");

            md.reset();
            md.update(plainText);
            encodedPassword = md.digest();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < encodedPassword.length; i++) {
                if ((encodedPassword[i] & 0xff) < 0x10) {
                    sb.append("0");
                }

                sb.append(Long.toString(encodedPassword[i] & 0xff, 16));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return Arrays.toString(encodedPassword);
    }
}
